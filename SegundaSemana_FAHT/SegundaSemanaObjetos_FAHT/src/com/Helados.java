package com;

public class Helados {
//atributo
	private String sabor;
	private int precio;
	private boolean existencia;
	
	public Helados ( ) { //vacio
	}

	public Helados(String sabor, int precio, boolean existencia) {
		super();
		this.sabor = sabor;
		this.precio = precio;
		this.existencia = existencia;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isExistencia() {
		return existencia;
	}

	public void setExistencia(boolean existencia) {
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Helados [sabor=" + sabor + ", precio=" + precio + ", existencia=" + existencia + "]";
	}
	
	
	
}
