package com;

public class Computadora {
	
	private String marca;
	private String modelo;
	private double precio;
	private boolean esGamer;
	
	public Computadora() {
		// TODO Auto-generated constructor stub
	}

	public Computadora(String marca, String modelo, double precio, boolean esGamer) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.esGamer = esGamer;
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

	public boolean isEsGamer() {
		return esGamer;
	}

	public void setEsGamer(boolean esGamer) {
		this.esGamer = esGamer;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", esGamer=" + esGamer
				+ "]";
	}
	
	

}
