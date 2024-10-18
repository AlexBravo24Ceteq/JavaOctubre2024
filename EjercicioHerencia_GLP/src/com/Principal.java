package com;

public class Principal {

	public static void main(String[] args) {
		//Crear un nuevo proyecto llamado EjercicioHerencia_GLP
		//Crean una clase Padre que le ehrede sus atrributos y metodos
		//a una clase hija
		//Ej. Electrodomestico (Clase Padre)
		//Licuadora (Clase Hija)
		
		Animal ave = new Animal("Ave", 1, "Colibri");
		
		Perro marcus = new Perro("Marcus", 1, "Mediano", "Pitbull", "Miel");
		
		Gato nube = new Gato("Nube", 1, "Mediano", 7, "Whiskas");
		
		System.out.println(ave);
		System.out.println(marcus);
		System.out.println(nube);

	}

}
