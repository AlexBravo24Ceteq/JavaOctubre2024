package com;

public class Consola {
	
	private String marca;
	private String modelo;
	private boolean allDigital;
	private Almacenamiento capacidad;
	private Control mando;
	private Conectividad conect;
	
	
	public Consola() {
		// TODO Auto-generated constructor stub
	}


	public Consola(String marca, String modelo, boolean allDigital, Almacenamiento capacidad, Control mando,
			Conectividad conect) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.allDigital = allDigital;
		this.capacidad = capacidad;
		this.mando = mando;
		this.conect = conect;
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


	public boolean isAllDigital() {
		return allDigital;
	}


	public void setAllDigital(boolean allDigital) {
		this.allDigital = allDigital;
	}


	public Almacenamiento getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(Almacenamiento capacidad) {
		this.capacidad = capacidad;
	}


	public Control getMando() {
		return mando;
	}


	public void setMando(Control mando) {
		this.mando = mando;
	}


	public Conectividad getConect() {
		return conect;
	}


	public void setConect(Conectividad conect) {
		this.conect = conect;
	}


	@Override
	public String toString() {
		return "Consola [marca = " + marca + ", modelo = " + modelo + ", allDigital = " + allDigital + "\ncapacidad = "
				+ capacidad + "\nmando = " + mando + ",\nconect = " + conect + "]";
	}
	
	
	
	
}
