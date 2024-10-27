package com.ciclos;

public class Ciclos1_EGS {

	public static void main(String[] args) {
		//Programa un algoritmo que realice la tabla de multiplicar del 12
		
		System.out.println("*** Tabla del 12 ***\n");
		int i= 1;
		final int NUMERO = 12;
		
		while(i<13) {
			int resultado = i * NUMERO;
			System.out.printf("%d x 12 = %d\n", i, resultado);
			i++;
		}

	}

}
