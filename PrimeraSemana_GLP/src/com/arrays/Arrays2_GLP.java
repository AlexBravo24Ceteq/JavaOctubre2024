package com.arrays;

public class Arrays2_GLP {

	public static void main(String[] args) {
		//2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
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
