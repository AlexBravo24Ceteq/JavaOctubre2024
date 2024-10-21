package com;

public class Control {
	
	private String modelo;
	private String color;
	private boolean esPro;
	
	public Control() {
		// TODO Auto-generated constructor stub
	}

	public Control(String modelo, String color, boolean esPro) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.esPro = esPro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEsPro() {
		return esPro;
	}

	public void setEsPro(boolean esPro) {
		this.esPro = esPro;
	}

	@Override
	public String toString() {
		return "Control [modelo=" + modelo + ", color=" + color + ", esPro=" + esPro + "]";
	}
	
	

}
