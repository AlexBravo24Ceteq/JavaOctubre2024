package com;

public class Reloj {

	private String marca;
	private String color;
	private double precio;
	private boolean conMancillas;
	private String tipoMaterial;
	
	public Reloj() {
		super();
	}

	public Reloj(String marca, String color, double precio, boolean conMancillas, String tipoMaterial) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.conMancillas = conMancillas;
		this.tipoMaterial = tipoMaterial;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isConMancillas() {
		return conMancillas;
	}

	public void setConMancillas(boolean conMancillas) {
		this.conMancillas = conMancillas;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	@Override
	public String toString() {
		return "Reloj [marca=" + marca + ", color=" + color + ", precio=" + precio + ", conMancillas=" + conMancillas
				+ ", tipoMaterial=" + tipoMaterial + "]";
	}
	
	
	
}
