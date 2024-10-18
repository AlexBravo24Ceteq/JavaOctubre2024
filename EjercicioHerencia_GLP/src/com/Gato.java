package com;

public class Gato extends Animal{
	
	private int peso;
	private String tipoComida;
	
	public Gato() {}

	

	public Gato(String nombre, int edad, String tipo, int peso, String tipoComida) {
		super(nombre, edad, tipo);
		this.peso = peso;
		this.tipoComida = tipoComida;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}



	@Override
	public String toString() {
		return "Gato [peso=" + peso + ", tipoComida=" + tipoComida + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
