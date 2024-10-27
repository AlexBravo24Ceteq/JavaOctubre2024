package com.arrays;

public class Arrays4_OHH {

	public static void main(String[] args) {
		// . Dado un array de números de 5 posiciones 
		// con los siguientes valores: {1,2,3,4,5}. 
		// Guardar los valores de este array en otro array 
		//distinto pero con los valores invertidos, es decir, 
		//que el segundo array deberá tener los valores {5,4,3,2,1}.

		int num;
		int [] numeros = new int[5];
		System.out.println("Los valores del array son los siguientes: ");
			for(int i=0; i < numeros.length; i++) {
			numeros [i] = i+1;
			System.out.printf("numeros[%d] = %d\n", i,numeros[i]);
			}
			System.out.println("Los valores del array invertidos son los siguientes: ");
			for(int j=0; j < numeros.length; j++) {
			numeros [j] = numeros.length-j;
			System.out.printf("numeros[%d] = %d\n", j,numeros[j]);
			}
	}		
}
