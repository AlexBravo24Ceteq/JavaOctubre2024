package com;

public class Celular extends Electronicos{
	
	private double pulgadas;
	private String procesador;
	private String color;
	
	public Celular() {
		
	}

	public Celular(String especificacion, String marca, String modelo, double precio, double pulgadas,
			String procesador, String color) {
		super(especificacion, marca, modelo, precio);
		this.pulgadas = pulgadas;
		this.procesador = procesador;
		this.color = color;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Celular [pulgadas=" + pulgadas + ", procesador=" + procesador + ", color=" + color + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
