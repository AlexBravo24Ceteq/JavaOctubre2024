package com.condicionales;

import java.util.Scanner;

public class Condicionales7_OHH {

	public static void main(String[] args) {
//		7. Realiza un programa que pida por teclado el resultado (dato entero)
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
//		caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se
//		mostrar� el mensaje: �ERROR: n�mero incorrecto�.
		
		int resultadoDado;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa el resultado del dado: ");
		resultadoDado = entradaDatos.nextInt();
		entradaDatos.close();
		
		switch(resultadoDado) {
		case 1:
			System.out.println("Seis");
			break;
		case 2:
			System.out.println("Cinco");
			break;
		case 3:
			System.out.println("Cuatro");
			break;
		case 4:
			System.out.println("Tres");
			break;
		case 5:
			System.out.println("Dos");
			break;
		case 6:
			System.out.println("Uno");
			break;
		default:
			System.out.println("ERROR: n�mero incorrecto");
			break;
		}
	}

}
