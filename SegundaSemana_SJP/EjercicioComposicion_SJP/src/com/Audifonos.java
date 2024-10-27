package com;

public class Audifonos {
	
	private String marca;
	private String modelo;
	private String color;
	//Tendrá como atributos otros objetos
	private Bateria carga;
	private Audio sonido;
	private Conectividad conector;
	
	public Audifonos (){
		
	}

	public Audifonos(String marca, String modelo, String color, Bateria carga, Audio sonido, Conectividad conector) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.carga = carga;
		this.sonido = sonido;
		this.conector = conector;
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

	public Bateria getCarga() {
		return carga;
	}

	public void setCarga(Bateria carga) {
		this.carga = carga;
	}

	public Audio getSonido() {
		return sonido;
	}

	public void setSonido(Audio sonido) {
		this.sonido = sonido;
	}

	public Conectividad getConector() {
		return conector;
	}

	public void setConector(Conectividad conector) {
		this.conector = conector;
	}

	@Override
	public String toString() {
		return "Audifonos:\n Marca=[" + marca + ", Modelo=" + modelo + ", Color=" + color + "]" + ", \n Carga=" + carga
				+ ", \n Sonido=" + sonido + ", \n Conector=" + conector + "";
	}


}
