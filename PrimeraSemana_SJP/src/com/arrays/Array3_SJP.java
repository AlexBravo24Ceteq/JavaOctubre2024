package com.arrays;

import java.util.Scanner;

public class Array3_SJP {

	public static void main(String[] args) {
		// EJERCICIO 3:
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.

		Scanner frase = new Scanner(System.in);
		System.out.println("Escriba alguna frase: ");
		String cadena = frase.nextLine();
		
		char caracteres[] = cadena.toCharArray(); //
		System.out.println("Arreglo de caracteres: ");
		
		for (int i=0; i < cadena.length(); i++) {
			System.out.println(caracteres[i]);
		}
				
	}

}
