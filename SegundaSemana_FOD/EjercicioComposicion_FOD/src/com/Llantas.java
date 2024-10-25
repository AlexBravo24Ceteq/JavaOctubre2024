package com;

public class Llantas {
	private String marca;
	private String modelo;
	private int ancho;
	private int alto;
	private int rin;
	
	public Llantas() {
		super();
	}

	public Llantas(String marca, String modelo, int ancho, int alto, int rin) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ancho = ancho;
		this.alto = alto;
		this.rin = rin;
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

	public double getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getRin() {
		return rin;
	}

	public void setRin(int rin) {
		this.rin = rin;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", modelo=" + modelo + ", ancho=" + ancho + ", alto=" + alto + ", rin=" + rin
				+ "]";
	}

	
	
	

}
