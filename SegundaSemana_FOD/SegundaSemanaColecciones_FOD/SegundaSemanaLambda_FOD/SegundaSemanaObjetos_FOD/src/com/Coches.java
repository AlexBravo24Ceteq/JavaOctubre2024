package com;

public class Coches {
	private String marca;
	private double precio;
	private String color;
	private String direccion;
	private boolean nacional;
	
	public Coches() {
		super();
	}

	public Coches(String marca, double precio, String color, String direccion, boolean nacional) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.direccion = direccion;
		this.nacional = nacional;
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

	public String getDereccion() {
		return direccion;
	}

	public void setDereccion(String dereccion) {
		this.direccion = dereccion;
	}

	public boolean isNacional() {
		return nacional;
	}

	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}

	@Override
	public String toString() {
		return "Coches [marca=" + marca + ", precio=" + precio + ", color=" + color + ", dereccion=" + direccion
				+ ", nacional=" + nacional + "]";
	}
	
	

}
