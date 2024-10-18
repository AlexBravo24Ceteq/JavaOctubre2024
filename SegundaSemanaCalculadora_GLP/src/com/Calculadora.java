package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private String lenguaje;
	
	public Calculadora() {}

	public Calculadora(String marca, String color, String lenguaje) {
		super();
		this.marca = marca;
		this.color = color;
		this.lenguaje = lenguaje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca 
				+ ", color=" + color 
				+ ", lenguaje=" + lenguaje + "]";
	}
	
	public abstract double sumar();
	
	public abstract double restar();
	
	public abstract double multiplicar();
	
	public abstract double dividir();
	
	

}
