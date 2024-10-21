package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el
		//metodo main que es la quese encargara
		//de ejecutar todo el proyecto. Las demas clases
		//las iremos creando para modelar objetos
		
		//Vamos a probar a crear nuestro primer Almacen
		
		Almacen alimentos = new Almacen(); //Vacio comodin
		
		//Vamos a ver la forma incorrecta de asignarle valor
		// a los atributos de nuestro almacen
		//alimentos.tipodeAlmacen="Almacen de Alimentos";
		
		//Probando el constructor con todos los argumentos
		//Almacen Autos = new Almacen(tipodeAlmacen, tipodeproductos, direccion, capacidad, perecederos) ctrl espacio
		//salen las etiquetas
		Almacen carros = new Almacen("Bodega", "Autos", "CDMX", false);
		
		//Probar el constructor con solo 2 argumentos se crean segun las necesidades
		Almacen ladrillos = new Almacen("Ladrillos", false);
		
		//Probar los metodos Set para establecerle valor a nuestro objeto vacio alimentos.ctr+espacio y selecciona el metodo a utilizar
		alimentos.setTipodeAlmacen("Almacen de alimentos");
		//alimentos.setCapacidad(10);
		//Si quisieramos cambiar un valor estatico en este caso la capacidad 
		//de un almacen en realidad se cambia para TODOS y se llama a traves
		// del metodo set, pero que ahora es propio de la clase
		//Almacen.setCapacidad(1000);// este modificador estatico nos va a servir para declarar un valor para
		//todos los ojetos creados de esta clase
		
		//vamos a intentar mandar a imprimir nuestros objetos en consola
		System.out.println(alimentos);
		
		//Ej. Imprimir un atributo de un objeto
		System.out.println(ladrillos.getTipodeproductos());
		
		//Ej. Imprimir al almacen con todos los atributos
		System.out.println(carros);
		
		//Van a crear 5 clases para crear 10 objetos
		//Cada clase va a contar con minimo 3 atributos maximo los que ustedes quieran
		//De cada clase van a crear 2 objetos, uno vacio y uno con todos los argumentos
		//Al vacio posteriormente le asignan algunos valores con los setters
		//Y los manda a imprimir en esta clase Principal
		
		//Ej. Voy a crear una clase que me permita crear relojes
		
		Reloj samsung = new Reloj();
		
		Reloj nivada = new Reloj("Nivada", 10000, "Cuero", true);
		
		samsung.setMarca("Samsung S4");
		samsung.setManecillas(false);
		
		System.out.println(samsung);
		System.out.println(nivada);
		
		Celular Samsung = new Celular();
		Celular Iphone = new Celular("Iphone", 10000, "rosa", true);
		
		Samsung.setMarca("Samsung S10");
		Samsung.setColor("blanco");
		
		System.out.println(Samsung);
		System.out.println(Iphone);

		Cereal Trix = new Cereal ();
		Cereal Zucaritas = new Cereal("Zucaritas", "Maiz", 65, true);
		
		Trix.setMarca("Trix");
		Trix.setPrecio(50);
		
		System.out.println(Trix);
		System.out.println(Zucaritas);
		
		Perfume CK = new Perfume ();
		Perfume Diesel = new Perfume("Diesel", "amaderado", 1000, true);
				
				CK.setMarca("CK");
		        CK.setAsequible(false);
		
		System.out.println(CK);
		System.out.println(Diesel);
		
		Escuela UNAM = new Escuela ();
		Escuela IPN = new Escuela("IPN", "Publico", "Burro", false);
		
		UNAM.setFacilingreso(false);
		UNAM.setMascota("Puma");
		
		System.out.println(UNAM);
		System.out.println(IPN);
		
		Cigarros Marlboro = new Cigarros ();
		Cigarros Pallmall = new Cigarros("Pallmall", "menta", true, 75);
		
		Marlboro.setPrecio(80);
		Marlboro.setNocivosparalasalud(true);
		
		System.out.println(Marlboro);
		System.out.println(Pallmall);
		

	}

}
