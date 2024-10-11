package com.ciclos;

import java.util.Scanner;

public class Ciclos2_OHH {

	public static void main(String[] args) {
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
//		introducido desde teclado, hasta la iteración deseada por el usuario.
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??
		
		int multiplicando, multiplicador, resultado;
		int contador = 1;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa el valor del multiplicando (MULTIPLICANDO x multiplicador)");
		multiplicando = entradaDatos.nextInt();
		System.out.println("Ingresa el valor del multiplicador (multiplicando x MULTIPLICADOR)");
		multiplicador = entradaDatos.nextInt();
		entradaDatos.close();
		
		while(contador <= multiplicador) {
			resultado = multiplicando * contador;
			System.out.println(multiplicando + " x " + contador + " = " + resultado);
			contador++;
		}
	}

}
