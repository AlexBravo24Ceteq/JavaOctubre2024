package com;

import java.util.Scanner;
//implementando las interfaces ITermometro, IOtrainterfaz, INInterfaces
public class Cientifica extends Calculadora implements ITermometro{
	
	private boolean disponible;
	
//	método vacio y con argumentos
	public Cientifica() {
		
	}
	
	public Cientifica(String nombre, String color, double precio, boolean disponible) {
		super(nombre, color, precio);
		this.disponible = disponible;
	}

//	getters y setters
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
//	toString
	@Override
	public String toString() {
		return "Cientifica [disponible=" + disponible + ", toString()=" + super.toString() + "]";
	}

//	métodos abstractos heredados de calculadora
	@Override
	public double sumar(double n1, double n2) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Realizar suma de dos números.");
		System.out.println("Ingresa el primer número:");
		n1 = entradaDatos.nextDouble();
		System.out.println("Ingresa el segundo número:");
		n2 = entradaDatos.nextDouble();
		entradaDatos.close();
		double resultado = n1 + n2;
		return resultado;
	}
	

	@Override
	public double restar(double n1, double n2) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Realizar resta de dos números.");
		System.out.println("Ingresa el primer número:");
		n1 = entradaDatos.nextDouble();
		System.out.println("Ingresa el segundo número:");
		n2 = entradaDatos.nextDouble();
		entradaDatos.close();
		double resultado = n1 - n2;
		return resultado;
	}

	@Override
	public double dividir(double n1, double n2) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Realizar división de dos números.");
		System.out.println("Ingresa el primer número:");
		n1 = entradaDatos.nextDouble();
		System.out.println("Ingresa el segundo número:");
		n2 = entradaDatos.nextDouble();
		entradaDatos.close();
		double resultado = n1 / n2;
		return resultado;
	}

	@Override
	public double multiplicar(double n1, double n2) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Realizar multiplicación de dos números.");
		System.out.println("Ingresa el primer número:");
		n1 = entradaDatos.nextDouble();
		System.out.println("Ingresa el segundo número:");
		n2 = entradaDatos.nextDouble();
		entradaDatos.close();
		double resultado = n1 * n2;
		return resultado;
	}
	
//	segunda forma de los métodos sumar, restar, dividir y multiplicar
	public double sumar(double n1, double n2, double n3) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Realizar suma de tres números.");
		System.out.println("Ingresa el primer número:");
		n1 = entradaDatos.nextDouble();
		System.out.println("Ingresa el segundo número:");
		n2 = entradaDatos.nextDouble();
		System.out.println("Ingresa el tercer número:");
		n3 = entradaDatos.nextDouble();
		entradaDatos.close();
		double resultado = n1 + n2 + n3;
		return resultado;
	}
	
	public double restar(double n1, double n2, double n3) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Realizar resta de tres números.");
		System.out.println("Ingresa el primer número:");
		n1 = entradaDatos.nextDouble();
		System.out.println("Ingresa el segundo número:");
		n2 = entradaDatos.nextDouble();
		System.out.println("Ingresa el tercer número:");
		n3 = entradaDatos.nextDouble();
		entradaDatos.close();
		double resultado = n1 - n2 - n3;
		return resultado;
	}
	
	public double dividir(double n1, double n2, double n3) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Realizar division de tres números.");
		System.out.println("Ingresa el primer número:");
		n1 = entradaDatos.nextDouble();
		System.out.println("Ingresa el segundo número:");
		n2 = entradaDatos.nextDouble();
		System.out.println("Ingresa el tercer número:");
		n3 = entradaDatos.nextDouble();
		entradaDatos.close();
		double resultado = (n1 / n2) / n3;
		return resultado;
	}
	
	public double multiplicar(double n1, double n2, double n3) {
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Realizar multiplicación de tres números.");
		System.out.println("Ingresa el primer número:");
		n1 = entradaDatos.nextDouble();
		System.out.println("Ingresa el segundo número:");
		n2 = entradaDatos.nextDouble();
		System.out.println("Ingresa el tercer número:");
		n3 = entradaDatos.nextDouble();
		entradaDatos.close();
		double resultado = (n1 * n2) * n3;
		return resultado;
	}

//	Implementando el métod de la interface ITermometro
	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
	}

}
