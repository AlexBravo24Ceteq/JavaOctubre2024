package com;

public class Procesador {
	private String marca;
	private String modelo;
	private double frecuencia;
	
	public Procesador () {
		
	}

	public Procesador(String marca, String modelo, double frecuencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.frecuencia = frecuencia;
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

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", frecuencia=" + frecuencia + "]";
	}
	
	

}


	
