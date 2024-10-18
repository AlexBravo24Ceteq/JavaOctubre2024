package com;

public class Motocicleta {

	private String marca;
	private String tipo;
	private int CentrimetrosCubicos;
	
	public Motocicleta() {
		
	}
	
	

	public Motocicleta(String marca, String tipo, int cC) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		CentrimetrosCubicos = cC;
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

	public int getCC() {
		return CentrimetrosCubicos;
	}

	public void setCC(int cC) {
		CentrimetrosCubicos = cC;
	}

	@Override
	public String toString() {
		return "Motocicleta [marca=" + marca + ", tipo=" + tipo + ", CC=" + CentrimetrosCubicos + "]";
	}
	
	
}
