package com.condicionales;

import java.util.Scanner;

public class Condicionales1DCGG {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// 1. Realiza un programa que reciba dos numeros por teclado
		// e indique cuál es el mayor o si son iguales.
		
		int valor1;
		int valor2;
		
		System.out.println("Programa que recibe dos numeros por teclado, los compara e indica el mayor");
		System.out.println("Proporciona el primer valor numérico entero: ");
		valor1 = entrada.nextInt();
		System.out.println("Proporciona el segundo valor numérico entero: ");
		valor2 = entrada.nextInt();
		
		System.out.println("Comparando...");
		
		if(valor1 > valor2) {
			System.out.println("El primer valor: "+valor1+" es MAYOR que el segundo valor: "+valor2);
		}else if(valor1 < valor2) {
			System.out.println("El primer valor: "+valor1+" es menor que el segundo valor: "+valor2);
		}else {
			System.out.println("El primer valor: "+valor1+" es igual al segundo valor: "+valor2);
		}
		
		entrada.close();
	}

}
