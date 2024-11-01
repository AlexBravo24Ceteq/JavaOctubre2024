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
import com.dao.CarreraDAO;
import com.entity.Carrera;
import com.general.Status;

@Path("carreras")
public class CarrerasService {
	
	CarreraDAO dao = null;

	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON}) 
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/carreras/mostrar
	public List<Carrera> mostrar() {
		
		dao = new CarreraDAO();
		return dao.mostrar();
	}
	
	@Path("buscar/{id}")
	@GET 
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/carreras/buscar/id
	public Carrera buscar(@PathParam ("id") int id) {
		dao = new CarreraDAO();
		return (Carrera) dao.buscar(id);
	}
	
	@Path("guardar")
	@POST 
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/carreras/guardar
	public Status guardar (Carrera c) {
		
		Status status = new Status();
		
		status.setOb(c);
		
		dao = new CarreraDAO();
		String response = dao.guardar(c);
		
		if (response.equals("1")) {
			status.setMensaje("Carrera guardada Exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
	}
	
	@Path("editar")
	@PUT 
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/carreras/editar
	public Status editar (Carrera c) {
		
		Status status = new Status();
		
		status.setOb(c); 
		
		dao = new CarreraDAO();
		String response = dao.editar(c);
		
		if (response.equals("1")) {
			status.setMensaje("Carrera Editada Exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
	}
	
	@Path("eliminar/{id}")
	@DELETE 
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8095/JDBCWEB_EGS/JDBCWEB_EGS/carreras/eliminar/id
	public Status eliminar (@PathParam ("id") int id) {
		
		Status status = new Status();
		
		status.setOb(id); 
		dao = new CarreraDAO();
		
		String response = dao.eliminar(id);
		
		
		if (response.equals("1")) {
			status.setMensaje("Carrera Eliminada Exitosamente");
			status.setRespuesta(response);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(response);
		}
		return status;
	}
}
