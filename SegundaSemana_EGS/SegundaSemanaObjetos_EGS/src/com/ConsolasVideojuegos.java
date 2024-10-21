package com;

public class ConsolasVideojuegos {
	
	
	private String marca;
	private double precio;
	private boolean versionPro;
	private int aniosGarantia;
	
	public ConsolasVideojuegos() {
		
	}

	public ConsolasVideojuegos(String marca, double precio, boolean versionPro, int aniosGarantia) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.versionPro = versionPro;
		this.aniosGarantia = aniosGarantia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isVersionPro() {
		return versionPro;
	}

	public void setVersionPro(boolean versionPro) {
		this.versionPro = versionPro;
	}

	public int getAniosGarantia() {
		return aniosGarantia;
	}

	public void setAniosGarantia(int aniosGarantia) {
		this.aniosGarantia = aniosGarantia;
	}

	@Override
	public String toString() {
		return "ConsolasVideojuegos [marca=" + marca + ", precio=" + precio + ", versionPro=" + versionPro
				+ ", aniosGarantia=" + aniosGarantia + "]";
	}
	
	
	
	

}
