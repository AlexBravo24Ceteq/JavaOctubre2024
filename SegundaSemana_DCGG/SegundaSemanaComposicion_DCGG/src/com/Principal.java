package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crewar una Laptop
		// pero cuando estamos en composicion, es decir,
		// que objetos más pequeñps componen uno mas grande
		// necesitamos primero crear los pequeños y finalmente 
		// el más grande para pasarle dichos valores
		
		Almacenamiento disco1 = new Almacenamiento("kingstonHDD", "K6", 500);
		Ram ram1 = new Ram("KingstonRAM", "KV6", 16);
		Procesador procesador1 = new Procesador("intel core", "i7", 4.2);
		Laptop dell = new Laptop("Dell", "E6430", "gris/negro",disco1 , ram1, procesador1);
		System.out.println(dell);
		
		// crear un nuevo proyecto que se llame 
		// EjercicioComposicion_iniciales
		// un objeto que tenga sus propios atributos y se componga de 
		// por lo menos otros 3 objetos
		// EJ: Celular - marca, modelo, color, Pantalla, Procesador, Camara.
		// EJ2: Auto - marca, modelo, color, Llantas, Motor, Sonido.
		
		

	}

}
