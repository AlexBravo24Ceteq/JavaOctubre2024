package com.arrays;
import java.util.Scanner;
public class Arrays1_EGS {
	 public static void main(String[] args) {
	        // Introducir valores a un arreglo
	        Scanner consola = new Scanner(System.in);
	        
	        int[] enteros = new int[10];
	        
	        for(int i=0; i < enteros.length; i++){
	            System.out.print("Proporciona un entero para la posicion[" + i + "]: ");
	            enteros[i] = consola.nextInt();
	        }
	        
	        System.out.println("\nImpresión del Arreglo: ");
	        
	        for(int i=0; i < enteros.length; i++)
	            System.out.println("entero[" + i + "] = " + enteros[i]);
	    }

}
