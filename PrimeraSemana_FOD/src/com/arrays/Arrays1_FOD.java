package com.arrays;

import java.util.Scanner;

public class Arrays1_FOD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("digita 10 digitos: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.println("Indice - Valor");
		for (int j = 0; j < numeros.length; j++) {
			System.out.println(j + " _ " + numeros[j]);
		}
		
		entrada.close();

	}

}
