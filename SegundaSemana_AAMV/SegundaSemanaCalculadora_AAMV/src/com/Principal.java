package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica casio = new Cientifica();
		
		casio.sumar(29, 40);
		casio.restar(20, 10);
		casio.multiplicar(5, 5);
		casio.dividir(50, 5);
		
		casio.tomarTemperatura(); //Asi se simula el metodo de la multiherencia permitiendonos tomar comportaminetos de otra clase.

	}

}
