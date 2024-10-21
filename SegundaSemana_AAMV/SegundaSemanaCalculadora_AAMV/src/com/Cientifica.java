package com;

//La multiherencia en Java no existe
//Es decir, una clase hija no puede tener 2 clases Padre
//Aqui en Java se puede simular el tema de la multiherencia
//con el uso de interfaces.

//La implementacion de una interface o mas de una
//se hace con la palabra reservada implements
//podemos implementar mas de 1 interface
public class Cientifica extends Calculadora implements ITermometro {

	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma es : " + (a+b));
		
	}

	@Override
	public void restar(int a, int b) {
		System.out.println("La resta es : " + (a-b));
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("La multiplicacion es : " + (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("La divisiom es : " + (a/b));
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	//NUestros objetos pueden tomar comportamientos de 3 lados:
	
	/*1.- De sus clases y metodos propios
	 *2.- De otras clases heredandolos incluyendo clases abstractas
	 *3.- De interfaces
	 * 
	 */
	
	

}
