package com;

public class Principal {

	public static void main(String[] args) {
		//vamos acrear una laptop pero cuando estamos en composicion 
		//es decir que objetos mas pequeños componen uno mas grande necesitamos 
		//primero crear los pequeños y finalmente el mas grande para pasarle los valores
		
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("KINSTONG", "DDR5", 16);
		Procesador amd = new Procesador("AMD", "Ryzer 5", 4);
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", disco, memoria, amd);
		
		System.out.println(hp);
		
		//vamos acrear un nuevo proyecto que se llame composicion _inici
		//y van acrear un objeto de composicion 
		//un objeto que tenga sus propios atributos y que se compongan por lo menos de otros tres objetos 
		// ejemplo celular celular , modelo, color, pantalla, procesador, camara
		//

	}

}
