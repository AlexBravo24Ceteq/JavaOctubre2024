package com.arrays;

public class Arrays2_OHH {
	public static void main(String[] args) {
//		2. Crea un array de números de 100 posiciones, que contendrá los números del
//		1 al 100. Obtén la suma de todos ellos y la media.
		
		int numeros[] = new int[100];
		int valor = 1, suma = 0;
		double media;
		
		for(int i = 0; i < 100; i++) {
			numeros[i] = valor++;
			System.out.println("Valor de la posicion: " + i + " es: " + numeros[i]);
			suma += numeros[i];
			if(numeros[i] == 100) {
				media  = (double) suma / numeros.length;
				System.out.println("La suma total de las posiciones es: " + suma);
				System.out.println("La media de los valores es " + media);
			}
			
		}
	}
}
