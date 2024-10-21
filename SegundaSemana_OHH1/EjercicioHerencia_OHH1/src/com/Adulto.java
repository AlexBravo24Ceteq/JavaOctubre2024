package com;

public class Adulto {

	private String nombre;
	private String genero;
	private int edad;
	
	public Adulto(){
		
	}

	public Adulto(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Adulto [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
}
