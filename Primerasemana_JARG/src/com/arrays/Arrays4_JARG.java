package com.arrays;

public class Arrays4_JARG {

	public static void main(String[] args) {
		//Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}.
		int [] numeros1 = {1,2,3,4,5};
		int [] numeros2 = new int[numeros1.length];
		for (int i = 0; i < numeros1.length; i++) {
			numeros2[i]=numeros1[numeros1.length -1 -i];
		}
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
	}

}
