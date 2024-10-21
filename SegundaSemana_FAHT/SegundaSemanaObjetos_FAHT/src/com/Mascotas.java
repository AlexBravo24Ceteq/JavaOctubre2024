package com;

public class Mascotas {
// Atributo
	private String animal;
	private double precio;
	private int edad;
	private boolean agresivo;
	
	public Mascotas ( ) { //vacio
	}

	public Mascotas(String animal, double precio, int edad, boolean agresivo) {
		super();
		this.animal = animal;
		this.precio = precio;
		this.edad = edad;
		this.agresivo = agresivo;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isAgresivo() {
		return agresivo;
	}

	public void setAgresivo(boolean agresivo) {
		this.agresivo = agresivo;
	}

	@Override
	public String toString() {
		return "Mascotas [animal=" + animal + ", precio=" + precio + ", edad=" + edad + ", agresivo=" + agresivo + "]";
	}
	
	
	
}
