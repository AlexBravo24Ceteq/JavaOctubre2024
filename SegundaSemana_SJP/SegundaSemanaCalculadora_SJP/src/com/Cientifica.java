package com;

import java.util.Scanner;

public class Cientifica extends Calculadora{
	
	private boolean estandar;
	
	public Cientifica() {}
	

	public Cientifica(String marca, String modelo, String color, double precio, boolean estandar) {
		super(marca, modelo, color, precio);
		this.estandar = estandar;
	}


	public boolean isEstandar() {
		return estandar;
	}


	public void setEstandar(boolean estandar) {
		this.estandar = estandar;
	}


	
	@Override
	public String toString() {
		return "Cientifica [Detalles: " + super.toString() + " Estandar=" + estandar + "]\n";
	}


	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int restar(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double dividir(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int sumar(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public int restar(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a-b-c;
	}

	@Override
	public double multiplicar(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a*b*c;
	}

	@Override
	public double dividir(int a, int b, int c) {
		// TODO Auto-generated method stub
		return ((double)a/b)/c;
	}

	@Override
	public void sumar() {
		int num1;
		int num2;
		System.out.println("\nSUMA DE NUMEROS");
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1=entrada.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=entrada.nextInt();
		
		System.out.println("Resultado de la suma= " + (num1+num2));
	}

	@Override
	public void restar() {
		int num3;
		int num4;
		System.out.println("\nRESTA DE NUMEROS");
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num3=entrada.nextInt();
		System.out.println("Introduce el segundo número: ");
		num4=entrada.nextInt();
		
		System.out.println("Resultado de la resta= " + (num3-num4));
		
	}

	@Override
	public void multiplicar() {
		int num5;
		int num6;
		System.out.println("\nMULTIPLICACION DE NUMEROS");
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num5=entrada.nextInt();
		System.out.println("Introduce el segundo número: ");
		num6=entrada.nextInt();
		
		System.out.println("Resultado de la multiplicación= " + (num5*num6));
		
	}

	@Override
	public void dividir() {
		double num7;
		double num8;
		System.out.println("\nDIVISION DE NUMEROS");
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num7=entrada.nextInt();
		System.out.println("Introduce el segundo número: ");
		num8=entrada.nextInt();

		System.out.println("Resultado de la división= " + (num7/num8));
		
	}

	

}
