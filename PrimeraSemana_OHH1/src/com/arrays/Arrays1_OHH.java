package com.arrays;

import java.util.Scanner;

public class Arrays1_OHH {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números 
		// con valores pedidos por teclado. Muestra por 
		// consola el índice y el valor al que corresponde.
		Scanner entrada = new Scanner (System.in);
		
		int [] numeros = new int[10];
		
		for(int i=0; i < numeros.length; i++) {
			System.out.print("Ingresa un número: ");
			int num = entrada.nextInt();
			numeros [i] = num;
		}
			System.out.println("Los valores del array son los siguientes: ");
		
			for(int i=0; i < numeros.length; i++) { 
			System.out.printf("numeros [%d] = %d\n", i, numeros[i]);
			}
	}

}	

