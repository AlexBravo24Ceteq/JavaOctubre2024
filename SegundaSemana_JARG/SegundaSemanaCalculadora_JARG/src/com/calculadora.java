package com;

public abstract class calculadora {
	
	private static final String marca = "CASIO";
	private static final String color = "Gris";
	private static final String tipo = "Cientifica";
	
	public calculadora() {}

	

	public static String getMarca() {
		return marca;
	}



	public static String getColor() {
		return color;
	}



	public static String getTipo() {
		return tipo;
	}
	
	
	

	


	@Override
	public String toString() {
		return "calculadora [marca: ="+marca+" color: "+color+" tipo: "+tipo+"]";
	}



	public abstract void suma();
	
	public abstract void rest();
	
	public abstract void mult();

	public abstract void divi();
	
	

}
