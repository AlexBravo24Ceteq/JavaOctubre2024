package com.ciclos;

public class Ciclos5_OHH {

	public static void main(String[] args) {
		// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		//de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona
		//tendr� al cabo de un a�o si todo el dinero lo reinvierte?

		double inversion=1000, interes; 
		
		
		for (int i = 1; i<=12; i++) {
			interes = inversion * 0.02;
			inversion += interes;
		}
		System.out.println("Inversi�n Inicial: $1000");
		System.out.println("Inter�s mensual: 02%");
		System.out.print("Total acumulado en 12 meses, si se reinvierte todo el dinero: $");
		System.out.printf("%.02f",inversion);
	}

}
