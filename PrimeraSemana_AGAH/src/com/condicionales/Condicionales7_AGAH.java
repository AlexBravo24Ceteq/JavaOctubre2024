package com.condicionales;

import java.util.Scanner;

public class Condicionales7_AGAH {

	public static void main(String[] args) {
		// 7. Realiza un programa que pida por teclado el resultado (dato entero) 
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//		caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
//		mostrará el mensaje: “ERROR: número incorrecto”.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Programa que determina la cara opuesta del dado...");
		System.out.println("Ingresa el valor obtenido al lanzar el dado");
		int dado=sc.nextInt();
		
		if(dado == 1) {
			System.out.println("la cara opuesta del resultado " + dado + " es seis");
		}else if (dado == 2) {
			System.out.println("la cara opuesta del resultado " + dado + " es cinco");
		}else if (dado == 3) {
			System.out.println("la cara opuesta del resultado " + dado + " es cuatro");
		}else if (dado == 4) {
			System.out.println("la cara opuesta del resultado " + dado + " es tres");
		}else if (dado == 5) {
			System.out.println("la cara opuesta del resultado " + dado + " es dos");
		}else if (dado == 6) {
			System.out.println("la cara opuesta del resultado " + dado + " es uno");
		}else {
			System.out.println("ERROR... Numero incorrecto");
		}

	}

}
