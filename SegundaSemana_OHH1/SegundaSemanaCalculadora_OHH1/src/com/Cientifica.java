package com;

// la Multiherencia en java no existe
// Es decir, una clase Hija no puede tener dos clases Padre
// aqu� en java se puede simular el tema de la multiherencia
// con el uso de interfases
// La implementaci�n de una interfase o m�s de una
// se hace con la palabra reservada implements (se puede implementar m�s de una clase)

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{

	Scanner entrada = new Scanner (System.in);

	
	private int tama�o;
	private int numeroFunciones;
	private double precio;
	
	public Cientifica() {
		
	}

	public Cientifica(String marca, String modelo, String color, int tama�o, int numeroFunciones, double precio) {
		super(marca, modelo, color);
		this.tama�o = tama�o;
		this.numeroFunciones = numeroFunciones;
		this.precio = precio;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public int getNumeroFunciones() {
		return numeroFunciones;
	}

	public void setNumeroFunciones(int numeroFunciones) {
		this.numeroFunciones = numeroFunciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cientifica [tama�o=" + tama�o + ", numeroFunciones=" + numeroFunciones + ", precio=" + precio
				+ ", \ntoString()=" + super.toString() + "]";
	}

	public int sumar (int a, int b) {;
	return a+b;
	}
	
	public int restar (int a, int b) {;
	return a-b;
	}
	public int multiplicar (int a, int b) {;
	return a*b;
	}


	@Override
	public void dividir() {
		System.out.print("\nIngresa otro n�mero: ");
		int a = entrada.nextInt();
		System.out.print("Ingresa otro n�mero: ");
		int b = entrada.nextInt();
		double c = (float)a/b;
		System.out.printf("Divisi�n "+a+" / "+b+" =  %.02f",c);
	}

	@Override
	public void tomarTemperatura() {
		System.out.printf("\nTemperatura Normal");
	
		// Nuestros objetos pueden tomar comportamientos de 3 lados:
		
		/* 1. De sus clases y m�todos propios
		 * 2. De otras clases, hered�ndolos, incluyendo clases abstractas
		 * 3. De interfases 
		 */
		
		
	}
}
