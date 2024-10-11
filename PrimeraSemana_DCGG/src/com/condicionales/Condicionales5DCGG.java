package com.condicionales;

import java.util.Scanner;

public class Condicionales5DCGG {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a 
		// los siguientes parámetros: edad, nota y sexo.
		// ejemplo: 
		//	*Mínimo: Nota(5), edad(18), sexo M -> POSIBLE
		//	*Mínimo: Nota(5), edad(18), sexo F -> ACEPTADA
		//	*Otros casos -> NO ACEPTADA
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		int edad;
		String sexo;
		
		System.out.println("Programa que filtra solicitudes en base a edad, nota y sexo");
		System.out.println("Proporciona el valor de la nota: ");
		nota = entrada.nextInt();
		System.out.println("Proporciona la edad: ");
		edad = entrada.nextInt();
		System.out.println("Proporciona el sexo ('solo es permitido M para masculino o F para Femenino)': ");
		sexo = entrada.next();
		
		
		
		if((nota >= 5) && (edad >= 18) && (sexo.equals("M"))) {
			System.out.println("POSIBLE");
		}else if((nota >= 5) && (edad >= 18) && (sexo.equals("F"))) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
		
		entrada.close();
	}

}
