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

@Path ("alumno") // la notacion path nos permite crear partes del endpoint 
//o URL que ejecutará los métodos y peticiones http
public class AlumnoService {
	
	//Esta clase es la capa de servicio y es la que establece la comunicacion web
	//dandole salida o entrada a los datos para poder presentarlos
	//y asi exponer la funcionalidad del backend
	
	//vamos a crear métodos que ejecuten las peticiones http
	
	//Necesitamos un objeto de la clase AlumnoDAO
	AlumnoDAO dao = null;
	
	@Path ("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})//indicamos que esta accion prodice info
	//en formato json
	//http://localhost:8095/JDBCWEB_FAHT/JDBCWEB_FAHT/alumno/mostrar
	public List<Alumno> mostrar(){
		//Iniciamos el dao
		dao= new AlumnoDAO ();
		//List<Alumno> alumnos = dao.mostrar();
		return dao.mostrar();
	}
	//http://localhost:8095/JDBCWEB_FAHT/JDBCWEB_FAHT/alumno/buscar/id
	@Path ("buscar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Alumno buscar(@PathParam ("id")int id) {
		dao = new AlumnoDAO();
		//Aqui regresamos a un solo Alumno de la BD
		return (Alumno) dao.buscar(id);
	}
	
	@Path("guardar")
	@POST //Verbo http para publicar nuevos recursos
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) //consumimos info en JSON
	//http://localhost:8095/JDBCWEB_FAHT/JDBCWEB_FAHT/alumno/guardar
		public Status guardar (Alumno a) {
		//como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		status.setOb(a); //respondemos al frente con la info a guardar en BD
		//Iniciamos al dao para utilizar el metodo guardar
		dao = new AlumnoDAO();
		
		String response = dao.guardar(a); //guardo provisionalmente el valor
		//de este metodo recuerden "1" si es que se guardo al alumno o "0" 
		//en caso de que no
		
		//Validamos
		if (response.equals("1")) {
			//Establecemos los valores restantes del objeto status para resónder
			status.setMensaje("Alumno Guardado exitosamente");
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
		public Status editar (Alumno a) {
		//como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		status.setOb(a); //respondemos al frente con la info a guardar en BD
		//Iniciamos al dao para utilizar el metodo guardar
		dao = new AlumnoDAO();
		
		String response = dao.editar(a); //guardo provisionalmente el valor
		//de este metodo recuerden "1" si es que se guardo al alumno o "0" 
		//en caso de que no
		
		//Validamos
		if (response.equals("1")) {
			//Establecemos los valores restantes del objeto status para resónder
			status.setMensaje("Alumno editado exitosamente");
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
	//http://localhost:8095/JDBCWEB_FAHT/JDBCWEB_FAHT/alumno/eliminar/id
		public Status eliminar (@PathParam ("id") int id) {
		//como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		
		status.setOb(id); //respondemos al frente con la info a guardar en BD
		//Iniciamos al dao para utilizar el metodo guardar
		dao = new AlumnoDAO();
		
		String response = dao.eliminar(id); //guardo provisionalmente el valor
		//de este metodo recuerden "1" si es que se elimino al alumno o "0" 
		//en caso de que no
		
		//Validamos
		if (response.equals("1")) {
			//Establecemos los valores restantes del objeto status para resónder
			status.setMensaje("Alumno eliminado exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
		}
	
	@Path ("detalles")
	@GET
	@Produces({MediaType.APPLICATION_JSON})//indicamos que esta accion prodice info
	//en formato json
	//http://localhost:8095/JDBCWEB_FAHT/JDBCWEB_FAHT/alumno/detalles
	public List<DetallesDTO> detalles(){
		//Iniciamos el dao
		dao= new AlumnoDAO ();
		//List<Alumno> alumnos = dao.mostrar();
		return dao.detalles();
	}
	
	
}//end
