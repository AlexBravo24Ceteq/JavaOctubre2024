package com.arrays;

import java.util.Scanner;

public class Arrays3_GLP {

	public static void main(String[] args) {
		//3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres. 

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un texto/frase");
		String texto = entrada.next();
		//forma simple
		char[] caracteres = texto.toCharArray();
		
		//forma con for 
		char[] caracteres2 = new char[texto.length()];
		for (int i = 0; i < caracteres.length; i++) {
			caracteres2[i] = texto.charAt(i);
		}
		
		System.out.println("Los caracteres de la frase son:");
		for (char letra:caracteres) {
			System.out.println(letra);
		}

		entrada.close();
		
	}

}
