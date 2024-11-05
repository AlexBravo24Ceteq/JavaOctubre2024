package com.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.AsuntoClienteDAO;
import com.dto.AsuntoClienteDTO;

@Path("asuntosCliente")// Define el endpoint base para los asuntos
public class AsuntoClienteServices {
	AsuntoClienteDTO asunto = null;
	AsuntoClienteDAO daoAC = null;
	
	// Verbo GET -> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/asuntosCliente/mostrarTodo
		@Path("mostrarTodo")
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public List<AsuntoClienteDTO> mostrarTodo() {
	        daoAC = new AsuntoClienteDAO();
	        List<AsuntoClienteDTO> list = daoAC.mostrarTodo();
	        System.out.println("Datos: " + list);
	        return list;
	    }
		
		// Verbo GET -> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/asuntos/buscarPorId/1
		@Path("buscarPorId/{id}")
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public AsuntoClienteDTO buscarPorId(@PathParam("id") int id){
			daoAC = new AsuntoClienteDAO();
			asunto = (AsuntoClienteDTO) daoAC.buscarPorId(id);
			System.out.println("Se encontro el registro: " + asunto);
			return asunto;
		}

}
