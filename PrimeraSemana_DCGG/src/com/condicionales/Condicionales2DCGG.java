package com.condicionales;

import java.util.Scanner;

public class Condicionales2DCGG {

	public static void main(String[] args) {
//		2. Realiza un programa que pida un número por teclado y nos
//		indique si es par o impar.
		
		Scanner entrada = new Scanner(System.in);
		
		int valor1;
		
		System.out.println("Programa que recibe un numero por teclado, e indica si es par o impar ");
		System.out.println("Proporciona el valor numérico entero a evaluar: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Evaluando...");
		if((valor1%2) == 0) {
			System.out.println("El valor "+valor1+" es un número par");
		}else {
			System.out.println("El valor "+valor1+" es un número impar");
		}
		
		entrada.close();
	}

}
