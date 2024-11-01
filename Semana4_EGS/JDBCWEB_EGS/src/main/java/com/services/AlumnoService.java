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

@Path("alumno") // La anotacion path nos permite crear partes del endpoint
// o URL que ejecutara los metodos y peticiones HTTP

public class AlumnoService {

	// Esta es la capa de servicio y es la que establece
	// la comunicacion web dandole salida o entrada a los
	// datos para poder presentarlos
	// y así exponer la funcionalidad del backend

	// Vamos a crear métodos que ejecuten las peticiones
	// http

	// Necesitamos un objeto de la clase AlumnoDAO
	AlumnoDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON}) // Indicamos que esta accion produce info
	// en formato JSON
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/alumno/mostrar
	public List<Alumno> mostrar() {
		//INICIAMOS EL DAO
		dao = new AlumnoDAO();
		//List<Alumno> alumnos = dao.mostrar();
		return dao.mostrar();
	}
	
	@Path("buscar/{id}")
	@GET // Verbo HTTP para recuperar recursos
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/alumno/buscar/id
	public Alumno buscar(@PathParam ("id") int id) {
		dao = new AlumnoDAO();
		// Aqui regresamos a un solo alumno de la BD
		return (Alumno) dao.buscar(id);
	}
	
	@Path("guardar")
	@POST // Verbo HTTP para publicar nuevos recursos
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/alumno/guardar
	public Status guardar (Alumno a) {
		// Como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		
		status.setOb(a); // Respondemos al frente con la info a guardar en la BD
		
		// Iniciamos al DAO para utilizar el método guardad
		dao = new AlumnoDAO();
		String response = dao.guardar(a);// Guardo provisionalmente el valor
		// de este metodo, recuerden "1" si es que se guardo el alumno o "0"
		// en caso de que no
		
		// Validamos
		if (response.equals("1")) {
			status.setMensaje("Alumno Guardado Exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
	}
	
	@Path("editar")
	@PUT // Verbo HTTP para actualizar recursos
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/alumno/editar
	public Status editar (Alumno a) {
		// Como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		
		status.setOb(a); // Respondemos al frente con la info a editar en la BD
		
		// Iniciamos al DAO para utilizar el método guardad
		dao = new AlumnoDAO();
		String response = dao.editar(a);// Guardo provisionalmente el valor
		// de este metodo, recuerden "1" si es que se edita el alumno o "0"
		// en caso de que no
		
		// Validamos
		if (response.equals("1")) {
			status.setMensaje("Alumno Editado Exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
	}
	
	@Path("eliminar/{id}")
	@DELETE // Verbo HTTP para eliminar recursos
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/alumno/eliminar/id
	public Status eliminar (@PathParam ("id") int id) {
		// Como vamos a responder con un objeto Status lo iniciamos vacio
		Status status = new Status();
		status.setOb(id); // Respondemos al frente con el id a eliminar
		dao = new AlumnoDAO();
		String response = dao.eliminar(id);// Guardo provisionalmente el valor
		// de este metodo, recuerden "1" si es que se elimino alumno o "0"
		// en caso de que no
		
		// Validamos
		if (response.equals("1")) {
			status.setMensaje("Alumno Eliminado Exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
	}
	
	@Path("detalles")
	@GET
	@Produces({MediaType.APPLICATION_JSON}) // Indicamos que esta accion produce info
	// en formato JSON
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/alumno/detalles
	public List<DetallesDTO> detalles() {
		//INICIAMOS EL DAO
		dao = new AlumnoDAO();
		//List<Alumno> alumnos = dao.mostrar();
		return dao.detalles();
	}
}
