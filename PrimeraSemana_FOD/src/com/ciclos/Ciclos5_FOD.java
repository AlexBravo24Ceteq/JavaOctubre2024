package com.ciclos;


public class Ciclos5_FOD {

	public static void main(String[] args) {

		double capIni = 1000.00;
		double tasaIntMen = 0.02;
		int meses = 12;
		double cantFin = capIni;
		
		for (int i = 0; i < meses; i++) {
			cantFin += cantFin * tasaIntMen;
		}
		
		System.out.printf("La cantidad final al cabo de un año es: $%.2f%n", cantFin);
		
	}

}
