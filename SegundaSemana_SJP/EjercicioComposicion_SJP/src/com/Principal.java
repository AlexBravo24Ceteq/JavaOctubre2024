package com;

public class Principal {

	public static void main(String[] args) {
		
		// Crear Laptop
		//Cuando estamos en composicion, objetos m�s peque�os componen
		//uno m�s grande, necesitamos crear los peque�os y finalmente
		//el m�s grande para pasarle valores.
		
		Bateria carga = new Bateria("Carga USB", "1200 mAh", "30 Hrs");
		Audio sonido = new Audio("NC/Ambiente", "DSEE EXTREME", 48, 102);
		Conectividad conector = new Conectividad("Cable/Bluetooth", 5.2, 2.4);
		
		Audifonos sony= new Audifonos("SONY", "WH-1000XM5", "Negro", carga, sonido, conector);
		
		System.out.println(sony);

		
	}

}
