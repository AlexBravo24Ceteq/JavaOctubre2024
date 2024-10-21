package com;

import java.util.Scanner;
//La multi hecerencia no existe en JAVA
//Una clase hija no puede tener dos clases padre
//Aqui en JAVA se puede simular el tema de multi herencia cone el uso
//de interfaces
//La implementacion de una interface o mas de una se usa la palabra
//reservada -implements-
public class Cientifica extends Calculadora implements ITermometro{
//	private boolean existencia;
//
//	public Cientifica() {
//		
//	}
//	
//	
//
//
//	public Cientifica(String marca, String modelo, double costo, boolean existencia) {
//		super(marca, modelo, costo);
//		this.existencia = existencia;
//	}
//
//
//
//
//	public boolean isExistencia() {
//		return existencia;
//	}
//
//
//
//
//	public void setExistencia(boolean existencia) {
//		this.existencia = existencia;
//	}
//
//
//
//
//	@Override
//	public String toString() {
//		return "Cientifica [existencia=" + existencia + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
//				+ ", getCosto()=" + getCosto() + "]";
//	}
//



	@Override
	public void suma() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa el primer numero a sumar: ");
		double valor1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero a sumar: ");
		double valor2= sc.nextInt();
		System.out.println("El resultado es: " + (valor1 + valor2));

	}


	@Override
	public void resta() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa el primer numero a Restar: ");
		double valor1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero a Restar: ");
		double valor2= sc.nextInt();
		System.out.println("El resultado es: " + (valor1 - valor2));
	}


	@Override
	public void multiplicacion() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa el primer numero a Multiplicar: ");
		double valor1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero a Multiplicar: ");
		double valor2= sc.nextInt();
		System.out.println("El resultado es: " + (valor1 * valor2));
		
	}


	@Override
	public void division() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa el primer numero a Dividir: ");
		double valor1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero a Dividir: ");
		double valor2= sc.nextInt();
		System.out.println("El resultado es: " + (valor1 / valor2));
		
	}


	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
	}
	
	//Nuestros objetos pueden tomar comportamientos de 3 lados:
	
	/*
	 * 1. De sus clases y metodos propios
	 * 2. De otras clases heredandolos, incluyendo clases abstractas
	 * 3. De interfaces
	 * 
	 */
	
	
	
	
	
		
	}



	
