package com.ciclos;

import java.util.Scanner;

public class Ciclos2_GLP {

	public static void main(String[] args) {
		/*
		 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
			introducido desde teclado, hasta la iteración deseada por el usuario. 
			Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??? 
		*/
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el numero Multiplicando");
		int multiplicando = entrada.nextInt();
		
		System.out.println("Ingresa el numero Multiplicador hasta donde multiplicara");
		int multiplicador = entrada.nextInt();
		
		
		for (int i = 1; i <= multiplicador; i++) {
			System.out.println(i + " x " + multiplicando + " = "+(i * multiplicando));
		}
		
		entrada.close();
	}

}
