package com.ciclos;

public class Ciclos5_GLP {

	public static void main(String[] args) {
		/*
		 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
			de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
			tendr� al cabo de un a�o si todo el dinero lo reinvierte?
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
