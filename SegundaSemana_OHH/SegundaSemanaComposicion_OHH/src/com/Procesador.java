package com;

public class Procesador {
	private String marca;
	private String modelo;
	private int frecuencia;
	
//	constructor vacio y con argumentos
	public Procesador() {
		
	}
	
	public Procesador(String marca, String modelo, int frecuencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.frecuencia = frecuencia;
	}
	
	
// getters y setters
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

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", frecuencia=" + frecuencia + "]";
	}
}
