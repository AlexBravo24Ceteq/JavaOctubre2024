package com.arrays;

public class Arrays2_FAHT {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. 
		//Obtén la suma de todos ellos y la media.

		int suma=0;
		
		int [] numeros = new int [100];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i+1;
			suma += numeros[i];
		}
		double media= suma/(double)numeros.length;
		
		System.out.println(" La suma de los num 1 al 100 es: "+suma);
		System.out.println(" La media de los num 1 al 100 es: "+media);
		
	}//END

}
