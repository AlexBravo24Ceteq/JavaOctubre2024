package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear una laptop
		// Pero cuando estamos en composicion, es decir
		//que objetos más pequeños componen uno más grande
		//nececitamos primero crear los pequeños y finalmente 
		//el más grande para pasarle dichos valores

		
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("Kingston", "DDR5", 16);
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4);
		
		Laptop hp = new Laptop("HP", "44067", "Plata", disco, memoria, amd);
		System.out.println(hp);
	}//end

}
