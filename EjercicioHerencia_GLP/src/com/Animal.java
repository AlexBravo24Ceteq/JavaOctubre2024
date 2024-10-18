package com;

public class Animal {

	private String nombre;
	private int edad;
	private String tipo;
	
	
	public Animal() {}

	public Animal(String nombre, int edad, String tipo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	@Override
	public String toString() {
		return "Animal [nombre=" + nombre 
				+ ", edad=" + edad 
				+ ", tipo=" + tipo + "]";
	}
	
	
}
