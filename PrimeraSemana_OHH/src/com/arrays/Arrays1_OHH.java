package com.arrays;

public class Arrays1_OHH {

	public static void main(String[] args) {
//		1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//		Muestra por consola el índice y el valor al que corresponde.
		
		
		int numeros[] = new int[10];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		numeros[5] = 60;
		numeros[6] = 70;
		numeros[7] = 80;
		numeros[8] = 90;
		numeros[9] = 100;
		
		for(int i = 0; i <numeros.length; i++) {
			System.out.println("Posición " + i + " su valor es: " + numeros[i]);
		}
	}

}
