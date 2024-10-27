package com;

public class Libro {
	private String nombreLibro;
	private String genero;
	private String editorial;
	private double precio;
	private int librosDisponibles;
	private boolean disponibilidad;
	
//	Constructores vacio y con argumentos
	public Libro() {
		
	}
	public Libro(String nombreLibro, String genero, String editorial, double precio, int librosDisponibles,
			boolean disponibilidad) {
		super();
		this.nombreLibro = nombreLibro;
		this.genero = genero;
		this.editorial = editorial;
		this.precio = precio;
		this.librosDisponibles = librosDisponibles;
		this.disponibilidad = disponibilidad;
	}
	
//	getters y setters
	public String getNombreLibro() {
		return nombreLibro;
	}
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getLibrosDisponibles() {
		return librosDisponibles;
	}
	public void setLibrosDisponibles(int librosDisponibles) {
		this.librosDisponibles = librosDisponibles;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
//	toString
	@Override
	public String toString() {
		return "Libro [nombreLibro=" + nombreLibro + ", genero=" + genero + ", editorial=" + editorial + ", precio="
				+ precio + ", librosDisponibles=" + librosDisponibles + ", disponibilidad=" + disponibilidad + "]";
	} 
}
