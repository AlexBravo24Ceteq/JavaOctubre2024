package com.condicionales;

import java.util.Scanner;

public class Condicionales7_EGS {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero)
		 * obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		 * letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		 * caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		 * mostrará el mensaje: “ERROR: número incorrecto”.
		 */
		
		Scanner consola = new Scanner(System.in);
		System.out.println("***Lanzamiento de dado***");
		System.out.println("Ingrese el resultado del lanzamiento(1-6):");
		int resultadoDado = consola.nextInt();
		consola.close();
		
		switch(resultadoDado) {
		case 1:
			System.out.println("La cara opuesta es: seis");
			break;
		case 2:
			System.out.println("La cara opuesta es: cinco");
			break;
		case 3:
			System.out.println("La cara opuesta es: cuatro");
			break;
		case 4:
			System.out.println("La cara opuesta es: tres");
			break;
		case 5:
			System.out.println("La cara opuesta es: dos");
			break;
		case 6:
			System.out.println("La cara opuesta es: uno");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
			break;
		}

	}

}
