package com.ciclos;

import java.util.Scanner;

public class Ciclos3_GLP {

	public static void main(String[] args) {
		/*
		 * 3. Realiza un programa para determinar si un String es palíndromo.
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el texto/frase");
		String texto = entrada.nextLine();
		
		texto = texto.trim().toLowerCase();
		String textoAlrevez = "";
		
		for (int i = texto.length()-1; i >= 0; i--) {
			//el += asigna el valor y suma a la vez
			textoAlrevez += texto.charAt(i);
		}
		
		
		if(texto.equals(textoAlrevez) ) {
			System.out.println("si es un palindromo");
		}else {
			System.out.println("no es un palindromo");
		}
		
		entrada.close();
		
	}

}
