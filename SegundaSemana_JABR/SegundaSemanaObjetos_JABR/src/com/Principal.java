package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el
		//método main que es la que se encargará
		//de ejecutar todo el proyecto. Las demás clases
		//las iremos creando para modelar objetos
		
		//Vamos a probar a crear nuestro primer Almacen
		
		Almacenes alimentos = new Almacenes();
		
		//Vamos a ver la forma "incorrecta" de asignarle valor
		//a los atributos de nuestro almacen
		//alimentos.tipoAlmacen="Almacen de Viveres";
		
		//Probando el constructor con todos los argumentos
		Almacenes carros = new Almacenes("Bodega", "Autos", "CDMX", false);
		
		//Probar el constructor con solo dos argumentos
		Almacenes ladrillos = new Almacenes("Ladrillos", false);
		

		//Probar los métodos set para establercele valor a nuestro objeto vacio
		alimentos.setTipoAlmacen("Almacen de Víveres");
		//alimentos.setCapacidad(10);
		//Si quisieramos cambiar un valor estatico, en este caso la capacidad
		//de un almacen, en realidad se cambia para TODOS, y se llama a través
		//del método set, pero que ahora es propio de la clase
		//Almacenes.setCapacidad(1000);
		
		//Vamos a intentar mandar a imprimir nuestros objetos en consola
		System.out.println(alimentos);
		
		//Ej. imprimir un atributo de un objeto
		System.out.println(ladrillos.getTipoProductos());
		
		//Ej. imprimir al almacen con todos los atributos
		System.out.println(carros);
		
		//Van a crear 5 clases para crear 10 objetos
		//Cada clase va a contar con minimo 3 atributos, máximo los que ustedes quieran
		//De cada clase van a crear 2 objetos, uno vacio y uno con todos los argumentos
		//Al vacio posteriormente le asignan algunos valores con los setters
		//Y los manda a imprimir en esta misma clase Principal
		
		
		//Ej. Voy a crear una clase que me permita crear relojes
		
		Reloj samsung = new Reloj();
		
		Reloj nivada = new Reloj("Nivada", 10000, "Zafiro", "Cuero", true);
		
		samsung.setMarca("Samsung S4");
		samsung.setManecillas(false);
		
		System.out.println(samsung);
		System.out.println(nivada);
		
		
		
		
		
	}

}
