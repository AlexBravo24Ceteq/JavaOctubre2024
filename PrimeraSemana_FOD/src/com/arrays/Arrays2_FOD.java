package com.arrays;

public class Arrays2_FOD {

	public static void main(String[] args) {
		
		int[] numeros = new int[100];
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			suma += numeros[i];
		}
		
		double media = (double)suma / numeros.length;
		
		System.out.println("Suma de los numeros del 1 - 100: " + suma);
		System.out.println("Media: " + media);
		
	}

}
