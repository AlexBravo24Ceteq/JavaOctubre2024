package com;

public class Almacenamiento {
	private String marca;
	private String modelo;
	private int capacidad;
	
//	constructor vacio y con argumentos
	public Almacenamiento() {
		
	}

	public Almacenamiento(String marca, String modelo, int capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
	}

//	getters y setters
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

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + "]";
	}
	
	
}
