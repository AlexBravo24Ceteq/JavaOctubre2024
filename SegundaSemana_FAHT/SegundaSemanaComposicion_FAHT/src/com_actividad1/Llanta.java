package com_actividad1;

public class Llanta {

	private String marca;
	private boolean nuevos;
	private int precio;
	
	public Llanta () {	
	}

	public Llanta(String marca, boolean nuevos, int precio) {
		super();
		this.marca = marca;
		this.nuevos = nuevos;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isNuevos() {
		return nuevos;
	}

	public void setNuevos(boolean nuevos) {
		this.nuevos = nuevos;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Llanta [marca=" + marca + ", nuevos=" + nuevos + ", precio=" + precio + "]";
	}
	
	
	
}
