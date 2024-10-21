package com;

public abstract class Calculadora {
	
	private String marca;
	private String modelo;
	private String color;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public Calculadora(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "\nCalculadora [marca = " + marca + ", modelo = " + modelo + ", color = " + color + "]";
	}
	
	public abstract double sumar();
	
	public abstract double restar();
	
	public abstract double multiplicar();
	
	public abstract double dividir();
	
	public abstract void sumar1();
	
	public abstract void restar1();
	
	public abstract void multiplicar1();
	
	public abstract void dividir1();
	

	

	
	
	
	

}
