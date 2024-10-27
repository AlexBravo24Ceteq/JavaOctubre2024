package com.ciclos;

public class Ciclos5_EGS {
	public static void main(String[] args) {
		/*
		 *  Una persona desea invertir $1000.00 en un banco, el cual le otorga 
		 *  un 2% de interés mensual. ¿Cuál será la cantidad de dinero 
		 *  que esta persona tendrá al cabo de un año si todo el dinero 
		 *  lo reinvierte?
		 */
		
		System.out.println("*** Calculadora de interes compuesto ***");
		int mes=1;
		final double INTERES=0.12;
		double suma=1000;
		while(mes<=12) {
			double resultado = suma * INTERES;
			suma += resultado;
			System.out.printf("\nLa ganancia del mes %d fue de: $%.2f", mes, resultado);
			System.out.printf("\nMonto a reinvertir: $%.2f", suma);
			mes++;
		}
	}
}
