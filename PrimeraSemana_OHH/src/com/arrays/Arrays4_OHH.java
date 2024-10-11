package com.arrays;

public class Arrays4_OHH {
	public static void main(String[] args) {
//		4. Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deberá tener los valores
//		{5,4,3,2,1}.
		
		int numeros[] = new int[5];
		int reversa[] = new int[numeros.length];
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		for(int i = 0; i < numeros.length; i++) {
			reversa[i] = numeros[numeros.length-1-i];
		}
		
		System.out.println("\nArreglo inverso");
		for(int i = 0; i < reversa.length; i++) {
			System.out.print(reversa[i] + " ");
		}
		
				
	}
}
