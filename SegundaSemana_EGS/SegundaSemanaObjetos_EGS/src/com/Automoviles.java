package com;

public class Automoviles {
	
	private String marca;
	private String subMarca;
	private int modelo;
	private double precio;
	
	public Automoviles() {
		// TODO Auto-generated constructor stub
	}

	public Automoviles(String marca, String subMarca, int modelo, double precio) {
		super();
		this.marca = marca;
		this.subMarca = subMarca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSubMarca() {
		return subMarca;
	}

	public void setSubMarca(String subMarca) {
		this.subMarca = subMarca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
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
		return "Automoviles [marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", precio=" + precio
				+ "]";
	}
	
	
	

}
