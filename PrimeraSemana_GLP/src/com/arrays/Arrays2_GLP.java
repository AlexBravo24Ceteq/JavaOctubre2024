package com.arrays;

public class Arrays2_GLP {

	public static void main(String[] args) {
		//2. Crea un array de números de 100 posiciones, que contendrá los números del 
		//1 al 100. Obtén la suma de todos ellos y la media.
		
		int [] numeros = new int[100];
		Double sumaNumeros = 0.0;
		
		for (int i = 0; i < 100; i++) {
			numeros[i] = (i+1);
			sumaNumeros += (i+1);
		}
		System.out.println("La suma de los numeros es: "+sumaNumeros);
		System.out.println("La media de los numeros es: "+(sumaNumeros/numeros.length));
	}

}
