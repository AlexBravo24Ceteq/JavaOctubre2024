package com;

public class Laptop {

	private String marca;
	private String modelo;
	private String color;
	// Tambien tendr� como atributos otros objetos que formar�n
	// parte de laptop
	
	private Almacenamiento disco;
	private Ram memoria;
	private Procesador cpu;
	
	public Laptop(){}

	public Laptop(String marca, String modelo, String color, Almacenamiento disco, Ram memoria, Procesador cpu) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.disco = disco;
		this.memoria = memoria;
		this.cpu = cpu;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Ram getMemoria() {
		return memoria;
	}

	public void setMemoria(Ram memoria) {
		this.memoria = memoria;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ",\n modelo=" + modelo + ",\n color=" + color + ",\n disco=" + disco + ",\n memoria="
				+ memoria + ",\n cpu=" + cpu + "]";
	}
	
}
