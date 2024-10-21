package com;

public class Motor {

	private String marca;
	private int tamaño;
	private int numeroCilindros;
	
	public Motor() {
		
	}

	public Motor(String marca, int tamaño, int numeroCilindros) {
		super();
		this.marca = marca;
		this.tamaño = tamaño;
		this.numeroCilindros = numeroCilindros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getNumeroCilindros() {
		return numeroCilindros;
	}

	public void setNumeroCilindros(int numeroCilindros) {
		this.numeroCilindros = numeroCilindros;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", tamaño=" + tamaño + ", numeroCilindros=" + numeroCilindros + "]";
	}
	
}
