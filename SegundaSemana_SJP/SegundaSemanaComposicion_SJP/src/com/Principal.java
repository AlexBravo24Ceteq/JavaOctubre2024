package com;

public class Principal {

	public static void main(String[] args) {
		
		// Crear Laptop
		//Cuando estamos en composicion, objetos más pequeños componen
		//uno más grande, necesitamos crear los pequeños y finalmente
		//el más grande para pasarle valores.
		
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("Kingston", "DDR5", 8);
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4);
		
		Laptop hp= new Laptop("HP", "4400G7", "Plata", disco, memoria, amd);
		
		System.out.println(hp);
		
		//EjercicioComposicion_SJP
		//Un objeto que se componga de, por lo menos, tres objetos.
	}

}
