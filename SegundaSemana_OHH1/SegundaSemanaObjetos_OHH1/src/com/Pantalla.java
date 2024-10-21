package com;

public class Pantalla {

	private String marca;
	private double precio;
	private int pulgadas;
	private boolean led;
	private boolean smartTv;
	
	public Pantalla() {
		
	}

	public Pantalla(String marca, double precio, int pulgadas, boolean led, boolean smartTv) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.pulgadas = pulgadas;
		this.led = led;
		this.smartTv = smartTv;
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

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isLed() {
		return led;
	}

	public void setLed(boolean led) {
		this.led = led;
	}

	public boolean isSmartTv() {
		return smartTv;
	}

	public void setSmartTv(boolean smartTv) {
		this.smartTv = smartTv;
	}

	@Override
	public String toString() {
		return "Pantalla [marca=" + marca + ", precio=" + precio + ", pulgadas=" + pulgadas + ", led=" + led
				+ ", smartTv=" + smartTv + "]";
	}
	
	
}
