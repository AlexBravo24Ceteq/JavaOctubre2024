package com.arrays;

import java.util.Scanner;

public class Arrays3_DCGG {

	public static void main(String[] args) {
//		3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que vacia a un arreglo de caracteres una frase");
		System.out.println("proporciona la frase deseada: ");
		String frase = entrada.nextLine();
		
		char [] array = new char[frase.length()];
		
		array = frase.toCharArray();
//		for(int i = 0; i < frase.length(); i++) {
//			array[i] = frase.charAt(i);
//		}
		
		for(int index = 0; index < frase.length(); index++) {
			System.out.printf("array[%d] -> Letra: %c\n",index,array[index]);
		}
		
		entrada.close();
	}

}
