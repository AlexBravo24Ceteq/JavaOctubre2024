package com.condicionales;

import java.util.Scanner;

public class Condicionales7_OHH {

	public static void main(String[] args) {
		// 7. Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		//letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		//caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		//mostrará el mensaje: “ERROR: número incorrecto”.
		
		Scanner entrada = new Scanner (System.in);
		//int numero;
		
		System.out.println("Ingresa el número obtenido al lanzar el dado: ");
		
		int numero = entrada.nextInt();
		
		if (numero >=1 && numero <= 6) {
			switch (numero) {
			case 1:
				System.out.println("El número de la cara opuesta es: SEIS");
				break;
			case 2:
				System.out.println("El número de la cara opuesta es: CINCO");
				break;
			case 3:
				System.out.println("El número de la cara opuesta es: CUATRO");
				break;	
			case 4:
				System.out.println("El número de la cara opuesta es: TRES");
				break;	
			case 5:
				System.out.println("El número de la cara opuesta es: DOS");
				break;
			case 6:
				System.out.println("El número de la cara opuesta es: UNO");
				break;	
			}
		}
		else {
			System.out.println("El número debe ser de 1 - 6");
		}
	
	}
	
	
}
