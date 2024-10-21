package com;

public class Motor {
	private String marca;
	private String modelo;
	private int caballos;
	private boolean turbo;
	
	public Motor() {
		super();
	}

	public Motor(String marca, String modelo, int caballos, boolean turbo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.caballos = caballos;
		this.turbo = turbo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + ", caballos=" + caballos + ", turbo=" + turbo + "]";
	}

	
	
	
	

}
