package com;

public class Procesador {

	private String nombre;
	private double frecuencia;
	private int noSerie;
	
	public Procesador() {
		
	}

	public Procesador(String nombre, double frecuencia, int noSerie) {
		super();
		this.nombre = nombre;
		this.frecuencia = frecuencia;
		this.noSerie = noSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getNoSerie() {
		return noSerie;
	}

	public void setNoSerie(int noSerie) {
		this.noSerie = noSerie;
	}

	@Override
	public String toString() {
		return "Procesador [nombre=" + nombre + ", frecuencia=" + frecuencia + ", noSerie=" + noSerie + "]";
	}
	
	
	
}
