package com;

public abstract class Calculadora {

	private String marca;
	private String modelo;
	private String color;
	private double precio;
	
	public Calculadora() {}

	public Calculadora(String marca, String modelo, String color, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + "]";
	}
	
	public abstract int sumar( int a, int b);
	public abstract int sumar( int a, int b, int c);
	public abstract void sumar();
	
	public abstract int restar(int a, int b);
	public abstract int restar( int a, int b, int c);
	public abstract void restar();
	
	public abstract double multiplicar(int a, int b);
	public abstract double multiplicar( int a, int b, int c);
	public abstract void multiplicar();
	
	public abstract double dividir(int a, int b);
	public abstract double dividir( int a, int b, int c);
	public abstract void dividir();
	
}
