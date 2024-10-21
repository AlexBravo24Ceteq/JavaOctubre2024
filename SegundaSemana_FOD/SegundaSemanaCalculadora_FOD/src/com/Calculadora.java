package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private boolean digital;
	
	public Calculadora() {
		super();
	}

	public Calculadora(String marca, String color, boolean digital) {
		super();
		this.marca = marca;
		this.color = color;
		this.digital = digital;
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

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", digital=" + digital + "]";
	}
	
	public abstract void sumar(double num1, double num2, double num3);
	
	public abstract void restar(double num1, double num2, double num3);
	
	public abstract void multiplicar(double num1, double num2, double num3);
	
	public abstract void dividir(double num1, double num2, double num3);

}
