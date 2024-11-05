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

import com.dao.ClienteDAO;
import com.entity.Cliente;
import com.general.Status;

@Path("clientes")
public class ClienteService {
	
	Cliente cliente = null;
	ClienteDAO dao = null;
	//verbo GET-> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/clientes/mostrar
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Cliente> mostrar(){
		dao = new ClienteDAO();
		List<Cliente> list = dao.mostrar();
		System.out.println("datos" + list);
		return list;
		
	}
	//verbo POST-> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/clientes/guardar
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Cliente c){
		System.out.println("Cliente a guardar: " + c);
		Status stat = new Status();
		stat.setOb(c);
		
		dao = new ClienteDAO();
		String res = dao.guardar(c);
		
		if (res.equals("1")) {
			stat.setMensaje("Guardado exitosamente");
			stat.setRespuesta(res);
		}else {
			stat.setMensaje("No fue posible guardar");
			stat.setRespuesta(res);
		}
		
		return stat;
		
	}
	//verbo DELETE-> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/clientes/eliminar/-39
	@Path("eliminar/{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id){
		Status stat = new Status();
		stat.setOb(id);
		
		dao = new ClienteDAO();
		String res = dao.eliminar(id);
		
		if (res.equals("1")) {
			stat.setMensaje("Eliminado exitosamente");
			stat.setRespuesta(res);
		}else {
			stat.setMensaje("No fue posible eliminar este registro");
			stat.setRespuesta(res);
		}
		
		return stat;
		
	}
	//verbo POST-> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/clientes/editar
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Cliente c){
		Status stat = new Status();
		stat.setOb(c);
		
		dao = new ClienteDAO();
		String res = dao.editar(c);
		
		if (res.equals("1")) {
			stat.setMensaje("Actualizado exitosamente");
			stat.setRespuesta(res);
		}else {
			stat.setMensaje("No fue posible actualizar este registro");
			stat.setRespuesta(res);
		}
		
		return stat;
		
	}
	//verbo GET-> http://localhost:8095/CRUDHibernate_FOD/CRUDHibernate_FOD/clientes/buscar-por/20
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Cliente buscar(@PathParam("id") int id){
		dao = new ClienteDAO();
		cliente = (Cliente) dao.buscar(id);
		System.out.println("Se encontro el registro");
		return cliente;
		
	}
	
}
