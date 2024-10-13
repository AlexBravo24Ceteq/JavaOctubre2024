package com.arrays;

import java.util.Scanner;

public class Arrays3_AGAH {

	public static void main(String[] args) {
		/*
		 * 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
caracteres.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa una frase o palabra:");
		String fra = sc.nextLine();
		
		char [] array= new char[fra.length()];
		
		for (int i=0; i < fra.length(); i++) {
			array[i]=fra.charAt(i);
			System.out.println("en el espacio " +i + " quedo agregada la: " + array[i]);
			
		}
		
		 sc.close(); //<---cierre del scanner
	}
   
}
