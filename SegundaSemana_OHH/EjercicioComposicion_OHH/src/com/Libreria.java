package com;

public class Libreria {
	private String nombreLibreria;
	private String direccionLibreria;
	private boolean disponibilidad;
	private int librosDisponibles;
	
	private Libro datosLibro;
	private Editorial datosEditorial;
	private Distribuidor datosDistribuidor;
	
//	constructor vacio y con argumentos
	public Libreria() {
		
	}

	public Libreria(String nombreLibreria, String direccionLibreria, boolean disponibilidad, int librosDisponibles,
			Libro datosLibro, Editorial datosEditorial, Distribuidor datosDistribuidor) {
		super();
		this.nombreLibreria = nombreLibreria;
		this.direccionLibreria = direccionLibreria;
		this.disponibilidad = disponibilidad;
		this.librosDisponibles = librosDisponibles;
		this.datosLibro = datosLibro;
		this.datosEditorial = datosEditorial;
		this.datosDistribuidor = datosDistribuidor;
	}
//	getters y setters
	
	public String getNombreLibreria() {
		return nombreLibreria;
	}
	
	public void setNombreLibreria(String nombreLibreria) {
		this.nombreLibreria = nombreLibreria;
	}
	
	public String getDireccionLibreria() {
		return direccionLibreria;
	}
	
	public void setDireccionLibreria(String direccionLibreria) {
		this.direccionLibreria = direccionLibreria;
	}
	
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public int getLibrosDisponibles() {
		return librosDisponibles;
	}
	
	public void setLibrosDisponibles(int librosDisponibles) {
		this.librosDisponibles = librosDisponibles;
	}
	
	public Libro getDatosLibro() {
		return datosLibro;
	}
	
	public void setDatosLibro(Libro datosLibro) {
		this.datosLibro = datosLibro;
	}
	
	public Editorial getDatosEditorial() {
		return datosEditorial;
	}
	
	public void setDatosEditorial(Editorial datosEditorial) {
		this.datosEditorial = datosEditorial;
	}
	
	public Distribuidor getDatosDistribuidor() {
		return datosDistribuidor;
	}
	
	public void setDatosDistribuidor(Distribuidor datosDistribuidor) {
		this.datosDistribuidor = datosDistribuidor;
	}
	
	@Override
	public String toString() {
		return "----Datos de la librería.----\nNombre: " + nombreLibreria + "\nDirección " + direccionLibreria
				+ "\nDisponibilidad: " + disponibilidad + "\nNúmero de libros en tienda: " + librosDisponibles + "\n----Datos del libro.----"
				+ datosLibro + "\n----Datos de la editorial.----" + datosEditorial + "\n----Datos del distribuidor----" + datosDistribuidor + "]";
	}
	

}
