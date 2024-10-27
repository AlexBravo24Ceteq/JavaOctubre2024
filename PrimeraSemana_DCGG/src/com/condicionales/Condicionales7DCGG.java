package com.condicionales;

import java.util.Scanner;

public class Condicionales7DCGG {

	public static void main(String[] args) {
//		7. Realiza un programa que pida por teclado el resultado 
//		(dato entero) obtenido al lanzar un dado de seis caras y 
//		muestre por pantalla el número en letras (dato cadena) 
//		de la cara opuesta al resultado obtenido. 
//		Nota 1: En las caras opuestas de un dado de seis caras están los 
//		números: 1-6, 2-5 y 3-4. 
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, 
//		se mostrará el mensaje: “ERROR: número incorrecto”.
		
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		System.out.println("programa que recibe por teclado el resultado numérico al tirar un dado");
		System.out.println("proprociona el valor numérico que dio el dado: ");
		valor = entrada.nextInt();
		
		
		switch (valor) {
		case 1:
			System.out.println("seis");
			break;
		case 2:
			System.out.println("cinco");
			break;
		case 3:
			System.out.println("cuatro");
			break;
		case 4:
			System.out.println("tres");
			break;
		case 5:
			System.out.println("dos");
			break;
		case 6:
			System.out.println("uno");
			break;

		default:
			System.out.println("ERRO: número incorrecto");
			break;
		}
		
		entrada.close();

	}

}
