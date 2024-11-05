package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.AsuntoDAO;
import com.entity.Asunto;
import com.general.Status;

@Path("asuntos")// Define el endpoint base para los asuntos
public class AsuntoServices {
	
	Asunto asunto = null;
	AsuntoDAO dao = null;
	
    // Verbo GET -> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/asuntos/mostrar
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Asunto> mostrar(){
		dao = new AsuntoDAO();
		List<Asunto> list = dao.mostrar();
		System.out.println("Datos: " + list);
		return list;
	}
	
    // Verbo POST -> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/asuntos/guardar
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Asunto a) {
		System.out.println("Asunto a guardar: " + a);
		Status status = new Status();
		
		dao = new AsuntoDAO();
		// Verificar si el cliente se está pasando como ID en el JSON
		if (a.getIdCliente() != 0) {
			a.setIdCliente(a.getIdCliente());
		}else {
			status.setMensaje("Id del cliente no proporcionado");
			return status;
		}
		
		String reply = dao.guardar(a);
		
		if ("1".equals(reply)) {
			status.setMensaje("Guardado exitosamente");
			status.setRespuesta(reply);
		}else {
			status.setMensaje("No fue posible guardar" + reply);
			
		}
		return status;
		
	} 
	
    // Verbo DELETE -> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/asuntos/eliminar/1
	@Path("eliminar/{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id) {
		Status status = new Status();
		dao = new AsuntoDAO();
		
		String reply = dao.eliminar(id);
		
		if (reply.equals("1")) {
			status.setMensaje("Eliminado exitosamente");
			status.setRespuesta(reply);
		}else {
			status.setMensaje("No fue posible eliminar este registro");
			status.setRespuesta(reply);
		}
		
		return status;
	}

	// Verbo POST -> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/asuntos/editar
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Asunto a) {
		Status status = new Status();
		
		dao = new AsuntoDAO();
		String reply = dao.editar(a);
		
		if (reply.equals("1")) {
			status.setMensaje("Actualizado exitosamente");
			status.setRespuesta(reply);
		}else {
			status.setMensaje("No fue posible actualizar este registro");
			status.setRespuesta(reply);
		}
		
		return status;
	}
    // Verbo GET -> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/asuntos/buscar-por-id/1
	@Path("buscar-por-id/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Asunto buscar(@PathParam("id") int id){
		dao = new AsuntoDAO();
		asunto = (Asunto) dao.buscar(id);
		System.out.println("Se encontro el registro: " + asunto);
		return asunto;
	}	
	
}
