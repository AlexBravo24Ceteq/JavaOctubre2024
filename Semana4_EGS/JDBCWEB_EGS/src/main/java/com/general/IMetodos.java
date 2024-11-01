package com.general;

import java.util.List;

public interface IMetodos {

	// Esta va a ser la interface q ue la clase de la lógica ( DAO) va
	// a tener que implementar y resolver
	
	public String guardar (Object ob);
	public String editar (Object ob);
	public String eliminar (int id);
	public Object buscar (int id);
	public List mostrar();
	// No parametrizamos la lista para que cualquier 
	// clase DAO pueda implementarla
	// y recuperar sus objetos (EJ. Alumnos, Carreras, Tutores)

}
