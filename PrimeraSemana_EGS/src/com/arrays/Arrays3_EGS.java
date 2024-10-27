package com.arrays;
import java.util.Scanner;
public class Arrays3_EGS {
	public static void main(String[] args) {
		/*
		 * Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		 * caracteres.
		 */
		
		Scanner consola = new Scanner(System.in);
		
		System.out.print("Escribe una frase: ");
		String $frase = consola.nextLine().trim().replace(" ", "");
		
		char [] fraseArreglo = new char[$frase.length()];
		fraseArreglo = $frase.toCharArray();
//		for(int i = 0; i < $frase.length(); i++) {
//			fraseArreglo[i]= $frase.charAt(i);
//			System.out.printf("\nPosicion [%d]  = '%c'", i, fraseArreglo[i]);
//		} Este arreglo se sustituye por el metodo .toCharArray
		
		for(int i = 0; i < $frase.length(); i++)
			System.out.printf("\nPosicion [%d]  = '%c'", i, fraseArreglo[i]);
		
		
	}

}
