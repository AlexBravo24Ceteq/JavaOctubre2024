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

import com.dao.AlumnoDAO;
import com.dto.DetallesDTO;
import com.entity.Alumno;
import com.general.Status;

@Path("alumno")// la anotacion path nos permite crear partes de l endpoint o url que ejecutara los 
//metodos o peticiones http
public class AlumnoService {
	//esta clase es la capa se servicio y es la que establece la comunicacion web dandole salida o entrada a los datos 
	//para poder presentarlos y asi exponer la fumcionalidad del backend
	//bamos a crear metodos que ejecuten las peticiones http
	//necesitamos un objeto de la clase AlumnoDAO 
	
	AlumnoDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8095/JDBCWEB_JABR/JDBCWEB_JABR/alumno/mostrar
	public List<Alumno> mostrar(){
		//este metodo lo univo que hace es iniciar el dao 
		dao = new AlumnoDAO();
		List<Alumno> alumnos = dao.mostrar();
		return alumnos;
		//return dao.mostrar(); mas simplificado 
	}
	@Path("buscar/{id}")
	@GET//vervo http para recueperar recursos
	@Produces({MediaType.APPLICATION_JSON})
	public Alumno buscar (@PathParam ("id") int id) {
		dao = new AlumnoDAO();
		//aqui regresamos a un solo alumno de la base de datos 
		return (Alumno) dao.buscar(id);
	}
	
	@Path("guardar")
	@POST // eselverovo http para oublicar nuevos recursos
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) //consuminos info en formato json 
	//http://localhost:8095/JDBCWEB_FOD/JDBCWEB_FOD/alumno/guardar
	public Status guardar (Alumno a) {
		//como vamos a responder con un objeto status lo iniciamos bacio
		Status status = new Status();
		
		status.setOb(a);//respondemos al frente con la info a guardar a la base de datos
		//iniciamos el dao para utilizar el metodo guardar
		dao = new AlumnoDAO();
		
		String response = dao.guardar(a);//guardo provicionalmente el valor de este metodo 
		//1 si se guardo este metodo o 0 si es que no
		
		//validamos 
		if (response.equals("1")) {
			//establecemos los valores restantes del objeto status para respondere
			status.setMensage("Alumno guardado exitosamente");
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
	public Status editar (Alumno a) {
		//como vamos a responder con un objeto status lo iniciamos bacio
		Status status = new Status();
		
		status.setOb(a);//respondemos al frente con la info a guardar a la base de datos
		//iniciamos el dao para utilizar el metodo guardar
		dao = new AlumnoDAO();
		
		String response = dao.editar(a);//guardo provicionalmente el valor de este metodo 
		//"1" si se guardo este metodo o 0 si es que no
		
		//validamos 
		if (response.equals("1")) {
			//establecemos los valores restantes del objeto status para respondere
			status.setMensage("Alumno editado exitosamente");
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
		dao = new AlumnoDAO();
		
		String response = dao.eliminar(id);//guardo provicionalmente el valor de este metodo 
		//"1" si se guardo este metodo o 0 si es que no
		
		//validamos 
		if (response.equals("1")) {
			//establecemos los valores restantes del objeto status para respondere
			status.setMensage("Alumno eliminado exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensage("Error");
			status.setRespuesta(response);
		}
		
		return status;
	
	}
	
	@Path("detalles")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8095/JDBCWEB_JABR/JDBCWEB_JABR/alumno/detalles
	public List<DetallesDTO> detalles(){
		//este metodo lo univo que hace es iniciar el dao 
		dao = new AlumnoDAO();
		//List<DetallesDTO> alumnos = dao.mostrar();
		//return alumnos;
		return dao.detalles();  
	}
	
}
