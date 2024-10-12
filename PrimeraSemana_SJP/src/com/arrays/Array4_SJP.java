package com.arrays;

import java.util.Scanner;

public class Array4_SJP {

	public static void main(String[] args) {
		//EJERCICIO 4
		//Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}.
		
		int [] numeros = {1,2,3,4,5};
		int [] numerosInv = new int [numeros.length];
		System.out.println("Array con valores invertidos: ");
		//Declaramos "j", variable donde guardaremos las nuevas posiciones.
		for (int i=(numeros.length-1), j=0; i >= 0; i--, j++) {
				numerosInv[j] = numeros[i]; 
				System.out.println(numerosInv[j]);
		}
//		System.out.println("Comprobador de Posiciones. Ingrese una posición: ");
//		Scanner p = new Scanner(System.in);
//		int pos = p.nextInt();
//		System.out.println("Posición " + pos + " en cada Array es:");
//		System.out.println(numerosInv[pos] + " - " + numeros[pos]);
	}

}
