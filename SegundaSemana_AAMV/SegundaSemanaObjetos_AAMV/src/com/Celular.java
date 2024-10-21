package com;

public class Celular {
	
	private String marca;
	private double precio;
	private String color;
	private boolean resistentealagua;
	
	public Celular() {
		
	}

	public Celular(String marca, double precio, String color, boolean resistentealagua) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.resistentealagua = resistentealagua;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isResistentealagua() {
		return resistentealagua;
	}

	public void setResistentealagua(boolean resistentealagua) {
		this.resistentealagua = resistentealagua;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", precio=" + precio + ", color=" + color + ", resistentealagua="
				+ resistentealagua + "]";
	}
	
	
	
	

}
