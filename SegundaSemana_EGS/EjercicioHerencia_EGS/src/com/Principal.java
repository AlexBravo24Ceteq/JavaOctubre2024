package com;

public class Principal {

	public static void main(String[] args) {
		
		Mamifero chilly = new Mamifero("Perro", true, 5000, "Chilly", 18, 3.40);
		Ave rob = new Ave("Cotorro", true, 1500, "rob", 5, 0.525);
		System.out.println("*** Tienda de animales ***" + "\n*** Animales Disponibles ***");
		System.out.println();
		System.out.println(chilly);
		System.out.println();
		System.out.println(rob);
		
	}

}
