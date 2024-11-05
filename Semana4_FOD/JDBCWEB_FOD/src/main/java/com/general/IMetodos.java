package com.general;

import java.util.List;

public interface IMetodos {
	//esta va a ser la interface de la clase de la logica del DAO va atener que implementar y resolver
	
	public String guardar (Object ob);
	public String editar (Object ob);
	public String eliminar (int id);
	public Object buscar (int id);
	public List mostrar();
	//no parametrizamos la lista para cualquier clase dao
	//pueda implementarla y recuperar susu objetos
	//ejemplo alumnos, tutores, carreras, etc.

}
