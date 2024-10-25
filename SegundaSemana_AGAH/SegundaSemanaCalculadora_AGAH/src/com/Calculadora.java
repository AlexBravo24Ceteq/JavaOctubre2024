package com;

public abstract class Calculadora {
	
	protected String marca;
	protected String modelo;
	protected double costo;
	
	public Calculadora() {
	}

	public Calculadora(String marca, String modelo, double costo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.costo = costo;
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

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

//	@Override
//	public String toString() {
//		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", costo=" + costo + "]";
//	}
//	
	public abstract void suma();
	public abstract void resta();
	public abstract void multiplicacion();
	public abstract void division();
	
	

}
