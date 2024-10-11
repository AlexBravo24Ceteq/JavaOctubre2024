package com.arrays;

import java.util.Scanner;

public class Arrays3_OHH {
	public static void main(String[] args) {
//		3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
//		caracteres.
		
		String frase;
		Scanner entradaDatos =  new Scanner(System.in);
		
		System.out.println("Ingresa una frase para guardarla en un arreglo");
		frase = entradaDatos.nextLine();
		
		char fraseArray[] = new char[frase.length()];
		entradaDatos.close();
		
//		for(int i = 0; i < fraseArray.length; i++) {
//			fraseArray[i] = frase.charAt(i);
//		}
		
		fraseArray = frase.toCharArray();
		
		System.out.println("Frase guardada en el Array: ");
		for(int i=0; i<fraseArray.length; i++) {
			System.out.print(fraseArray[i] + " ");
		}	
	}
}
