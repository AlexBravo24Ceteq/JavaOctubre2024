package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import com.entity.Asunto;
import com.general.IMetodos;

public class AsuntoDAO implements IMetodos{
	
    // EntityManagerFactory para crear y administrar EntityManager (conexiones a la base de datos)
	private EntityManagerFactory emf;

    // Constructor inicializa el EntityManagerFactory con la unidad de persistencia "Tables"
    public AsuntoDAO() {
        emf = Persistence.createEntityManagerFactory("Tables");
    }
    
    // Instancia de Asunto utilizada en los métodos
     Asunto asunto = null; 
     
	@Override
	public String guardar(Object ob) {
		
        // Convertir el objeto recibido a tipo Asunto
		asunto = (Asunto) ob;
		String resultado;
		
        // Iniciar la transacción
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(asunto);//Guarda el asunto, -> Persistir el objeto Asunto en la base de datos
			em.getTransaction().commit();// Confirmar la transacción
			resultado ="1";// Indicar éxito
			System.out.println("Asunto guardado exitosamente");
		} catch (Exception e) {
			em.getTransaction().rollback(); // Revertir en caso de error
			resultado = e.getMessage();// Guardar el mensaje de error
			System.out.println("Error al guardar el asunto: " + e.getMessage());
		}finally {
			if (em.isOpen()) {
	            em.close(); // Cerrar EntityManager
	        }
		}

		return resultado;
	}

	@Override
	public String editar(Object ob) {
		// Convertir el objeto recibido a tipo Asunto
		asunto = (Asunto) ob;
		String resultado = null;
		
		// Iniciar la transacción
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		try {
			em.merge(asunto);//actualiza el asunto, // Actualizar el objeto Asunto existente en la base de datos
			em.getTransaction().commit();// Confirmar la transacción
			resultado = "1";
			System.out.println("Asunto actualizado exitosamente");
		} catch (Exception e) {
			em.getTransaction().rollback();// Revertir en caso de error
			resultado = e.getMessage();// Guardar el mensaje de error
			System.out.println("Error al actualizar el asunto: " + e.getMessage());
		
		}
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String resultado = null;
		
		EntityManager em = emf.createEntityManager();

		asunto = em.find(Asunto.class, id);// Busca el Asunto por su ID antes de eliminarlo
		if (asunto != null) {// Si el Asunto existe
			em.getTransaction().begin();// Iniciar la transacción
			try {
				em.remove(asunto);// Eliminar el objeto Asunto de la base de datos
				em.getTransaction().commit(); // Confirmar la transacción
				resultado ="1";
				System.out.println("Asunto eliminado exitosamente");
			} catch (Exception e) {
				em.getTransaction().rollback();// Revertir en caso de error
				resultado = e.getMessage();// Guardar el mensaje de error
				System.out.println("Error al eliminar el asunto: " + e.getMessage());	
			}finally {
				em.close();
			}
		}else {
			resultado = "Asunto no encontrado";
			System.out.println("Asunto no encontrado para eliminar");// Mensaje si el Asunto no existe
			
		}
		
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		EntityManager em = emf.createEntityManager();

		// Buscar el Asunto por su ID
		try {
		asunto = em.find(Asunto.class, id);
		if (asunto != null) {
			System.out.println("Asunto encontrado: " + asunto);
		}else {
			System.out.println("Asunto no encontrado con ID: " + id);
			}
		}finally {
			em.close();
		}
		return asunto;// Retornar el objeto Asunto encontrado, o null si no existe
	}

	@Override
	public List<Asunto> mostrar() {
		EntityManager em = emf.createEntityManager();
		List<Asunto> asuntos = null;

		try {
			// Crear una consulta de tipo SELECT para obtener todos los registros de Asunto
			TypedQuery<Asunto> query = em.createQuery("SELECT a FROM Asunto a", Asunto.class);
			asuntos = query.getResultList();// Obtener la lista de resultados
			System.out.println("Lista de asuntos ontenida exitosamente");
		} catch (Exception e) {
			System.out.println("Error al obtener la lista de asuntos:" + e.getMessage());
		}finally {
			em.close();
		}
		
		return asuntos;// Retornar la lista de Asunto, o null si ocurrió un error
	}
	 public void close() {
	        if (emf != null && emf.isOpen()) {
	            emf.close();
	        }
	    }

	

}
