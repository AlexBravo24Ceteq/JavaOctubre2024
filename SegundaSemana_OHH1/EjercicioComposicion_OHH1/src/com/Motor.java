package com;

public class Motor {

	private String marca;
	private int tama�o;
	private int numeroCilindros;
	
	public Motor() {
		
	}

	public Motor(String marca, int tama�o, int numeroCilindros) {
		super();
		this.marca = marca;
		this.tama�o = tama�o;
		this.numeroCilindros = numeroCilindros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public int getNumeroCilindros() {
		return numeroCilindros;
	}

	public void setNumeroCilindros(int numeroCilindros) {
		this.numeroCilindros = numeroCilindros;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", tama�o=" + tama�o + ", numeroCilindros=" + numeroCilindros + "]";
	}
	
}
