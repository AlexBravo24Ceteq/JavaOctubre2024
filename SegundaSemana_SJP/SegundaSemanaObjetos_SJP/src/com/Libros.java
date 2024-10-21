package com;

public class Libros {
	
	private String nombre;
	private String genero;
	private int precio;
	private boolean disponible;
	
	public Libros() {
		
	}

	public Libros(String nombre, String genero, int precio, boolean disponible) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
		this.disponible = disponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Libros [Nombre=" + nombre + ", Genero=" + genero + ", Precio=" + precio + ", Disponible=" + disponible
				+ "]";
	}
	
}
