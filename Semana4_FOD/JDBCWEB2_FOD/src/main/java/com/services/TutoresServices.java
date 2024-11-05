package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.TutoresDAO;
import com.entity.Tutores;
import com.general.Status;

@Path("tutor")
public class TutoresServices {
	
	TutoresDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8095/JDBCWEB_JABR/JDBCWEB_JABR/alumno/mostrar
	public List<Tutores> mostrar(){
		//este metodo lo univo que hace es iniciar el dao 
		dao = new TutoresDAO();
		List<Tutores> tutores = dao.mostrar();
		return tutores;
		//return dao.mostrar(); mas simplificado 
	}
	@Path("buscar/{id}")
	@GET//vervo http para recueperar recursos
	@Produces({MediaType.APPLICATION_JSON})
	public Tutores buscar (@PathParam ("id") int id) {
		dao = new TutoresDAO();
		//aqui regresamos a un solo alumno de la base de datos 
		return (Tutores) dao.buscar(id);
	}
	
	@Path("guardar")
	@POST // eselverovo http para oublicar nuevos recursos
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) //consuminos info en formato json 
	//http://localhost:8095/JDBCWEB_FOD/JDBCWEB_FOD/alumno/guardar
	public Status guardar (Tutores t) {
		//como vamos a responder con un objeto status lo iniciamos bacio
		Status status = new Status();
		
		status.setOb(t);//respondemos al frente con la info a guardar a la base de datos
		//iniciamos el dao para utilizar el metodo guardar
		dao = new TutoresDAO();
		
		String response = dao.guardar(t);//guardo provicionalmente el valor de este metodo 
		//1 si se guardo este metodo o 0 si es que no
		
		//validamos 
		if (response.equals("1")) {
			//establecemos los valores restantes del objeto status para respondere
			status.setMensage("Tutor guardado exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensage("Error");
			status.setRespuesta(response);
		}
		
		return status;
	
	}
	
	@Path("editar")
	@PUT // es el verovo http para ACTUALIZAR  recursos
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) //consuminos info en formato json 
	//http://localhost:8095/JDBCWEB_FOD/JDBCWEB_FOD/alumno/editar
	public Status editar (Tutores t) {
		//como vamos a responder con un objeto status lo iniciamos bacio
		Status status = new Status();
		
		status.setOb(t);//respondemos al frente con la info a guardar a la base de datos
		//iniciamos el dao para utilizar el metodo guardar
		dao = new TutoresDAO();
		
		String response = dao.editar(t);//guardo provicionalmente el valor de este metodo 
		//"1" si se guardo este metodo o 0 si es que no
		
		//validamos 
		if (response.equals("1")) {
			//establecemos los valores restantes del objeto status para respondere
			status.setMensage("Tutor editado exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensage("Error");
			status.setRespuesta(response);
		}
		
		return status;
	
	}
	
	@Path("eliminar/{id}")
	@DELETE //es un verbo hrrp para eliminar recursos
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8095/JDBCWEB_FOD/JDBCWEB_FOD/alumno/eliminar/id
	public Status eliminar (@PathParam ("id") int id) {
		//como vamos a responder con un objeto status lo iniciamos bacio
		Status status = new Status();
		
		status.setOb(id);//respondemos al frente con la id a eliminar
		dao = new TutoresDAO();
		
		String response = dao.eliminar(id);//guardo provicionalmente el valor de este metodo 
		//"1" si se guardo este metodo o 0 si es que no
		
		//validamos 
		if (response.equals("1")) {
			//establecemos los valores restantes del objeto status para respondere
			status.setMensage("Tutor eliminado exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensage("Error");
			status.setRespuesta(response);
		}
		
		return status;
	
	}

}
