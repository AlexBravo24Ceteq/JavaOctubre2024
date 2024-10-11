package com.arrays;

import java.util.Scanner;

public class Arrays3_FAHT {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hola, Introduce una frase");
		String frase = scanner.nextLine(); 
		
		System.out.println("**************");
		System.out.println(" ");
		
		char[] arrayDecarteres = frase.toCharArray();
		for (int i = 0; i < arrayDecarteres.length; i++) {
			System.out.println("Indice "+ i +": " + arrayDecarteres[i]);
		}
		scanner.close();

	}//end

}
