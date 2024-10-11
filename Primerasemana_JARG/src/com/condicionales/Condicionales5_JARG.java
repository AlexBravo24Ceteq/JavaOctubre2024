package com.condicionales;

import java.util.Scanner;

public class Condicionales5_JARG {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que calcule la aceptación de una solicitud en base a 
		 *los siguientes parámetros: edad, nota y sexo.
		 */
		
		int n,e;
		String s;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deme su Nota");
		n = entrada.nextInt();
		System.out.println("Deme su Edad");
		e = entrada.nextInt();
		System.out.println("Diga cual su Sexo F para femenino y M para masculino");
		s = entrada.next();
		entrada.close();
		
		if (n>=5 && e>=18 &&s.equals("F")) {
			System.out.println("Aceptado");
		}else if (n>=5 && e>=18 && s.equals("M")){
			System.out.println("Posible");
		}else {
			System.out.println("No aceptado");
		}

	}

}
