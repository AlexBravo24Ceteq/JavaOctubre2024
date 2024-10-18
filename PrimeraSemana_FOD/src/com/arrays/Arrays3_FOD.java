package com.arrays;

import java.util.Scanner;

public class Arrays3_FOD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		
		String frase = entrada.nextLine();
		
		char[] caracteres = frase.toCharArray();
		
		System.out.println("Los caracteres de la frase son: ");
		for (char caracter : caracteres) {
			System.out.println(caracter);
		}
		
		entrada.close();
		
	}

}
