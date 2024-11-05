package com.condicionales;

import java.util.Scanner;

public class Condicionales4_FAHT {

	public static void main(String[] args) {
		Scanner palabras = new Scanner (System.in);
		System.out.println("INGRESA UNA CADENA DE TEXTO: ");
		String cadena = palabras.nextLine();

		boolean mayusculas=false;
		
		for(int i=0; i < cadena.length(); i++) {
			if (Character.isUpperCase(cadena.charAt(i))) {
				mayusculas=true;
				break;
				
			}
		}
		if (mayusculas) {
			System.out.println("La cadena tiene mayusculas");
		}else {
			System.out.println("La cadena no tiene mayusculas");
		}
		
		
	}

}//end
