package com;

public class Celular {

	private String marca;
	private double precio;
	private String color;
	private String sistemaOperativo;
	private boolean plegable;
	
	public Celular() {
		
	}

	public Celular(String marca, double precio, String color, String sistemaOperativo, boolean plegable) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.sistemaOperativo = sistemaOperativo;
		this.plegable = plegable;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public boolean isPlegable() {
		return plegable;
	}

	public void setPlegable(boolean plegable) {
		this.plegable = plegable;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", precio=" + precio + ", color=" + color + ", sistemaOperativo="
				+ sistemaOperativo + ", plegable=" + plegable + "]";
	}
	
	
}
