package com;

public class Juguetes {
	private String nombre;
	private double precio;
	private boolean disponibilidad;
	
	public Juguetes() {
		
	}

	public Juguetes(String nombre, double precio, boolean disponibilidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	@Override
	public String toString() {
		return "Juguetes [nombre=" + nombre + ", precio=" + precio + ", disponibilidad=" + disponibilidad + "]";
	}
	
}
