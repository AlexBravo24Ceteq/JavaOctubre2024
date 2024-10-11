package com.arrays;

public class Arrays4_GLP {

	public static void main(String[] args) {
		//4. Dado un array de números de 5 posiciones con los siguientes valores: 
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}. 
		
		int[] numeros = {1,2,3,4,5};
		int[] numerosInvertidos = new int[numeros.length];
		
		for (int i = 4, j = 0; j < 5; i--, j++) {
			numerosInvertidos[j] = numeros[i];
		}
		
		for(int numero:numerosInvertidos) {
			System.out.print(numero+" ");
		}

	}

}
