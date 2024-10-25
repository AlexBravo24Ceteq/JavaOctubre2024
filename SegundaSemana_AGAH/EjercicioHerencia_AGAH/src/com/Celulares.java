package com;

public class Celulares {
	
	private String marca;
	private int almacenamiento;
	private String sistemaOperativo;
	
	public Celulares() {
		
	}

	public Celulares(String marca, int almacenamiento, String sistemaOperativo) {
		super();
		this.marca = marca;
		this.almacenamiento = almacenamiento;
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	@Override
	public String toString() {
		return "Celulares [marca=" + marca + ", almacenamiento=" + almacenamiento + ", sistemaOperativo="
				+ sistemaOperativo + "]";
	}
	
	

}
