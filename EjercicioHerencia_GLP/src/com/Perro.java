package com;

public class Perro extends Animal{
	
	private String raza;
	private String color;
	
	public Perro() {}

	public Perro(String nombre, int edad, String tipo, String raza, String color) {
		super(nombre, edad, tipo);
		this.raza = raza;
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", toString()=" + super.toString() + "]";
	}


	
	
	
	
	

}
