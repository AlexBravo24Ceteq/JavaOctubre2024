package com;

public class Teclado {
	
	private String marca;
	private String tipo;
	private String Lenguaje;
	
	public Teclado() {
		
	}

	public Teclado(String marca, String tipo, String lenguaje) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		Lenguaje = lenguaje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLenguaje() {
		return Lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		Lenguaje = lenguaje;
	}

	@Override
	public String toString() {
		return "Teclado [marca=" + marca + ", tipo=" + tipo + ", Lenguaje=" + Lenguaje + "]";
	}
	
	
}
