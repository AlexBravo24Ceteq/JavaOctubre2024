package com.arrays;

public class Arrays2_DCGG {

	public static void main(String[] args) {
//		2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
//		1 al 100. Obten la suma de todos ellos y la media.
		
		int [] numeros = new int [100];
		int suma = 0;
		
		for(int i = 1; i <= numeros.length; i++) {
			numeros[i-1] = i;
			suma = suma + numeros[i-1];
		}
		float promedio = (float)suma/numeros.length;
		
		System.out.printf("La media de la suma de 100 numeros del 1 al 100 es: %.2f",promedio);

	}

}
