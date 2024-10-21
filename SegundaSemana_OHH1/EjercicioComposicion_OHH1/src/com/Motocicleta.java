package com;

public class Motocicleta {

	private String marca;
	private String modelo;
	private String color;

	private Motor gasolina;
	private Rines aluminio;	
	private Frenos disco;
	
	public Motocicleta() {
		
	}

	public Motocicleta(String marca, String modelo, String color, Motor gasolina, Rines aluminio, Frenos disco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.gasolina = gasolina;
		this.aluminio = aluminio;
		this.disco = disco;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Motor getGasolina() {
		return gasolina;
	}

	public void setGasolina(Motor gasolina) {
		this.gasolina = gasolina;
	}

	public Rines getAluminio() {
		return aluminio;
	}

	public void setAluminio(Rines aluminio) {
		this.aluminio = aluminio;
	}

	public Frenos getDisco() {
		return disco;
	}

	public void setDisco(Frenos disco) {
		this.disco = disco;
	}

	@Override
	public String toString() {
		return "Motocicleta [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", \ngasolina=" + gasolina
				+ ", \naluminio=" + aluminio + ", \ndisco=" + disco + "]";
	}

}