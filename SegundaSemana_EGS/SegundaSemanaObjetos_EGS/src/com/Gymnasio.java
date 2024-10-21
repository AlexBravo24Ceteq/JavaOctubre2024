package com;

public class Gymnasio {
	
	private String nombre;
	private double mensualidad;
	private boolean hasRegaderas;
	
	public Gymnasio() {
		
	}
	
	public Gymnasio(String nombre, double mensualidad, boolean hasRegaderas) {
		super();
		this.nombre = nombre;
		this.mensualidad = mensualidad;
		this.hasRegaderas = hasRegaderas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMensualidad() {
		return mensualidad;
	}
	public void setMensualidad(double mensualidad) {
		this.mensualidad = mensualidad;
	}
	public boolean isHasRegaderas() {
		return hasRegaderas;
	}
	public void setHasRegaderas(boolean hasRegaderas) {
		this.hasRegaderas = hasRegaderas;
	}

	@Override
	public String toString() {
		return "Gymnasio [nombre=" + nombre + ", mensualidad=" + mensualidad + ", hasRegaderas=" + hasRegaderas + "]";
	}
	
	
	
	
	
}
