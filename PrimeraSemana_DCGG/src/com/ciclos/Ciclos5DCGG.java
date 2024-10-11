package com.ciclos;

public class Ciclos5DCGG {

	public static void main(String[] args) {
//		5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
//		de interés mensual. ¿Cúal será la cantidad de dinero que esta persona
//		tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		// usando la fórmula de interés compuesto:
		/*
		 * A = P(1+(r/n))^n*t
		 * donde:
		 * A es la candidad final de dinero
		 * P es el monto inicial (para este problema el monto es de 1000
		 * r es la tasa de interés anual en formato decimal. Si el interés es mensual, multiplicamos la tasa mensual por 12 para tener 
		 * la tasa anual
		 * n es el número de periodos de interés por año (en este caso, n=12 porque el interés es mensual
		 * t es el tiempo en años(en este caso , 1 año)
		 * 
		 * en concreto:
		 * P = 1000.00
		 * r = 2% mensual = 0.02 (forma decimal)
		 * n = 12 (interés compuesto mensual)
		 * t = 1 año
		 * */
		
		double inversion = 1000;
		double interes = 0.02;
		int periodos = 12;
		int tiempo = 1;
		
		System.out.println("Programa que calcula la inversion de una cierta cantidad con interes del 2% reinvirtiendo mensualmente");
		System.out.println("¿Si la inversion es de $1000, cuanto será la ganancia al final del año?");
		System.out.println("Calculando..");
		
		// calculando el factor
		double factor = tiempo + interes;
		
		for(int i = 1; i < periodos*tiempo; i++) {
			factor = factor * (tiempo + interes);
			System.out.printf("interes en el mes %d es: %.4f \n",i,factor);
		}
		
		// calculando la cantidad final
		double total = inversion * factor;
		System.out.println("");
		System.out.printf("La cantidad de dinero al cabo de un año es: $%.2f \n", total);
		
		

	}

}
