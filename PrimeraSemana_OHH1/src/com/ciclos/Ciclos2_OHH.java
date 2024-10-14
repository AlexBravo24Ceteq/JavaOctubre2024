package com.ciclos;

import java.util.Scanner;

public class Ciclos2_OHH {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		//introducido desde teclado, hasta la iteración deseada por el usuario.
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

		Scanner entrada = new Scanner (System.in);
		
		int multiplicacion;
		
		System.out.println("Tabla de multiplicar");
		
		System.out.println("Ingresa un número: ");
				int numero = entrada.nextInt();
		
		System.out.println("Ingresa el número de la iteración: ");
				int iteracion = entrada.nextInt();
								
		System.out.println("La tabla de multiplicar del número "+numero+" es:"); 
	
	    for(int i=1; i<=iteracion; i++){ 
	
	    multiplicacion= numero *i; 
	
	    System.out.println(numero+ " X " +i+" = "+multiplicacion); 
	
	    }         
		    
		}
}
