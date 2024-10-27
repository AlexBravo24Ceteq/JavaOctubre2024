package com;

public class Celulares {
	private String marca;
	private double precio;
	private String color;
	private String procesador;
	private String ram;
	
	public Celulares() {
		super();
	}

	public Celulares(String marca, double precio, String color, String procesador, String ram) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.procesador = procesador;
		this.ram = ram;
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

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celulares [marca=" + marca + ", precio=" + precio + ", color=" + color + ", procesador=" + procesador
				+ ", ram=" + ram + "]";
	}
	
	
	

}
