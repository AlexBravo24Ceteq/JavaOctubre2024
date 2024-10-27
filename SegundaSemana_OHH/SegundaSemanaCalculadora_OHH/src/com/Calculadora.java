package com;

public abstract class Calculadora {
	private String nombre;
	private String color;
	private double precio;
	
//	constructores vacio y con argumentos
	public Calculadora() {
	
	}

	public Calculadora(String nombre, String color, double precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
	}
	
//	gettters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
//	toString
	@Override
	public String toString() {
		return "Calculadora [nombre=" + nombre + ", color=" + color + ", precio=" + precio + "]";
	}
	
//	métodos abstractos sumar, restar, dividir y multiplicar
	public abstract double sumar(double n1, double n2);
	public abstract double restar(double n1, double n2);
	public abstract double dividir(double n1, double n2);
	public abstract double multiplicar(double n1, double n2);
	
}
