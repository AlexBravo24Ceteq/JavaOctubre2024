package com;

public class Pastel {
 //Atrivuto
	private String sabor;
	private double precio;
	private char tamaño;
	private boolean existencia;
	
	public Pastel ( ){ // vacio
	}

	public Pastel(String sabor, double precio, char tamaño, boolean existencia) {
		super();
		this.sabor = sabor;
		this.precio = precio;
		this.tamaño = tamaño;
		this.existencia = existencia;
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

	public char getTamaño() {
		return tamaño;
	}

	public void setTamaño(char tamaño) {
		this.tamaño = tamaño;
	}

	public boolean getExistencia() {
		return existencia;
	}

	public void setExistencia(boolean existencia) {
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Pastel [sabor=" + sabor + ", precio=" + precio + ", tamaño=" + tamaño + ", existencia=" + existencia
				+ "]";
	}
	
	
	
	
}
