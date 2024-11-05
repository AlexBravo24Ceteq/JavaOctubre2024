package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.dto.AsuntoClienteDTO;
import com.general.IAsuntoCliente;

public class AsuntoClienteDAO implements IAsuntoCliente {
	

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
    EntityManager em = emf.createEntityManager();
	AsuntoClienteDTO asunto = null; 

	@Override
	public Object buscarPorId(int id) {
		em = emf.createEntityManager();

		// Buscar el Asunto por su ID
		try {
		asunto = em.find(AsuntoClienteDTO.class, id);
		if (asunto != null) {
			System.out.println("Asunto encontrado: " + asunto);
		}else {
			System.out.println("Asunto no encontrado con ID: " + id);
			}
		}finally {
			em.close();
		}
		return asunto;
	}

	@Override
	 public List<AsuntoClienteDTO> mostrarTodo() {
        List<AsuntoClienteDTO> asuntos = null;
        try {
            // Crear una consulta de tipo SELECT para obtener todos los registros de Asunto
            TypedQuery<AsuntoClienteDTO> query = em.createQuery("SELECT a FROM AsuntoClienteDTO a", AsuntoClienteDTO.class);
            asuntos = query.getResultList();  // Obtener la lista de resultados
            System.out.println("Lista de asuntos obtenida exitosamente");
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de asuntos: " + e.getMessage());
        }
        return asuntos;  // Retornar la lista de Asunto, o null si ocurrió un error
    }


}
