package com.arrays;

import java.util.Arrays;

public class Arrays4_EGS {
	public static void main(String[] args) {
		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores:
		 * {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		 * los valores invertidos, es decir, que el segundo array deberá tener los valores
		 * {5,4,3,2,1}
		 */
		int [] arrayNormal = {1,2,3,4,5};
		int [] arrayInvertido = new int[arrayNormal.length];
		
		for(int i = arrayNormal.length-1,j=0; j<arrayNormal.length ; i--,j++)
				arrayInvertido [i] = arrayNormal[j];

		System.out.println("La cadena normal es: " + Arrays.toString(arrayNormal));
		System.out.println("La cadena Invertida es: " + Arrays.toString(arrayInvertido));
		
		
	}

}
