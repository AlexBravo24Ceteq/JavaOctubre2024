package com.Ciclos;

public class Ciclos5_AGAH {

	public static void main(String[] args) {
		/*
		 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
tendrá al cabo de un año si todo el dinero lo reinvierte?
		 */

		System.out.println("Programa para determinar cuando tendra de gancia en un año");
		
		double inv=1000;
		double inver_ini=inv;
		double interes = 0;
		
		for(int i=1; i<=12; i++) {
			interes=inv*.02;
			inv=inv+interes;
			System.out.println("la ganancia en el mes " + i + " es: "+ interes);
		}
		System.out.println("la ganancia obtenida durante todo el año es: " + (inv - inver_ini) );
		System.out.println("la ganancia total ya con inversion en todo el año es: " + inv);
	}

}
