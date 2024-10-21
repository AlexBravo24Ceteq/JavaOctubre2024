package com;

public class Ram {
	private String marca;
	private String modelo;
	private int capacidaad;
	
	public Ram() {}

	public Ram(String marca, String modelo, int capacidaad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidaad = capacidaad;
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

	public int getCapacidaad() {
		return capacidaad;
	}

	public void setCapacidaad(int capacidaad) {
		this.capacidaad = capacidaad;
	}

	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", modelo=" + modelo + ", capacidaad=" + capacidaad + "]";
	}
	

}
