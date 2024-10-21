package com;

import java.util.Scanner;

//La multiherencia en Java no existe
//Es decir, una clase hija no puede tener dos clases Padre
//Aqui en Java se puede simular el tema de la multiherencia
//Con el uso de interfaces
//La implementacion de una interface o más de una se hace con
//la palabra reservada implements
public class Cientifica extends Calculadora implements ITermometro {
	
	private double numero1;
	private double numero2;
	private String name;
	private double a;
	private double b;
	
	public Cientifica() {
		Scanner consola = new Scanner(System.in);
		
		System.out.println("\n***Bienvenido a la calculadora***");
		System.out.print("Hola, introduce tu nombre: ");
		setName(consola.nextLine());
		System.out.println("Muy bien " + getName() + " piensa en dos numeros...");
		System.out.print("Introduce el primer numero: ");
		setA(consola.nextDouble());
		System.out.print("Introduce el segundo numero: ");
		setB(consola.nextDouble());
		System.out.println("\nGenerando calculos...\n");
		
		
	}


	public Cientifica(String marca, String modelo, String color, int numero1, int numero2) {
		super(marca, modelo, color);
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	

	@Override
	public String toString() {
		return "Cientifica [numero 1 = " + numero1 + ", numero2 = " + numero2 + "]" + super.toString() ;
	}




	public double getNumero1() {
		return numero1;
	}




	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}




	public double getNumero2() {
		return numero2;
	}




	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}


	@Override
	public double sumar() {
		double resultado = numero1 + numero2;
		return resultado;
	}

	@Override
	public double restar() {
		double resultado = numero1 - numero2;
		return resultado;
	}

	@Override
	public double multiplicar() {
		double resultado = numero1 * numero2;
		return resultado;
	}

	@Override
	public double dividir() {
		double resultado = numero1 / numero2;
		return resultado;
	}

	@Override
	public void sumar1() {
		String nombre = getName();
		double resultado = getA() + getB();
		System.out.println("Correcto " + nombre + " el resultado de la division es: " + resultado);
		
	}

	@Override
	public void restar1() {
		String nombre = getName();
		double resultado = getA() - getB();
		System.out.println("Correcto " + nombre + " el resultado de la resta es: " + resultado);
		
	}

	@Override
	public void multiplicar1() {
		String nombre = getName();
		double resultado = getA() * getB();
		System.out.println("Correcto " + nombre + " el resultado de la multiplicacion es: " + resultado);
		
	}

	@Override
	public void dividir1() {
		String nombre = getName();
		double resultado = getA() / getB();
		System.out.println("Correcto " + nombre + " el resultado de la division es: " + resultado);
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	

	

}
