package com;

public class Lego {
	
	private String modelo;
	private int minEdad;
	private int numPiezas;
	private double precio;
	
	
	public Lego() {
		// TODO Auto-generated constructor stub
	}


	public Lego(String modelo, int minEdad, int numPiezas, double precio) {
		super();
		this.modelo = modelo;
		this.minEdad = minEdad;
		this.numPiezas = numPiezas;
		this.precio = precio;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getMinEdad() {
		return minEdad;
	}


	public void setMinEdad(int minEdad) {
		this.minEdad = minEdad;
	}


	public int getNumPiezas() {
		return numPiezas;
	}


	public void setNumPiezas(int numPiezas) {
		this.numPiezas = numPiezas;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Lego [modelo=" + modelo + ", minEdad=" + minEdad + ", numPiezas=" + numPiezas + ", precio=" + precio
				+ "]";
	}
	
	

}
