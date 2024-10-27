package com.ciclos;

import java.util.Scanner;

public class Ciclos2DCGG {

	public static void main(String[] args) {
//		2. programa un algoritmo que realice la tabla de multiplicar de un numero
//		introducido desde teclado, hasta la iteración deseado por el usuario.
//		ejemplo: tabla de 23 hasta el 95, 23 x 95??
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que realice la tabla de multiplicar");
		System.out.println("¿Que tabla desea calcular? (ejemplo: tabla del 9): ");
		int numero = entrada.nextInt();
		System.out.println("¿Hasta que iteración? (ejemplo: hasta el 8):");
		int iteracion = entrada.nextInt();
		
		System.out.println("Calculando..");
		for(int i = 1; i <= iteracion; i++) {
			System.out.println(i+" x "+numero+" = "+ (i*numero));
		}
		
		entrada.close();

	}

}
