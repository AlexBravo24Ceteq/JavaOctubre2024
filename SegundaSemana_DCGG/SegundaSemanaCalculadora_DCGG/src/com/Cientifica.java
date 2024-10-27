package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{
	
	private int num_1;
	private int num_2;
	private double resultado;
	Scanner numero_sc = new Scanner(System.in);
	
	public Cientifica(){}

	public Cientifica(int numero_1, int numero_2, double resultado, char operacion, int num_1, int num_2,
			double resultado2) {
		super(numero_1, numero_2, resultado, operacion);
		this.num_1 = num_1;
		this.num_2 = num_2;
		resultado = resultado2;
	}

	public int getNum_1() {
		return num_1;
	}

	public void setNum_1(int num_1) {
		this.num_1 = num_1;
	}

	public int getNum_2() {
		return num_2;
	}

	public void setNum_2(int num_2) {
		this.num_2 = num_2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	

	@Override
	public String toString() {
		return "Cientifica [num_1=" + num_1 + ", num_2=" + num_2 + ", resultado=" + resultado + "]";
	}

	@Override
	double potencia() {
		System.out.println("Proporciona un numero double (base): ");
		double numero = numero_sc.nextDouble();
		System.out.println("Ahora proporciona un numero entero(exponente): ");
		int exponente = numero_sc.nextInt();
		
		double resultado = 1;
		
		if(exponente < 0) {
			exponente = -exponente;
			for(int i = 0; i < exponente; i++) {
				resultado *= numero;
			}
			resultado = 1.0/resultado;
		} else {
			for(int i = 0; i < exponente; i++) {
				resultado *= numero;
			}
		}
		
		return resultado;
	}

	@Override
	double promedio() {
		
		System.out.println("¿Cuantos numeros deseas calcular?: ");
		int cantidad = numero_sc.nextInt();
		double[] numeros = new double[cantidad];
		if(cantidad == 0) {
			System.out.println("debe proporcionar al menos un número..");
			return 0;
		}
		System.out.println("introduce los números: ");
		for(int i=0;i<cantidad; i++) {
			numeros[i] = numero_sc.nextDouble();
		}
		
		double suma = 0;
		for(double numero: numeros) {
			suma += numero;
		}
		
		return suma/cantidad;
	}

	@Override
	long factorial(int numero) {
		if(numero < 0) {
			System.out.println("proporciona al menos un número para calcular");
		}
		
		long resultado = 1;
		for(int i = 1; i <= numero; i++) {
			resultado *=i;
		}
		
		return resultado;
	}
	
	public void suma() {
		System.out.println("porporciona el primer numero: ");
		num_1 = numero_sc.nextInt();
		System.out.println("proporciona el segundo numero: ");
		num_2 = numero_sc.nextInt();
		
		System.out.println("la suma es: "+ (num_1 + num_2));
	}

	@Override
	void suma(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
		
	}

	@Override
	void resta(int num1, int num2, int num3) {
		System.out.println(num1-num2-num3);
		
	}

	@Override
	void multiplicar(int num1, int num2, int num3) {
		System.out.println(num1*num2*num3);
		
	}

	@Override
	void dividir(int num1, int num2, int num3) {
		System.out.println((num1/num2)/num3);
		
	}

	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
