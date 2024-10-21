package com;

//La multiherencia en Java no existe
//Es decir, una clase hija no puede tener dos clases Padre
//Aqui en Java se puede simular el tema de la multiherencia
//con el uso de interfaces
//La implementacion de una interface o más de una
//Se hace con la palabra reservada implements
public class Cientifica extends Calculadora implements ITermometro {

	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma es : " + (a+b));
	}

	@Override
	public void restar(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	//Nuestros objetos pueden tomar comportamientos de 3 lados:
	
	/*1. De sus clases y métodos propios
	 *2. De otras clases herendadolos, incluyendo clases abstractas
	 *3. De interfaces
	 * 
	 */
	
	
	

}
