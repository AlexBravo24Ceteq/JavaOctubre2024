package com.arrays;

import java.util.Scanner;

public class Arrays1_GLP {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			int[] numeros = new int[10];
			System.out.println("Ingresa 10 numeros");
			
			for (int i = 0; i < 10; i++) {
				int numero = entrada.nextInt();
				numeros[i] = numero;
			}
			
			System.out.println("Los numeros ingresados son: ");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
	        }
			
	        entrada.close();
	}

}
