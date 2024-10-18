package com;

public class Psu {

	private String marca;
	private String modelo;
	private int watts;
	
	public Psu() {

	}

	

	public Psu(String marca, String modelo, int watts) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.watts = watts;
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

	public int getMemoria() {
		return watts;
	}

	public void setMemoria(int memoria) {
		this.watts = memoria;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca 
				+ ", modelo=" + modelo + 
				", watts=" + watts + "]";
	}
	
	
	
}
