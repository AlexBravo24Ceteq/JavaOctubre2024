package com;

public class Audio {
	private String nombre;
	private String genero;
	private int duracion;
	private int calificacion;
	
//	Constructores. Vacio y con argumentos
	public Audio() {
		
	}
	public Audio(String nombre, String genero, int duracion, int calificacion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.calificacion = calificacion;
	}
	
//	Getters y Setters
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
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
//	Metodo toString
	@Override
	public String toString() {
		return "Audio [nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", calificacion="
				+ calificacion + "]";
	}
}
