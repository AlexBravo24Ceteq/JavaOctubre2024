package com;

public class Camionetas {
	
	private String Marca;
	private int Modelo;
	private String Color;
	private String Combustible;
	private boolean Garantia;
	
	public Camionetas() {
		
	}

	public Camionetas(String marca, int modelo, String color, String combustible, boolean garantia) {
		super();
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Combustible = combustible;
		Garantia = garantia;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getModelo() {
		return Modelo;
	}

	public void setModelo(int modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getCombustible() {
		return Combustible;
	}

	public void setCombustible(String combustible) {
		Combustible = combustible;
	}

	public boolean isGarantia() {
		return Garantia;
	}

	public void setGarantia(boolean garantia) {
		Garantia = garantia;
	}

	@Override
	public String toString() {
		return "Camionetas [Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Combustible=" + Combustible
				+ ", Garantia=" + Garantia + "]";
	}
	
	

}
