package com.arrays;

import java.util.Scanner;

public class Arrays1_AGAH {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde
		
		int [] numero=new int [10];
		
		Scanner sc = new Scanner(System.in);
		int i;
		
	
		for ( i=0; i<numero.length; i++) {
			System.out.println("Ingrese el valor en la posicion " + i);
			numero[i] = sc.nextInt();
			}
		System.out.println("El valor agregado en la posicion 0 es: " + numero[0]);
		System.out.println("El valor agregado en la posicion 1 es: " + numero[1]);
		System.out.println("El valor agregado en la posicion 2 es: " + numero[2]);
		System.out.println("El valor agregado en la posicion 3 es: " + numero[3]);
		System.out.println("El valor agregado en la posicion 4 es: " + numero[4]);
		System.out.println("El valor agregado en la posicion 5 es: " + numero[5]);
		System.out.println("El valor agregado en la posicion 6 es: " + numero[6]);
		System.out.println("El valor agregado en la posicion 7 es: " + numero[7]);
		System.out.println("El valor agregado en la posicion 8 es: " + numero[8]);
		System.out.println("El valor agregado en la posicion 9 es: " + numero[9]);
	}

}
