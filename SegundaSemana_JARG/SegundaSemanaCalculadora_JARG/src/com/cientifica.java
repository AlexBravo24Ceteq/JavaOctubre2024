package com;
import java.util.Scanner;
public class cientifica extends calculadora implements ITermometro{
	
	private double a;
	private double b;
	private double res;
	
	Scanner scan = new Scanner(System.in);
	
	public cientifica() {}

	public cientifica(double a, double b, double res) {
		super();
		this.a = a;
		this.b = b;
		this.res = res;
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

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}
	
	

	@Override
	public String toString() {
		return "cientifica [toString()=" + super.toString() + "]";
	}

	@Override
	public void suma() {
		System.out.println("Vamos a sumar:");
		System.out.println("Ingresa el primer numero");
		a = scan.nextInt();
		System.out.println("Ingresa el segundo numero");
		b = scan.nextInt();
		res=a+b;
		System.out.println("El rsultado es: " + res);
		
		
	}

	@Override
	public void rest() {
		System.out.println("Vamos a restar:");
		System.out.println("Ingresa el primer numero");
		a = scan.nextDouble();
		System.out.println("Ingresa el segundo numero");
		b = scan.nextDouble();
		res=a-b;
		System.out.println("El rsultado es: " + res);
	}

	@Override
	public void mult() {
		System.out.println("Vamos a multiplicar:");
		System.out.println("Ingresa el primer numero");
		a = scan.nextDouble();
		System.out.println("Ingresa el segundo numero");
		b = scan.nextDouble();
		res=a*b;
		System.out.println("El rsultado es: " + res);
		
	}

	@Override
	public void divi() {
		System.out.println("Vamos a dividir:");
		System.out.println("Ingresa el primer numero");
		a = scan.nextDouble();
		System.out.println("Ingresa el segundo numero");
		b = scan.nextDouble();
		res=a/b;
		System.out.println("El rsultado es: " + res);
		
	}

	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
