package com.arrays;

public class Arrays2_AGAH {

	public static void main(String[] args) {
		/*
		 * 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
1 al 100. Obt�n la suma de todos ellos y la media
		 */

		 int[] numeros = new int[100];
	        
	        int suma=0;
	        double media;
	        
	        
	        for(int i=0;i<numeros.length;i++){
	            numeros[i]=i+1;//Se van almacenando todos los valores del 1 al 100 
	            System.out.println("El valor en la posicion " + i + " = " + numeros[i]);
	            suma+=numeros[i];
	        }
	        
	        System.out.println("La suma es "+suma);
	        
	        media=(double)suma/numeros.length;
	        
	        System.out.println("La media es: "+media);
	}

}
