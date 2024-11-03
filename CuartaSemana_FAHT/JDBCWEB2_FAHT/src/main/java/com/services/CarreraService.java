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

import com.dao.CarrerasDAO;
import com.entity.Carreras;
import com.general.Status;

@Path("Carreras")

public class CarreraService {

	//Esta clase es la capa de servicio y es la que establece la comunicacion web
	//dandole salida o entrada a los datos para poder presentarlos
	//y asi exponer la funcionalidad del backend
		
	//vamos a crear métodos que ejecuten las peticiones http
		
	//Necesitamos un objeto de la clase AlumnoDAO
	CarrerasDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Carreras> mostrar (){
		dao = new CarrerasDAO();
		//List<Carreras> carreras = dao.mostrar();
		return dao.mostrar();
	}
	
	@Path ("buscar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Carreras buscar(@PathParam ("id")int id) {
		dao = new CarrerasDAO();
		//Aqui regresamos a un solo Alumno de la BD
		return (Carreras) dao.buscar(id);
	}
	
	@Path("guardar")
	@POST //Verbo http para publicar nuevos recursos
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) //consumimos info en JSON
	//http://localhost:8095/JDBCWEB_FAHT/JDBCWEB_FAHT/alumno/guardar
		public Status guardar (Carreras a) {
		//como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		status.setOb(a); //respondemos al frente con la info a guardar en BD
		//Iniciamos al dao para utilizar el metodo guardar
		dao = new CarrerasDAO();
		
		String response = dao.guardar(a); //guardo provisionalmente el valor
		//de este metodo recuerden "1" si es que se guardo al alumno o "0" 
		//en caso de que no
		
		//Validamos
		if (response.equals("1")) {
			//Establecemos los valores restantes del objeto status para resónder
			status.setMensaje("Carrera Guardada exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
		}
			
	@Path("editar")
	@PUT //Verbo http para actualizar recursos
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) //consumimos info en JSON
	//http://localhost:8095/JDBCWEB_FAHT/JDBCWEB_FAHT/alumno/editar
		public Status editar (Carreras a) {
		//como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		status.setOb(a); //respondemos al frente con la info a guardar en BD
		//Iniciamos al dao para utilizar el metodo guardar
		dao = new CarrerasDAO();
		
		String response = dao.editar(a); //guardo provisionalmente el valor
		//de este metodo recuerden "1" si es que se guardo al alumno o "0" 
		//en caso de que no
		
		//Validamos
		if (response.equals("1")) {
			//Establecemos los valores restantes del objeto status para resónder
			status.setMensaje("Carrera editada exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
		}
	
	@Path("eliminar/{id}")
	@DELETE //VERBO HTTP PARA ELIMINAR RECURSOS
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8095/JDBCWEB2_FAHT/JDBCWEB2_FAHT/carreras/eliminar/id
		public Status eliminar (@PathParam ("id") int id) {
		//como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		
		status.setOb(id); //respondemos al frente con la info a guardar en BD
		//Iniciamos al dao para utilizar el metodo guardar
		dao = new CarrerasDAO();
		
		String response = dao.eliminar(id); //guardo provisionalmente el valor
		//de este metodo recuerden "1" si es que se elimino al alumno o "0" 
		//en caso de que no
		
		//Validamos
		if (response.equals("1")) {
			//Establecemos los valores restantes del objeto status para resónder
			status.setMensaje("Carrera eliminada exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
		}
	
}// end
