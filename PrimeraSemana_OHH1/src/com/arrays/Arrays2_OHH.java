package com.arrays;

public class Arrays2_OHH {

	public static void main(String[] args) {
		// 2. Crea un array de números de 100 posiciones, 
		// que contendrá los números del 1 al 100. 
		// Obtén la suma de todos ellos y la media.
		int suma=0; 
		float prom;
		
		int [] numeros = new int[100];
		
		System.out.println("Los valores del array son los siguientes: ");
			for(int i=0; i < numeros.length; i++) {
			numeros [i] = i+1;
			suma += numeros[i];
			System.out.printf("numeros[%d] = %d\n", i,numeros[i]);
			}
			prom = (float)suma/numeros.length;
			System.out.println("La suma de todos los valores del Array es: "+suma);
			System.out.printf("La media de todos los valores del Array es: %.02f",prom);
	}

}
