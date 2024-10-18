package com;

public class Gpu {
	
	private String marca;
	private String modelo;
	private int memoria;
	
	
	public Gpu() {
		
	}


	public Gpu(String marca, String modelo, int memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
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
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}


	@Override
	public String toString() {
		return "Gpu [marca=" + marca + 
				", modelo=" + modelo + 
				", memoria=" + memoria + "]";
	}
	
	

}
