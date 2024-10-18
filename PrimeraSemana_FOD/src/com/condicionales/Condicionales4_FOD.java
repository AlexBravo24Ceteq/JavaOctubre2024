package com.condicionales;

import java.util.Scanner;


public class Condicionales4_FOD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		String cadena = entrada.nextLine();
		
		boolean tieneMayusculas = false;
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isUpperCase(cadena.charAt(i))) {
				tieneMayusculas = true;
				break;
			}
		}
		
		if (tieneMayusculas) {
			System.out.println("La cadena contiene letras mayusculas.");
		}else {
			System.out.println("La cadena no contiene letras mayusculas.");
		}
		

		entrada.close();
	}

}
