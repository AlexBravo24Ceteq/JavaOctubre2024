package com.ciclos;

public class Ciclos5_OHH {

	public static void main(String[] args) {
//		5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
//		de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
//		tendrá al cabo de un año si todo el dinero lo reinvierte?
	
		double inversion = 1000, interesMensual = 0.02, interesGanado;
		int mes = 1;
		
		do {
			System.out.println("Inversio del mes " + mes + " = " + String.format("%.2f", inversion));
			interesGanado =  inversion * interesMensual;
			System.out.println("Ganancia del 2%" + " = " +  String.format("%.2f", interesGanado));
			inversion += interesGanado;
			System.out.println("Total del mes " + mes + ": " + String.format("%.2f", inversion));
			System.out.println("*************************************");
			mes++;
		}while(mes <= 12);
		
	}

}
