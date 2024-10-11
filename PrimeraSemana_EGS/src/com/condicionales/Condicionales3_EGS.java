package com.condicionales;

import java.util.Scanner;

public class Condicionales3_EGS {

	public static void main(String[] args) {
		/*
		 * .Crea un programa que pida al usuario dos números y muestre 
		 * el resultado de su división. 
		 * Si el segundo número es 0, debe mostrar un mensaje de error.
		 */
		
		Scanner consola = new Scanner(System.in);
		System.out.println("***Division de dos numeros***");
		System.out.println("Ingresa el primer numero: ");
		int numero1 = consola.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		int numero2 = consola.nextInt();
		consola.close();
		System.out.println(numero1);
		System.out.println(numero2);
		
		if (!(numero2 != 0)) {
			System.out.println("Error, no se puede dividir entre 0");
		}else {
			double resultado = numero1 / numero2;
			System.out.printf("El resultado de la division es: %.2f", resultado);
		}


	}

}
