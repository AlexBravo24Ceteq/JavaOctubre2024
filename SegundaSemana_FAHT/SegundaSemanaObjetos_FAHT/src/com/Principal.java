package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe exitor una clase con el 
		// método main que es el eque se encargará
		//de ejecutar todo el proyecto. Las demas clases
		// las iremos creando para modelar objetos

		//Vamos a probar crear nuestro primer Almacen
		
		Almacenes alimentos = new Almacenes();
		
		
		// vamos a ver la forma "incorrecta" de asignarle valor
		// a los atributos de nuestro almacen
		//alimentos.tipoAlmacen="Almacen de viveres";
		
		//Probando el constructor con todos los argumentos
		Almacenes carros = new Almacenes("Bodega","Autos","CDMX",false);
		
		//vamos a probar el constructor con solo dos argumentos
		Almacenes ladrillos = new Almacenes("Ladrillos", false);
		
		//Probamos los metodos set para establecer valor a nuestro objeto vacio
		alimentos.setTipoAlmacen("Almacen de viveres");
		//alimentos.setCapacidad(10);
		// si quisieramos cambiar un valor estatico, en este caso la capacidad 
		//de un almacen, en realidad se cambia para TODOS, y s ellama a travez
		// del metodo set, pero ahora es propio de la clase
//		Almacenes.setCapacidad(1000);
		
		//Vamos a intentar mandar a imprimir nuestrosobjetos en consola
		System.out.println(alimentos);
		
		//ej. imprimir un atributo de un objeto
		System.out.println(ladrillos.getTipoProductos());
		
		//ejemplo imprimir al alamacen con todos los atributos
		System.out.println(carros);
	
		//   *********Clase 1**********
		System.out.println(" ");
		System.out.println("*********Clase 1**********");
	Pastel chocolate = new Pastel(); // vacio
	chocolate.setExistencia(false);
	chocolate.setPrecio(500);
	chocolate.setSabor("Chocolate amargo");
	chocolate.setTamaño('M');
	System.out.println(chocolate);
	
	Pastel fresa = new Pastel("Fresas con crema", 450, 'G', true);
	System.out.println(fresa);
	
//  *********Clase 2**********
		System.out.println(" ");
		System.out.println("*********Clase 2**********");
	Mascotas perro = new Mascotas(); // vacio
	perro.setAgresivo(false);
	perro.setAnimal("Perro");
	perro.setEdad(3);
	perro.setPrecio(400);
	System.out.println(perro);
	
	Mascotas hamster = new Mascotas("Hamster", 40, 1, true);
	System.out.println(hamster);
	
//  *********Clase 3**********
		System.out.println(" ");
		System.out.println("*********Clase 3**********");
	Carros Audi = new Carros(); // vacio
	Audi.setColor("Rojo");
	Audi.setMarca("Audi A1");
	Audi.setNuevo(false);
	Audi.setPrecio(450000);
	System.out.println(Audi);
	
	Carros mustang = new Carros("Ford Mustang", "Negro", 650000, true);
	System.out.println(mustang);
	
//  *********Clase 4**********
		System.out.println(" ");
		System.out.println("*********Clase 4**********");
	Helados vainilla = new Helados(); // vacio
	vainilla.setExistencia(true);
	vainilla.setPrecio(25);
	vainilla.setSabor("Vainilla");
	System.out.println(vainilla);
	
	Helados cafe = new Helados("Café", 20, true);
	System.out.println(cafe);
	
//  *********Clase 5**********
		System.out.println(" ");
		System.out.println("*********Clase 5**********");
	Lozas galaxy = new Lozas(); // vacio
	galaxy.setColor("Beige");
	galaxy.setNombre("Galaxy tab 23 x 50");
	galaxy.setPrecio(350);
	galaxy.setProduccion(true);
	System.out.println(galaxy);
	
	Lozas azteca = new Lozas("Azteca 35 x 35", "Cafe", 500, false);
	System.out.println(azteca);
	
}//end
}
