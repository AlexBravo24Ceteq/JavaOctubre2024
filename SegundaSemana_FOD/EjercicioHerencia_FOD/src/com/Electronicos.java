package com;

public class Electronicos {
	private String especificacion;
	private String marca;
	private String modelo;
	private double precio;
	
	public Electronicos() {
		super();
	}

	public Electronicos(String especificacion, String marca, String modelo, double precio) {
		super();
		this.especificacion = especificacion;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Elestronicos [especificacion=" + especificacion + ", marca=" + marca + ", modelo=" + modelo
				+ ", precio=" + precio + "]";
	}
	
	

}
