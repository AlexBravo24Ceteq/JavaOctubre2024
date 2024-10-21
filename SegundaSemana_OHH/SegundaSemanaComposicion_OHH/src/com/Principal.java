package com;

public class Principal {

	public static void main(String[] args) {
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("Kingstone", "DDR5", 16);
		Procesador amd = new  Procesador("AMD", "Ryzen 5", 4);
		Laptop hp = new Laptop("HP", "440G7", "Plata", disco, memoria, amd);
		
		System.out.println(hp);
	}
}
