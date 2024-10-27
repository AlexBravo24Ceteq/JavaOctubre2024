package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear una Laptp
		//Pero cuando estamos en composicion, es decir
		//que objeos mas pequeños componen uno mas grande
		//neceitamos primero crear los pequeños y finamente
		//el mas grande para pasarke dichos valores
		
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("Kingston", "DDR5", 16);
		Procesador amd = new Procesador("AMD", "Ryzen", 4);
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", disco, memoria, amd);
		
		System.out.print(hp);
		
		//Van a crear un nuevo proyecto que se llame
		//EjercicioComposicion_INICIALES
		//Y van a crear un objeto de composicion
		//Un objeto que tenga sus propios atributos y se componga de
		//por lo menos otros 3 objetos
		//EJEMPLO: Celular -marca, modelo, color, pantalla, procesador, camara
		//Carro - marca, modelo, color, llantas, motor, sonido

	}

}
