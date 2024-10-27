package com;

public class Principal {

	public static void main(String[] args) {
		Almacen alimentos = new Almacen();
		//clase //instancia
//		estableciendo oun valor con set al elemento vacio
		alimentos.setTipoAlmacen("Almacen de Víveres");
//		alimentos.setCapacidad(10);}
//		Almacen.setCapacidad(10000);
		
//		forma incorrecta de asignar valores a nuestro almacen
//		alimentos.tipoAlmacen =  "Almacen de alimentos";
		
		Almacen carros = new Almacen("Bodega", "autos", "CDMX", false);

		//		dos argumentos en el constructor
		Almacen ladrillos = new Almacen("ladrillos", false); 
		
//		imprimiendo objetos en cosola y los traemos con get
		System.out.println("Tipo de almacen: "+alimentos.getTipoAlmacen());
		System.out.println("Tipo de productos: "+ladrillos.getTipoProductos());
		
//		Imprimiendo con toString del metod alamcen
		System.out.println(alimentos);
		System.out.println(carros);
		
		System.out.println();
		System.out.println(" *********** EJERCICIO 1.1*********** ");
		System.out.println("Clase Persona: ");
		Persona nuevaPersona = new Persona();
		nuevaPersona.setNombre("Antonio");
		nuevaPersona.setEdad(18);
		Persona nuevaPersona2 =  new Persona("Juan", "Torres", 26);
		System.out.println(nuevaPersona);
		System.out.println(nuevaPersona2);
		
		System.out.println();
		System.out.println(" *********** EJERCICIO 1.2*********** ");
		System.out.println("Clase Perro: ");
		Perro nuevaMascota = new Perro();
		nuevaMascota.setRaza("Mestizo");
		nuevaMascota.setBanarlo(true);
		Perro nuevaMascota2 =  new Perro("Guantes", "Mestizo", "55 55 55 55 55 55", true);
		System.out.println(nuevaMascota);
		System.out.println(nuevaMascota2);
		
		System.out.println();
		System.out.println(" *********** EJERCICIO 1.3*********** ");
		System.out.println("Clase Audio: ");
		Audio nuevoAudio =  new Audio();
		nuevoAudio.setDuracion(90);
		nuevoAudio.setCalificacion(4);
		Audio nuevoAudio2 =  new Audio("NNN", "pop", 210, 3);
		System.out.println(nuevoAudio);
		System.out.println(nuevoAudio2);
		
		System.out.println();
		System.out.println(" *********** EJERCICIO 1.4*********** ");
		System.out.println("Clase Rompecabezas: ");
		Rompecabezas nuevoRompecabezas = new Rompecabezas();
		nuevoRompecabezas.setNombreRompecabezas("Paisaje #100");
		nuevoRompecabezas.setPrecio(500.80);
		Rompecabezas nuevoRompecabezas2 = new Rompecabezas("DBZ 500pzs", "Toei", 1000, 200.56, true);
		System.out.println(nuevoRompecabezas);
		System.out.println(nuevoRompecabezas2);
		
		System.out.println();
		System.out.println(" *********** EJERCICIO 1.5*********** ");
		System.out.println("Clase Libro: ");
		Libro nuevoLibro = new Libro();
		nuevoLibro.setDisponibilidad(false);
		nuevoLibro.setNombreLibro("Teología cuántica");
		nuevoLibro.setEditorial("Las prensas de ciencia");
		Libro nuevoLibro2 = new Libro("Cosas que hacen BUMM", "Ciencia ficción", "Anagrama", 316.25, 15, true);
		System.out.println(nuevoLibro);
		System.out.println(nuevoLibro2);
	}
}
