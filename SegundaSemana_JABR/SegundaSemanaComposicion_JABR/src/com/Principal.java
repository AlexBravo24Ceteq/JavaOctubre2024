package com;

public class Principal {

	public static void main(String[] args) {
		
		// Vamos a crear una Laptop
		//Pero cuando estamos en composicion, es decir,
		//que objetos m�s peque�os componen uno m�s grande
		//necesitamos primero crear los peque�os y finalmente
		//el m�s grande para pasarle dichos valores
		
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("Kinsgton", "DDR5", 16);
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4);
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", disco, memoria, amd);
		
		System.out.println(hp);
		
		//Van a crear un nuevo proyecto que se llame
		//EjercicioComposicion_INICIALES
		//Y van a crear un objeto de Composicion.
		//Un objeto que tenga sus propios atributos y se componga de
		//por lo menos otros 3 objetos
		//EJEMPLO: Celular - marca, modelo, color, Pantalla, Procesador, Camara
		//Carro - marca, modelo, color, Llantas, Motor, Sonido
		

	}

}
