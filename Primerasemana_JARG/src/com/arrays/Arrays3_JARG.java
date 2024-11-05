package com.arrays;
import java.util.Scanner;
public class Arrays3_JARG {

	public static void main(String[] args) {
		 //Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		 //caracteres.
		String frase;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una cadena para el array:");
		frase = scan.nextLine();
		char [] caracteres = frase.toCharArray();
		scan.close();
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		}
	}

}
