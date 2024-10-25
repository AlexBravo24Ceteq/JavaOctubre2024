package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private String pantalla;
	
	public Calculadora () {}

	public Calculadora(String marca, String color, String pantalla) {
		super();
		this.marca = marca;
		this.color = color;
		this.pantalla = pantalla;
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

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", pantalla=" + pantalla + "]";
	}

	public abstract void sumar (int a, int b);
	public abstract void restar (int a, int b);
	public abstract void multiplicar(int a, int b);
	public abstract void dividir (int a, int b);

}
