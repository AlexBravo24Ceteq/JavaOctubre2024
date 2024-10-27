package com.ciclos;
import java.util.Scanner;

public class Ciclos2_EGS {

	public static void main(String[] args) {
		/*
		 * Programa un algoritmo que realice la tabla de multiplicar de un numero
		 * introducido desde teclado, hasta la iteración deseada por el usuario.
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */
		
		Scanner consola = new Scanner(System.in);
		System.out.println("*** Tablas de multiplicar ***");
		System.out.print("\nIntroduce el numero a multiplicar: ");
		int numeroMultiplicar = consola.nextInt();
		System.out.print("\nIntroduce el numero de iteraciones: ");
		int numeroIteraciones = consola.nextInt();
		consola.close();
		for(int i=1;i<=numeroIteraciones;i++) {
			int $resultado = numeroMultiplicar * i;
			System.out.printf("\n %d x %d = %d", numeroMultiplicar, i, $resultado);
		}
	}

}
