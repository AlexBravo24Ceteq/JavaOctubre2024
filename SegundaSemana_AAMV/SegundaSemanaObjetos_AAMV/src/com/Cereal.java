package com;

public class Cereal {
	
	private String marca;
	private String sabor;
	private double precio;
	private boolean perecedero;
	
	public Cereal() {
		
	}

	public Cereal(String marca, String sabor, double precio, boolean perecedero) {
		super();
		this.marca = marca;
		this.sabor = sabor;
		this.precio = precio;
		this.perecedero = perecedero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}

	@Override
	public String toString() {
		return "Cereal [marca=" + marca + ", sabor=" + sabor + ", precio=" + precio + ", perecedero=" + perecedero
				+ "]";
	}

	
}
