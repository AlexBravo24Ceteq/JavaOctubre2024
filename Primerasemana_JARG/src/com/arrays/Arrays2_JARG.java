package com.arrays;

public class Arrays2_JARG {

	public static void main(String[] args) {
		//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
		int [] numeros = new int [100];
		int sum = 0;
		double med;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i+1;
			sum += numeros[i];
		}
		System.out.println(sum);
		med = (double)sum/numeros.length;
		System.out.println(med);
		
	}

}
