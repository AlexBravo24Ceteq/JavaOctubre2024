package com;

public class Frenos {

	private String marca;
	private String sistema;
	private float precio;

	public Frenos() {
		
	}

	public Frenos(String marca, String sistema, float precio) {
		super();
		this.marca = marca;
		this.sistema = sistema;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Frenos [marca=" + marca + ", sistema=" + sistema + ", precio=" + precio + "]";
	}
	
}
