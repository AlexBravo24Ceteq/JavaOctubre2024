package com;

public abstract class Calculadora {

	private String marca;
	private String color;
	private int precio;
	private boolean existencia;
	
	public Calculadora () {	}

	public Calculadora(String marca, String color, int precio, boolean existencia) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.existencia = existencia;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isExistencia() {
		return existencia;
	}

	public void setExistencia(boolean existencia) {
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", precio=" + precio + ", existencia=" + existencia
				+ "]";
	}
	
	public abstract void sumar();
	public abstract void restar();
	public abstract void multiplicar();
	public abstract void dividir();
	
}//end
