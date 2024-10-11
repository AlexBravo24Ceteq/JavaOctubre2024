package com.condicionales;

import java.util.Scanner;

public class Condicionales5_OHH {
	public static void main(String[] args) {
//		5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a
//		los siguientes par�metros: edad, nota y sexo.
//		* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		int nota, edad;
		char sexo;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa la nota: ");
		nota = entradaDatos.nextInt();
		
		System.out.println("Ingresa la edad: ");
		edad = entradaDatos.nextInt();
		
		System.out.println("Ingresa el sexo: ");
		sexo = entradaDatos.next().charAt(0);
		entradaDatos.close();
		
		if(nota >= 5 && edad >= 18 && sexo == 'M') {
			System.out.println("POSIBLE");
		}else if(nota >= 5 && edad >= 18 && sexo == 'F' ) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
	}
}
