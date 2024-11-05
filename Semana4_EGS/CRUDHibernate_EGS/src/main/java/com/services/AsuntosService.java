package com.services;

import com.dao.AsuntosDAO;
import com.entity.Asuntos;
import com.general.Status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("asuntos")
public class AsuntosService {

    Asuntos asunto = null;
    AsuntosDAO dao = null;

    @Path("mostrar")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    // http://localhost:8095/CRUDHibernate_EGS/CRUDHibernate_EGS/asuntos/mostrar
    public List<Asuntos> mostrar() {
        dao = new AsuntosDAO();
        List<Asuntos> list = dao.mostrar();
        System.out.println("datos:" + list);
        return list;
    }

    @Path("guardar")
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    // http://localhost:8095/CRUDHibernate_EGS/CRUDHibernate_EGS/asuntos/guardar
    public Status guardar(Asuntos a) {

        System.out.println("Asunto a guardar: " + a);
        Status state = new Status();
        state.setOb(a);

        dao = new AsuntosDAO();
        String res = dao.guardar(a);

        if (res.equals("1")) {
            state.setMensaje("Asunto Guardado Exitosamente");
            state.setRespuesta(res);

        } else {

            state.setMensaje("No fue posible guardar");
            state.setRespuesta(res);

        }
        return state;
    }

    @Path("eliminar/{id}")
    @DELETE
    @Produces({ MediaType.APPLICATION_JSON })
    // http://localhost:8095/CRUDHibernate_EGS/CRUDHibernate_EGS/asuntos/eliminar/id
    public Status eliminar(@PathParam("id") int id) {
        Status state = new Status();
        state.setOb(id);
        dao = new AsuntosDAO();
        String res = dao.eliminar(id);
        if (res.equals("1")) {
            state.setMensaje("Asunto Eliminado Exitosamente");
            state.setRespuesta(res);
        } else {
            state.setMensaje("No fue posible eliminar este registro");
            state.setRespuesta(res);
        }

        return state;
    }

    @Path("editar")
    @PUT
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    // http://localhost:8095/CRUDHibernate_EGS/CRUDHibernate_EGS/asuntos/editar
    public Status editar(Asuntos a) {
        Status state = new Status();
        state.setOb(a);

        dao = new AsuntosDAO();
        String res = dao.editar(a);

        if (res.equals("1")) {
            state.setMensaje("Asunto Actualizado Correctamente");
            state.setRespuesta(res);
        } else {
            state.setMensaje("No fue posible actualizar este registro");
            state.setRespuesta(res);
        }
        return state;
    }

    @Path("buscar-por-id/{id}")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    // http://localhost:8095/CRUDHibernate_EGS/CRUDHibernate_EGS/asuntos/buscar-por-id/id
    public Asuntos buscar (@PathParam("id") int id) {
        dao = new AsuntosDAO();
        asunto = (Asuntos) dao.buscar(id);
        System.out.println("Se encontró el registro");
        return asunto;
    }
}
