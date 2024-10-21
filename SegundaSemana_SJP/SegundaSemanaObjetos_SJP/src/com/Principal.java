package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe de existir una clase con el metodo main.
		//Esta se encargara de ejecutar todo el proyecto.
		//Las demás clases serviran para modelar objetos.
		
		//Crear nuestro primer Almacen:
		
		Almacen alimentos = new Almacen(); //comodin
		
		//Forma "incorrecta" de asiganarle valor a los atributos de Almacen
		//alimentos.tipodeAlmacen = "Almacen de Viveres";
		//Al modificar el acceso en las variables asignadas, marca un error.
		
		//Constructor con todos los argmts.
		Almacen carros = new Almacen("Bodega", "Autos", "CDMX", false);
		
		//Constructor con dos argumentos
		Almacen ladrillos = new Almacen("Ladrillos", false);
		
		//Metodo set para establecer valor a objeto vacio
		alimentos.setTipodeAlmacen("Almacen de viveres");
		//alimentos.setCapacidad(10);
		//Si se quiere cambiar un valor estatico, se cambia para todos y se llama
		//a través del método set, que ahora es propio de la clase.
		//**Almacen.setCapacidad(1000);
		
		//Intentar mandar a imprimir objetos en consola
		System.out.println(alimentos);
		
		//Ej. Imprimir un atributo de un objeto
		System.out.println(ladrillos.getTipodeProductos());
		
		//Ej. imprimir almacen con todos los atributos
		System.out.println(carros);
		
		
		//Crear 5 clases para crear 10 objetos
		//Cada clase va a contar con minimo 3 atributos, máximo los que ustedes quieran
		//De cada clase van a crear 2 objetos, uno vacio y uno con todos los argumentos
		//Al vacio posteriormente le asignan algunos valores con los setters
		
		//EJ. PANTALLAS
		System.out.println("\nEj. 1------------------");
		Pantallas samsung = new Pantallas();
		Pantallas lg = new Pantallas("Lg OLED", "65 in", 20000, false);
		
		samsung.setMarca("Samsung QLED");
		samsung.setPrecio(24000);
		samsung.setSmartTV(true);
		
		System.out.println(samsung);
		System.out.println(lg);
		
		//EJ. JERSEY
		System.out.println("Ej. 2------------------");
		Jersey barcelona = new Jersey();
		Jersey puebla = new Jersey("Puebla", "Mediana", 1600, true);
		
		barcelona.setEquipo("Barcelona");
		barcelona.setTalla("Mediana");
		barcelona.setDisponible(false);
		
		System.out.println(puebla);
		System.out.println(barcelona);
		
		//EJ. LIBROS
		System.out.println("Ej. 3------------------");
		Libros compra = new Libros();
		Libros compra1 = new Libros("It (eso)", "Terror", 600, true);
		
		compra.setNombre("Cementerio de Mascotas");
		compra.setDisponible(false);
		
		System.out.println(compra);
		System.out.println(compra1);
		
		//EJ. CALCULADORA
		System.out.println("Ej. 4------------------");
		Calculadora cientifica = new Calculadora();
		Calculadora normal = new Calculadora("Normal", 120, true, 25);
		
		cientifica.setTipo("Cientifica");
		cientifica.setPrecio(299);
		cientifica.setDescuento(false);
		
		System.out.println(normal);
		System.out.println(cientifica);
		
		//EJ. BALONES
		System.out.println("Ej. 5------------------");
		Balones futbol = new Balones();
		Balones basquet = new Balones("Basquetbol","Caucho",300);
		
		futbol.setTipo("Futbol");
		futbol.setMaterial("Cuero");
		futbol.setPrecio(280);
		
		System.out.println(futbol);
		System.out.println(basquet);
	}

}
