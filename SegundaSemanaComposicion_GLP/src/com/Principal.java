package com;

public class Principal {
	
	public static void main(String[] args) {
		//POO. Composicion
		//Se refiere a un objeto creado por otros objetos especificos

		//Vamos a crear una laptop
		//Pero cuando estamos en composicion, es decir,
		//Necesitramos primero crear los peque;os y finalmente
		//el mas grande para pasarle dichos valores
		
		Almacenamiento disco = new Almacenamiento("ADATA", "a1", 480);
		Ram memoria = new Ram("Kingston", "DDR5", 8);
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4);
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", disco, memoria, amd);
		
		System.out.println(hp);
		
		//Van a crear un nuevo proyecto que se llame
		// ejercicioComposicion_GLP
		//Un objeto que tenga sus propios atributos y se componga de
		//por lo menos otros 3 objetos
		//Ejmpolo: Celular-marca, modelo, color, pantalla, procesador, camara
		//carro - marca, modelo, color, llanata, motor, sonido
	}

}
