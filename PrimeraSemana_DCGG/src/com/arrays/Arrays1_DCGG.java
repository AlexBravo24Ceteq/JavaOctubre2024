package com.arrays;

import java.util.Scanner;

public class Arrays1_DCGG {

	public static void main(String[] args) {
		
//		1. crea un array de 10 posiciones con valores pedidos por teclado.
//		Muestra por consola el indice y el valor al que corresponde,
		
		Scanner entrada = new Scanner(System.in);
		int [] enteros = new int[10];
		
		System.out.println("Programa que pide 10 valores numéricos por teclado");
		for(int i = 0; i < enteros.length; i ++) {
			System.out.printf("proporciona el valor numérico [%d]\n",i);
			enteros[i] = entrada.nextInt();
		}
		
		for(int index:enteros) {
			System.out.printf("enteros[%d] -> valor: %d\n",index, enteros[index]);
		}
		
		entrada.close();
	}

}
