package com.arrays;

import java.util.Scanner;

public class Array1_SJP {
	
	public static void main(String[] args) {
		//EJERCICIO 1:
		//Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		//Muestra por consola el �ndice y el valor al que corresponde.
		
		Scanner numeros = new Scanner(System.in);
		float [] posiciones = new float [10]; //float por si queremos introducir un numero con decimales
		System.out.println("Introduce 10 n�meros: ");

		for(int i=0; i < 10; i++) {
			System.out.println("N�mero " + (i+1) + ": ");
			posiciones [i] = numeros.nextFloat();
			}
			for (int i=0; i < posiciones.length; i++) {
			System.out.println("La posici�n " + i + " es " + posiciones[i]);
			}

	}

}
