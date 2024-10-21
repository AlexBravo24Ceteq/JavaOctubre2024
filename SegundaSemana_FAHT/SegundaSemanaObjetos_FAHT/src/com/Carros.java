package com;

public class Carros {

	//atributo
	private String marca;
	private String color;
	private int precio;
	private boolean nuevo;
	
	public Carros ( ) { //vacio
	}

	public Carros(String marca, String color, int precio, boolean nuevo) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.nuevo = nuevo;
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

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	@Override
	public String toString() {
		return "Carros [marca=" + marca + ", color=" + color + ", precio=" + precio + ", nuevo=" + nuevo + "]";
	}
	
	
}
