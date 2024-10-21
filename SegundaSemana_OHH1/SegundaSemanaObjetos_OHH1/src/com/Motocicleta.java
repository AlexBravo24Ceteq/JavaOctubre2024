package com;

public class Motocicleta {

	private String marca;
	private double precio;
	private String color;
	private int motor;
	private boolean pista;
	
	public Motocicleta() {
		
	}

	public Motocicleta(String marca, double precio, String color, int motor, boolean pista) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.motor = motor;
		this.pista = pista;
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

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public boolean isPista() {
		return pista;
	}

	public void setPista(boolean pista) {
		this.pista = pista;
	}

	@Override
	public String toString() {
		return "Motocicleta [marca=" + marca + ", precio=" + precio + ", color=" + color + ", motor=" + motor
				+ ", pista=" + pista + "]";
	}
	
	
}
