package com;

public class Ram {

	private String marca;
	private String modelo;
	private int capacidad;
	
	public Ram() {
		
	}

	public Ram(String marca, String modelo, int capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
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

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + "]";
	}
	
	
	
}
