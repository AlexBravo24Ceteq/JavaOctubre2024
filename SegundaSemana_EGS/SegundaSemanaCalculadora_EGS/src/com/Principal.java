package com;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		Cientifica calculos = new Cientifica("CASIO", "FX-991SPXII", "Blanco", 15, 10);
		System.out.println(calculos.toString());
		System.out.println("Resultado de la suma Heredada: " + calculos.sumar());
		System.out.println("Resultado de la resta Heredada: " +calculos.restar());
		System.out.println("Resultado de la multiplicacion Heredada: " +calculos.multiplicar());
		System.out.println("Resultado de la division Heredada: " +calculos.dividir());
		
        Cientifica calculadora = new Cientifica();
		
        calculadora.sumar1();
		calculadora.restar1();
		calculadora.multiplicar1();
		calculadora.dividir1();
		
		calculadora.tomarTemperatura();
	}

}
