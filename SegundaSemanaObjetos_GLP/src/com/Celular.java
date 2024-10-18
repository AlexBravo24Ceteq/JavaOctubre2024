package com;

public class Celular {

	private String marca;
	private int almacenamiento;
	private int ram;
	
	
	public Celular() {
		
	}


	public Celular(String marca, int alamcenamiento, int ram) {
		super();
		this.marca = marca;
		this.almacenamiento = alamcenamiento;
		this.ram = ram;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getAlamcenamiento() {
		return almacenamiento;
	}


	public void setAlamcenamiento(int alamcenamiento) {
		this.almacenamiento = alamcenamiento;
	}


	public int isRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", alamcenamiento=" + almacenamiento + ", ram=" + ram + "]";
	}
	
	
}
