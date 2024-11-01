package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Asuntos;
import com.general.Metodos;

public class AsuntosDAO implements Metodos {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	
	EntityManager em = emf.createEntityManager();
	Asuntos asunto = null;
	
	@Override
	public String guardar(Object ob) {
		asunto = (Asuntos) ob;
		em.getTransaction().begin();
		String resultado = null;

		try {

			em.persist(asunto); // Este es el insert
			em.getTransaction().commit();
			resultado = "1";

			System.out.println("Registro insertado");

		} catch (Exception e) {

			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");

		}

		em.close(); // Es importante cerrar el EntityManager para liberar memoria
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		asunto = (Asuntos) ob;
		Asuntos asuntoDB = em.find(Asuntos.class, asunto.getAsuntoId());
		String r = null;
		em.getTransaction().begin();
		try {
			asuntoDB.setNombre(asunto.getNombre());
			asuntoDB.setFechaInicio(asunto.getFechaInicio());
			asuntoDB.setFechaFin(asunto.getFechaFin());
			asuntoDB.setEstado(asunto.getEstado());
			asuntoDB.setClienteId(asunto.getClienteId());
			em.getTransaction().commit();
			System.out.println("Asunto Editado correctamente");
			r = "1";
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r = null;
		asunto = em.find(Asuntos.class, id);
		em.getTransaction().begin();
		try {
			em.remove(asunto);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el Asunto");
			r = "1";
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		asunto = em.find(Asuntos.class, id);
		return asunto;
	}

	@Override
	public List mostrar() {
		List<Asuntos> lsA = em.createQuery("from Asuntos").getResultList();
		return lsA;
	}
	
	

}
