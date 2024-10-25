package com;

public class Principal {

	public static void main(String[] args) {
		//  Vamos a crear una laptop
		//Pero cuando estamos en composicion, es decir, 
		//que objetos mas pequeños componen uno mas grande
		//necesitamos primero crear los pequeños y finalmente
		//el mas grande para pasarle dichos valores
		
		//Estos son los objetos pequeños llenar las clases
		Almacenamiento disco = new Almacenamiento("ADATA", "A1", 480);
		Ram memoria = new Ram("Kingston", "DDR5", 16);
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4);
		
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", disco, memoria, amd);
		
		System.out.println(hp);
		
		//Vamos a crear un nuevo proyecto que se llama 
		//EjercicioComposicion_Iniciales
		//y vamos a crear un objeto de composicion.
		//Un objeto que tenga sus propios atributos y se componga de
		//por lo menos 3 objetos
		
		

	}

}
