package com;

public class Rines {

	private String marca;
	private String color;
	private int tamaño;

	public Rines() {
		
	}

	public Rines(String marca, String color, int tamaño) {
		super();
		this.marca = marca;
		this.color = color;
		this.tamaño = tamaño;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Rines [marca=" + marca + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	
}

