package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear una Laptop
		//pero cuando estamos en composicion, es decir
		//que objetos mas pequeños componen uno mas grande
		//necesitamos primero crear los pequños y finalmente
		//el mas grande para pasarle dichos valores
		
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("Kingston", "DDR5", 16);
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4);
		
		Laptop hp = new Laptop("hp", "440g7", "Plata", disco, memoria, amd);
		
		System.out.println(hp);
		
		//Van a crear un nuevo proyecto que se llame
		//EjercicicoComposicion_INICIALES
		//Y van a crear un objeto de Composicion
		//Un ojeto que tenga sus propios atributos y se componga de 
		//por lo menos otros 3 objetos
		//EJEMPLO: Celular = marca, modelo, color, pantalla, procesador, camara
		//Carro = marca, modelo, color, llantas, motor, sonido

	}

}
