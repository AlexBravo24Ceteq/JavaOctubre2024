package com;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 *  Vamos a crear una laptop
		 *  Pero cuando estamos en composicion, es decir,
		 *  que objetos mas pequeños componen uno más grande
		 *  necesitamos crear los pequeños y finalmente
		 *  el más grande para pasarle dichos valores
		 */
		
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("Kingston", "DDR5", 16);
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4);
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", disco, memoria, amd);
		
		System.out.println(hp);
		
		//Van a crear un nuevo proyecto que se llame 
		//EjercicioComposicion INICIALES 
		//Y van a crear un obieto de Composicion. 
		//un objcto que tonga sus propios atributos y se componga de 
		//por lo menos otros 3 obietos 
		//EJEMPLO: Celular - marca, modelo, color, Pantalla, Procesador, Camara 
		//Carro - marca, modelo, color, Llantas, Motor, Sonido

	}

}
