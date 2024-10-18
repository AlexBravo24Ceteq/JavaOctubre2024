package com.arrays;

import java.util.Scanner;

public class Arrays1_FAHT {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde.
		
		Scanner scanner = new Scanner(System.in);
		
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el número para la posición "+i+": ");
			numeros[i]=scanner.nextInt();
		}
		
		System.out.println("************ ");
		System.out.println(" ");
		System.out.println("Indice y valores de array: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Indice "+(i+1) + " ---> Valor: "+numeros[i]);
		}

	}//end//

}
