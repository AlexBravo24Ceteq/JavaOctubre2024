package com.arrays;

import java.util.Arrays;

public class Arrays4_DCGG {

	public static void main(String[] args) {
//		4. Dado un array de números de 5 posiciones con los siguientes valores
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deberá tener los valores
//		{5,4,3,2,1}.
		
		int [] numeros = {1,2,3,4,5};
		int [] numerosInvertidos = new int[numeros.length];
		int i = 0;
		int cantidad = numeros.length-1;
		
		while(cantidad >= 0) {
			numerosInvertidos[i++] = numeros[cantidad--];
		}
		
		System.out.println("numeros es = "+Arrays.toString(numeros));
		System.out.println("numerosInvertidos = "+Arrays.toString(numerosInvertidos));

	}

}
