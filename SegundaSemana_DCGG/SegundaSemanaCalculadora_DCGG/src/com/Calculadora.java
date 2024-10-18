package com;

abstract public class Calculadora {
	
	private int numero_1;
	private int numero_2;
	private double resultado;
	private char operacion;
	
	Calculadora(){}

	public Calculadora(int numero_1, int numero_2, double resultado, char operacion) {
		super();
		this.numero_1 = numero_1;
		this.numero_2 = numero_2;
		this.resultado = resultado;
		this.operacion = operacion;
	}


	public int getNumero_1() {
		return numero_1;
	}

	public void setNumero_1(int numero_1) {
		this.numero_1 = numero_1;
	}

	public int getNumero_2() {
		return numero_2;
	}

	public void setNumero_2(int numero_2) {
		this.numero_2 = numero_2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public char getOperacion() {
		return operacion;
	}

	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}

	
	@Override
	public String toString() {
		return "Calculadora [numero_1=" + numero_1 + ", numero_2=" + numero_2 + ", resultado=" + resultado
				+ ", operacion=" + operacion + "]";
	}

	// MÉTODOS DE LA CLASE
	// suma
	public double suma(double numero_1, double numero_2) {
		return numero_1 + numero_2;
	}
	// resta
	public double resta(double numero_1, double numero_2) {
		return numero_1 - numero_2;
	}
	// resta
	public double multiplicacion(double numero_1, double numero_2) {
		return numero_1 * numero_2;
	}
	// resta
	public double division(double numero_1, double numero_2) {
		return numero_1 / numero_2;
	}
	
	// MÉTODOS ABSTRACTOS
	
	// sacar la potencia de un numero
	abstract double potencia();
	
	// sacar la raíz cuadrada
	abstract double promedio();
	
	// sacar factorial
	abstract long factorial(int numero);
	
	abstract void suma(int num1, int num2, int num3);
	abstract void resta(int num1, int num2, int num3);
	abstract void multiplicar(int num1, int num2, int num3);
	abstract void dividir(int num1, int num2, int num3);
	
	

}
