package com.Ciclos;

public class Ciclos5_AGAH {

	public static void main(String[] args) {
		/*
		 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		 */

		System.out.println("Programa para determinar cuando tendra de gancia en un a�o");
		
		double inv=1000;
		double inver_ini=inv;
		double interes = 0;
		
		for(int i=1; i<=12; i++) {
			interes=inv*.02;
			inv=inv+interes;
			System.out.println("la ganancia en el mes " + i + " es: "+ interes);
		}
		System.out.println("la ganancia obtenida durante todo el a�o es: " + (inv - inver_ini) );
		System.out.println("la ganancia total ya con inversion en todo el a�o es: " + inv);
	}

}
