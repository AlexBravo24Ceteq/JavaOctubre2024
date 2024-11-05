package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Cliente;
import com.general.IMetodos;

public class ClienteDAO implements IMetodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Cliente cliente = null; 

	@Override
	public String guardar(Object ob) {
		
		cliente = (Cliente)ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(cliente);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
			
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		cliente = (Cliente)ob;
		Cliente clientedb = em.find(Cliente.class, cliente.getClienteId());
		String r = null;
		em.getTransaction().begin();
		try {
			clientedb.setNombre(cliente.getNombre());
			clientedb.setDireccion(cliente.getDireccion());
			clientedb.setTelefono(cliente.getTelefono());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
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
		cliente = em.find(Cliente.class, id);
		em.getTransaction().begin();
		try {
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}

		return r;
	}

	@Override
	public Cliente buscar(int id) {
		try {
	        return em.find(Cliente.class, id);
	    } catch (Exception e) {
	        // Manejo de excepciones, loguea el error o lanza una excepción personalizada
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public List mostrar() {
		List<Cliente> list = em.createQuery("from Cliente").getResultList();

		return list;
	}
	
	//JDBC nativo nos permite desarrollar mas lentamente una a´licacion al tener que formular las seciencias sql y
	//con mas lineas de codigo pero la respuesta del servicor hacia enfrente es mas rapida
	//Hibernet utilizar frameworks como hibernet permite una forma de desarrollo mas rapida 
	//pero una respuesta mas lenta en la peticion del servidor 
	
	

}
