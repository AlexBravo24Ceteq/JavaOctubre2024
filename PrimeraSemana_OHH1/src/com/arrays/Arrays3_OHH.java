package com.arrays;

import java.util.Scanner;

public class Arrays3_OHH {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase 
		// y pasa sus caracteres a un array de caracteres.

		Scanner entrada = new Scanner (System.in);
			
			System.out.println("Introduce una frase: ");
			String frase = entrada.nextLine();
			
			int n= frase.length();
			char [] texto = new char[n];
			
			System.out.println("Los valores del array son los siguientes: ");
			
				for (int i = 0; i<n; i++) {
					texto[i] = frase.charAt(i); 
					
				System.out.print("texto ["+i+"] = ");
				System.out.println(texto[i]);
				}
	}		
}