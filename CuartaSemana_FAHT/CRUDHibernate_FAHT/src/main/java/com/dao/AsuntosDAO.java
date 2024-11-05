package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Asuntos;
import com.general.Metodos;

public class AsuntosDAO implements Metodos {
	
	//Carga los objetos (las clases definidas en el persistence)
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
		//Carga todas las operaciones (insert, update, delete,select, contar, etc)
		EntityManager em = emf.createEntityManager();
		Asuntos asuntos = null;

	@Override
	public String guardar(Object ob) {
		asuntos = (Asuntos) ob;
		em.getTransaction().begin();
		String resultado= null;
		try {
			em.persist(asuntos);//Este es el insert
			em.getTransaction().commit();
			resultado ="1";
			System.out.println("Registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();//Es importante cerrar el EntityManager para liberar memoria
		return resultado;
	}
	@Override
	public String editar(Object ob) {
		asuntos = (Asuntos) ob;
		Asuntos asuntosdb = em.find(Asuntos.class, asuntos.getAsuntosId());
		String r = null;
		em.getTransaction().begin();
		try {
			asuntosdb.setNombre(asuntos.getNombre());
			asuntosdb.setFechainicio(asuntos.getFechainicio());
			asuntosdb.setFechafin(asuntos.getFechafin());
			asuntosdb.setEstado(asuntos.getEstado());
			asuntosdb.setClienteId(asuntos.getAsuntosId());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No pudo editar"); 
			r=e.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {
		String r = null;
		asuntos = em.find(Asuntos.class, id);
		em.getTransaction().begin();
		try {
			em.remove(asuntos);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r="1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No s epudo eliminar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {
		asuntos = em.find(Asuntos.class, id);
		return asuntos;
	}

	@Override
	public List mostrar() {
		List<Asuntos> ls = em.createQuery("from Asuntos").getResultList();
		return ls;
	}

}
