package com.arrays;

public class Array2_SJP {

	public static void main(String[] args) {
		//EJERCICIO 2:
		//Crea un array de números de 100 posiciones, que contendrá los números del 
		//1 al 100. Obtén la suma de todos ellos y la media.

		int [] enteros = new int[100];
		int suma = 0;
		
		//System.out.println("Secuencia del 1 al 100:"); //Si queremos mostrar la secuencia de numeros
		for (int i=0; i < enteros.length; i++){
			enteros [i] = i+1;
		//	System.out.println(enteros[i]); //Imprime los numeros del 1 al 100
			suma = suma + enteros[i];
		}
		System.out.println("La suma total de los numeros del 1 al 100 es: " + suma);
		float media = (float)suma/enteros.length;
		System.out.println("Así mismo, la media es: " + media);
	}

}
