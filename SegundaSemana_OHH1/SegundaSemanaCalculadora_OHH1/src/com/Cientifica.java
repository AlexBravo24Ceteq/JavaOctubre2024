package com;

// la Multiherencia en java no existe
// Es decir, una clase Hija no puede tener dos clases Padre
// aquí en java se puede simular el tema de la multiherencia
// con el uso de interfases
// La implementación de una interfase o más de una
// se hace con la palabra reservada implements (se puede implementar más de una clase)

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{

	Scanner entrada = new Scanner (System.in);

	
	private int tamaño;
	private int numeroFunciones;
	private double precio;
	
	public Cientifica() {
		
	}

	public Cientifica(String marca, String modelo, String color, int tamaño, int numeroFunciones, double precio) {
		super(marca, modelo, color);
		this.tamaño = tamaño;
		this.numeroFunciones = numeroFunciones;
		this.precio = precio;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
		return "Cientifica [tamaño=" + tamaño + ", numeroFunciones=" + numeroFunciones + ", precio=" + precio
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
		System.out.print("\nIngresa otro número: ");
		int a = entrada.nextInt();
		System.out.print("Ingresa otro número: ");
		int b = entrada.nextInt();
		double c = (float)a/b;
		System.out.printf("División "+a+" / "+b+" =  %.02f",c);
	}

	@Override
	public void tomarTemperatura() {
		System.out.printf("\nTemperatura Normal");
	
		// Nuestros objetos pueden tomar comportamientos de 3 lados:
		
		/* 1. De sus clases y métodos propios
		 * 2. De otras clases, heredándolos, incluyendo clases abstractas
		 * 3. De interfases 
		 */
		
		
	}
}
