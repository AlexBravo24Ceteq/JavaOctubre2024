package com.condicionales;

import java.util.Scanner;

public class Condicionales4_OHH {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras may�sculas.
		int contaMayus=0, contaMinus=0;
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Introduce tu nombre completo con may�sculas");
		
		String nombre = entrada.nextLine(); 
		
		for (int i=0; i < nombre.length(); i++) {
		
		char c = nombre.charAt(i);
		
		if(Character.isLowerCase(c)) {
			contaMinus++;
		}
		}
		if (contaMinus == 0) {
			System.out.println("Correcto! Se escribi� con letras may�sculas");
		}
		
		if (contaMinus >=1) {
			System.out.println("Solo se deben escribir letra May�sculas. Vuelva a intentarlo");
		}		
		
	}
					}
	