package com;

public class Rines {

	private String marca;
	private String color;
	private int tama�o;

	public Rines() {
		
	}

	public Rines(String marca, String color, int tama�o) {
		super();
		this.marca = marca;
		this.color = color;
		this.tama�o = tama�o;
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

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Rines [marca=" + marca + ", color=" + color + ", tama�o=" + tama�o + "]";
	}
	
}

