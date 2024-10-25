package com;

public class Lozas {
//Atributos
	private String nombre;
	private String color;
	private double precio;
	private boolean produccion;
	
	public Lozas ( ) { //vacio
	}

	public Lozas(String nombre, String color, double precio, boolean produccion) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
		this.produccion = produccion;
	}

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

	public boolean isProduccion() {
		return produccion;
	}

	public void setProduccion(boolean produccion) {
		this.produccion = produccion;
	}

	@Override
	public String toString() {
		return "Lozas [nombre=" + nombre + ", color=" + color + ", precio=" + precio + ", produccion=" + produccion
				+ "]";
	}
	
	
}
