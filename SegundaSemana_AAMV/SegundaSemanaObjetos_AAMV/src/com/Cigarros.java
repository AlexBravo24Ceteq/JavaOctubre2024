package com;

public class Cigarros {
	
	private String marca;
	private String sabor;
	private boolean nocivosparalasalud;
	private double precio;
	
	Cigarros () {
		
	}

	public Cigarros(String marca, String sabor, boolean nocivosparalasalud, double precio) {
		super();
		this.marca = marca;
		this.sabor = sabor;
		this.nocivosparalasalud = nocivosparalasalud;
		this.precio = precio;
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

	public boolean isNocivosparalasalud() {
		return nocivosparalasalud;
	}

	public void setNocivosparalasalud(boolean nocivosparalasalud) {
		this.nocivosparalasalud = nocivosparalasalud;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cigarros [marca=" + marca + ", sabor=" + sabor + ", nocivosparalasalud=" + nocivosparalasalud
				+ ", precio=" + precio + "]";
	}
	
	
	
	
	
	

}
