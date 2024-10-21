package com;

public class Principal {

	public static void main(String[] args) {
		//En la POO solo debe existir una clase con el
		//metodo main que es la que se encarga
		//de ejecutar todo el proyecto. Las demas clases
		//las iremos creando para modelar objetos
		
		//Vamos a probar a crear nuestro primer almacen
		
		Almacen alimentos = new Almacen();
		
		//Vamos a ver la forma "Incorrecta" de asignar valor
		// a los atributos de nuestro almacen
		
		//alimentos.tipoAlmacen = "Almacen de Viveres";
		
		//Probando el constructor con todos los argumentos
		Almacen carros = new Almacen("Bodega","Autos","CDMX",1000,false);
		//Probar el contrusctor con solo dos argumentos
		Almacen ladrillos = new Almacen("Ladrillos", false);
		//Probar los metodos set para establecerle valor a nuestro objeto vacio
		alimentos.setTipoAlmacen("Almacen de Viveres");
		alimentos.setCapacidad(10);
		//Vamos a intentar mandar a imrpimir nuestros objetos en consola
		System.out.println(alimentos);
		//Ej. imprimir un atributo de un objeto
		System.out.println(ladrillos.getTipoProductos());
		//Ej.imprimir objeto carros
		System.out.println(carros);
		
		//Crear 5 clases para crear 10 objetos
		//Cada clase va a contar con minimo 3 atributos
		//De cada clase van a crear 2 objetos, uno vacio y uno con todos los argumentos
		//Al vacio posteriormente le asignan algunos vaolres con los setters
		//Y los manda a imprimir en esta misma clase Principal
		
		Consolas xbox = new Consolas();
		xbox.setNombre("Xbox Series S");
		xbox.setCantidad(0);
		xbox.setExistencias(false);
		
		Consolas nswitch = new Consolas("Nintendo Switch", "Nintendo", 25, true);
		
		System.out.println(xbox);
		System.out.println(nswitch);
		
		TarjetasGraficas amd = new TarjetasGraficas();
		amd.setNombre("AMD Radeon RX 7900 XTX");
		amd.setCantidad(3);
		amd.setTdm("GDDR6");
		
		TarjetasGraficas nvidia = new TarjetasGraficas("NVIDIA GeForce RTX 4060", "NVIDIA", "GDDR6", 90, 8);
		
		System.out.println(amd);
		System.out.println(nvidia);
		
		Pantallas lg = new Pantallas();
		lg.setNombre("LG Smart Tv 32");
		lg.setExistencias(true);
		
		Pantallas hisense  = new Pantallas("Hisense H4F Series", "Hisense", 25, 32, true);
		
		System.out.println(lg);
		System.out.println(hisense);
		
		Leches alpura = new Leches();
		alpura.setNombre("Alpura Selecta 12 Pack");
		alpura.setMarca("Alpura");
		alpura.setCantidad(15);
		
		Leches lala = new Leches("Yomi Lala", "Lala", "Chocolate", 40);
		
		System.out.println(alpura);
		System.out.println(lala);
		
		Procesadores intel = new Procesadores();
		intel.setNombre("Intel Core i5-12400F");
		intel.setModelo("BX8071512400F");
		intel.setCache("18 MB");
		intel.setCantidad(25);
		intel.setExistencias(true);
		
		Procesadores pamd = new Procesadores("AMD Ryzen 5 5500", "AMD", "100-100000457BOX", "16 MB", 0, false);
		
		System.out.println(intel);
		System.out.println(pamd);
	}

}
