package com;

public class Pantallas {
	
	private String marca;
	private String pulgadas;
	private double precio;
	private boolean smartTV;
	
	public Pantallas() {
		
	}

	public Pantallas(String marca, String pulgadas, double precio, boolean smartTV) {
		super();
		this.marca = marca;
		this.pulgadas = pulgadas;
		this.precio = precio;
		this.smartTV = smartTV;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(String pulgadas) {
		this.pulgadas = pulgadas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}

	@Override
	public String toString() {
		return "Pantallas [Marca=" + marca + ", Pulgadas=" + pulgadas + ", Precio=" + precio + ", SmartTV=" + smartTV
				+ "]";
	}
	
	
}
