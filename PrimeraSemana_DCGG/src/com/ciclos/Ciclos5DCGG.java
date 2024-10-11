package com.ciclos;

public class Ciclos5DCGG {

	public static void main(String[] args) {
//		5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
//		de inter�s mensual. �C�al ser� la cantidad de dinero que esta persona
//		tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		
		// usando la f�rmula de inter�s compuesto:
		/*
		 * A = P(1+(r/n))^n*t
		 * donde:
		 * A es la candidad final de dinero
		 * P es el monto inicial (para este problema el monto es de 1000
		 * r es la tasa de inter�s anual en formato decimal. Si el inter�s es mensual, multiplicamos la tasa mensual por 12 para tener 
		 * la tasa anual
		 * n es el n�mero de periodos de inter�s por a�o (en este caso, n=12 porque el inter�s es mensual
		 * t es el tiempo en a�os(en este caso , 1 a�o)
		 * 
		 * en concreto:
		 * P = 1000.00
		 * r = 2% mensual = 0.02 (forma decimal)
		 * n = 12 (inter�s compuesto mensual)
		 * t = 1 a�o
		 * */
		
		double inversion = 1000;
		double interes = 0.02;
		int periodos = 12;
		int tiempo = 1;
		
		System.out.println("Programa que calcula la inversion de una cierta cantidad con interes del 2% reinvirtiendo mensualmente");
		System.out.println("�Si la inversion es de $1000, cuanto ser� la ganancia al final del a�o?");
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
		System.out.printf("La cantidad de dinero al cabo de un a�o es: $%.2f \n", total);
		
		

	}

}
