package com.condicionales;

import java.util.Scanner;

public class Condicionales2_EGS {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número por 
		 * teclado y nos indique si es paro impar
		 */

		Scanner consola = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int numero = consola.nextInt();
		consola.close();
		
		switch (numero%2) {
		case 0:
			System.out.println("El numero "+ numero +" es par ");
			break;
		default:
			System.out.println("El numero "+ numero +" es impar ");
			break;
		}
	}

}
