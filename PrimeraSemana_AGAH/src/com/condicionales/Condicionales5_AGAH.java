package com.condicionales;

import java.util.Scanner;

public class Condicionales5_AGAH {

	public static void main(String[] args) {
		//5. Realiza un programa que calcule la aceptación de una 
//		solicitud en base a los siguientes parámetros: edad, nota 
//		y sexo. 
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
//	* Otros casos -> NO ACEPTADA
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su edad: ");
		int edad = sc.nextInt();
		
		Scanner gen = new Scanner(System.in);
		System.out.println("Ingrese su genero (F)Femenino o (M)Masculino: ");
		String genero = gen.nextLine();
		
		
		System.out.println("Ingrese su Nota o Promedio: ");
		int nota = sc.nextInt();
		
		if((edad >= 18) && (nota >= 5) && (genero.equals("M"))) {
		
			System.out.println("La solicitud posiblemente sea aceptada..");
		
		}else if((edad >= 18) && (nota >=5 ) && (genero.equals("F"))) {
			
			System.out.println("La solicitud es aceptada..");
			
		}else {
			
			System.out.println("La solicitud no es aceptada..");
			
		}
	}
}
