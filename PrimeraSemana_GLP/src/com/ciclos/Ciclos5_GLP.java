package com.ciclos;

public class Ciclos5_GLP {

	public static void main(String[] args) {
		/*
		 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
			de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
			tendrá al cabo de un año si todo el dinero lo reinvierte?
		 */
		
		/*Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el monto a invertir");*/
		
		Double dineroInvertido = 1000.00;
		
		
		for (int meses = 1; meses <=12 ; meses++) {
			dineroInvertido = dineroInvertido + ((2*dineroInvertido)/100);
			System.out.println(dineroInvertido);
		}
		
	}

}
