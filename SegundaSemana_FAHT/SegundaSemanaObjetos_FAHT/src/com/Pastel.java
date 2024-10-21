package com;

public class Pastel {
 //Atrivuto
	private String sabor;
	private double precio;
	private char tama�o;
	private boolean existencia;
	
	public Pastel ( ){ // vacio
	}

	public Pastel(String sabor, double precio, char tama�o, boolean existencia) {
		super();
		this.sabor = sabor;
		this.precio = precio;
		this.tama�o = tama�o;
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

	public char getTama�o() {
		return tama�o;
	}

	public void setTama�o(char tama�o) {
		this.tama�o = tama�o;
	}

	public boolean getExistencia() {
		return existencia;
	}

	public void setExistencia(boolean existencia) {
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Pastel [sabor=" + sabor + ", precio=" + precio + ", tama�o=" + tama�o + ", existencia=" + existencia
				+ "]";
	}
	
	
	
	
}
