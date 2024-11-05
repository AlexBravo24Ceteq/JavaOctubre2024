package com.general;

import java.util.List;

public interface IMetodos {

	//Esta va a ser la interface de la clase de la lógica
	//Dao va a tener que implementar
	//y resolver
	
	public String guardar (Object ob);
	public String editar (Object ob);
	public String eliminar (int id);
	public Object buscar (int id);
	public List mostrar();
	
	//no parametrizamos la lista para que cualquier
	//clase dao pueda implementarla
	// y recuperar sus obketos (ej. alumnos, carreras, tutores)
	
}//end
