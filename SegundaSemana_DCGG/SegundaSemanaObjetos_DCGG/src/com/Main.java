package com;

public class Main {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el método main
		// que es la que se encargará de ejecutar todo el proyecto.
		// las ddemás clases las iremos creando para modelar objetos
		
		Almacen comestibles = new Almacen("Perecederos","Verduras","Heliotropos No. 12345",true);
		
		Almacen ladrillos = new Almacen("Ladrillos",false);
		
		//probando los metodos set, para establecer un valor a nuestro objeto vacio
		comestibles.setTipoAlmacen("Almacen viveres");
//		comestibles.setCapacidad(10);
//		Almacen.setCapacidad(1000);
		
		System.out.println(ladrillos);
		
		
		
		
	// ACTIVIDAD 
		// crear 5 clases para crear 10 objetos
		// cada clase va a contar con minimo 3 atributos, máximo los que uds quieran
		// de cada clase van a crear 2 objtetos, uno vacío y otro con todos los argumentos
		// el objeto vacio posteriormente se le asignan valores con los setters
		// y los manda a imprimir esta misma clase
		
		Celular apple = new Celular("Iphone X", "litio", true, false, 530.65);
		Celular samsung = new Celular();
		
		
		samsung.setMarcacelular("Galaxy A1");
		samsung.setTipoBateria("niquel");
		samsung.setTraeBluetooth(false);
		samsung.setTraeCargador(true);
		samsung.setPrecio(220.90);
		
		Mesa mesa1 = new Mesa(4,"Roble", "cobre", 130.00);
		Mesa mesa2 = new Mesa();
		
		mesa2.setNumeroPatas(2);
		mesa2.setTipoMadera("Pino");
		mesa2.setPrecio(50.89);
		
		Transporte t1 = new Transporte("Camion", true, 700.00);
		Transporte t2 = new Transporte();
		
		t2.setTipoTransporte("Helicoptero");
		t2.setEsPublico(false);
		
		Libro l1 = new Libro("El señor de los anillos", 250, false, 380.98);
		Libro l2 = new Libro();
		
		l2.setTitulo("El Silmarlion");
		l2.setNumeroPaginas(435);
		l2.setEbook(true);
		l2.setPrecio(420.00);
		
		Comida comida_1 = new Comida("Hamburguesa", true, 10, 25.50, false);
		Comida comida_2 = new Comida();
		
		comida_2.setTipoComida("Sopa");
		comida_2.setCongelada(false);
		comida_2.setEnlatado(true);
		comida_2.setNumeroIngredientes(20);
		comida_2.setPrecio(20.30);
		
		System.out.println(" ---DE LA CLASE 1--- ");
		
		System.out.println(apple);
		System.out.println(samsung);
		System.out.println();
		
		System.out.println(" ---DE LA CLASE 2--- ");
		
		System.out.println(mesa1);
		System.out.println(mesa2);
		System.out.println();
		
		System.out.println(" ---DE LA CLASE 3--- ");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println();
		
		System.out.println(" ---DE LA CLASE 4--- ");
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println();
		
		System.out.println(" ---DE LA CLASE 5--- ");
		
		System.out.println(comida_1);
		System.out.println(comida_2);
		System.out.println();
		

	}

}
