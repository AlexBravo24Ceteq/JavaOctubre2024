package com;

//la multierencia en java no existe 
//es decir una clase hija no puede tener ddos clases padre
//aqui en java se puede simular el tema de la multierencia con el usu de interfaces
//la implementacion de una interface o mas d euna se hace con la palabra reservada implements
public class Cientifica extends Calculadora implements ITermometro{
	
	private double num1;
	private double num2;
	private double num3;

	public Cientifica() {
		super();
	}

	public Cientifica(String marca, String color, boolean digital, double num1, double num2, double num3) {
		super(marca, color, digital);
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}
	
	@Override
	public String toString() {
		return "Cientifica [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void sumar(double num1, double num2, double num3) {
		System.out.println("Resultado de la suma con 3 numeros: " + (num1 + num2 + num3));
		
	}
	@Override
	public void restar(double num1, double num2, double num3) {
		System.out.println("Resultado de la resta con 3 numeros: " + ((num1 - num2) - num3));
		
	}
	@Override
	public void multiplicar(double num1, double num2, double num3) {
		System.out.println("Resultado de la multiplicacion con 3 numeros: " + ((num1 * num2) * num3));
		
	}
	@Override
	public void dividir(double num1, double num2, double num3) {
		if (num2 == 0 || num3 == 0) {
			System.out.println("Error no se puede dividir por cero");
		}else {
			System.out.println("Resultado de la divicion con tres numeros: " + ((num1 / num2) / num3));
		}
		
	}
	//sobrecarga de los metodos 
	
	public void sumar(double num1, double num2) {
		System.out.println("Resultado de la suma con dos numeros: " + (num1 + num2));
		
	}
	
	public void restar(double num1, double num2) {
		System.out.println("Resultado de la resta con dos numeros: " + (num1 - num2));
		
	}
	
	public void multiplicar(double num1, double num2) {
		System.out.println("Resultado de la multiplicacion con dos numeros: " + (num1 * num2));
		
	}
	
	public void dividir(double num1, double num2) {
		if (num2 == 0){
			System.out.println("Error no se puede dividir por cero");
		}else {
			System.out.println("Resultado de la divicion con dos numeros: " + (num1 / num2));
		}
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
// nuestros objetos pueden tomar comportamientos de tres lados 
	//1 de sus clases y metodos propios
	//2 de otras clases heredandolar incluyendo clases abstractos
	// 3 de interfaces
	

}
