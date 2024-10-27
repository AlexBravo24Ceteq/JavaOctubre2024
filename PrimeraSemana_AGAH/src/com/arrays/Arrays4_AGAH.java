package com.arrays;

public class Arrays4_AGAH {

	public static void main(String[] args) {
		/*
		 * 4. Dado un array de números de 5 posiciones con los siguientes valores:
{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
los valores invertidos, es decir, que el segundo array deberá tener los valores 
{5,4,3,2,1}.

		 */
		
		int [] array1 = {1,2,3,4,5};
		int [] array2 = new int[array1.length];
		
		for (int i = (array1.length-1), j=0; i>=0; i--,j++) {
			array2[j]=array1[i];
			//System.out.print(array2[j]);
		}
		
		System.out.println("La cadena original es: ");
		
		for (int item:array1) {
			System.out.print("\t" + item);
		}
		
		System.out.println("");
		System.out.println("La cadena inversa es: ");
		
		for(int item:array2) {
			System.out.print("\t" + item);
		}

	}

}
