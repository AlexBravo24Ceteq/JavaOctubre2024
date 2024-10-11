package com.arrays;

public class Arrays4_FAHT {

	public static void main(String[] args) {
		//Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
		//Guardar los valores de este array en otro array distinto 
		//pero con los valores invertidos, 
		//es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.

		int [] numeros = {1,2,3,4,5};
		
		int [] numerosinv = new int [numeros.length];
		
		for (int i = 0; i < 5; i++) {
			numerosinv[i] = numeros[numeros.length-1-i];
		}
		
		System.out.println("Array invertido: ");
		for (int i = 0; i < numerosinv.length; i++) {
			System.out.println(numerosinv[i]);
		}
		
	}//end
}
