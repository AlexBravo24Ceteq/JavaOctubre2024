package com;

public class principal {

	public static void main(String[] args) {
		
		Cientifica suma = new Cientifica();
		suma.suma();
		System.out.println(suma);
				
		Cientifica resta = new Cientifica();
		resta.resta();
		System.out.println(resta);
		
		Cientifica multiplicacion = new Cientifica();
		multiplicacion.multiplicacion();
		System.out.println(multiplicacion);

		Cientifica division = new Cientifica();
		division.division();
		System.out.println(division);
		
		suma.tomarTemperatura();
		System.out.println(suma);
		
	}

}
