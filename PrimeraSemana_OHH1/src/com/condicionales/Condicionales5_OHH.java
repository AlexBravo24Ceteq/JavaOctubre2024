package com.condicionales;

import java.util.Scanner;

public class Condicionales5_OHH {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		//los siguientes parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA

		int nota, edad;
		//char sexo;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el valor de la nota de 0 a 10: ");
		
		nota = entrada.nextInt();
		
		System.out.println("Introduce la edad: ");
		
		edad = entrada.nextInt();
		
		System.out.println("Introduce el sexo (M)asculino, o (F)emenino: ");
		
		char sexo = entrada.next().charAt(0);
		
		if(nota >= 5 && edad >= 18 && (sexo == 'M' || sexo == 'm')) {
			System.out.println("El resultado de la solicitud es: POSIBLE");
		}
		
		else if(nota >= 5 && edad >= 18 && (sexo == 'F' || sexo == 'f')) {
			System.out.println("El resultado de la solicitud es: ACEPTADA");
		}
		else {
			System.out.println("El resultado de la solicitud es: NO ACEPTADA");
		}
	}
	

}
