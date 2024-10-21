package com;

public class Principal {

	public static void main(String[] args) {
		// La programacion orientada a objetos solo debe existir en una
		//clase con el metodo main que es la que se encargara de 
		//ejecutar todo el proyecto. Las demas clases las iremos
		//creando para modelar objetos
		
		//Vamos a probar crear nuestro primer Almacen
		
		Almacen alimentos = new Almacen();//Constructor u objeto vacio funciona como comodin
		
		//Vamos a ver la forma "incorrecta " de asignarle valor 
		//a los atributos de nuestro almacen
//		alimentos.tipoAlmcen = "Almacen de viveres";
		
		//Al declarar private en almacen los datos ya no aparecen aqui
		
		//Probando el constructor con todos los argumentos 
		//Se tienen que agregar en orden a como estan declarados en 
		//la clase almacen 
		Almacen carros = new Almacen("Bodega", "Autos", "CDMX", false);
		
		
		//Probar constructor con solo 2 elementos
		
		Almacen ladrillos = new Almacen("ladrillos", false);
		
		//Probar metodos set para establecerle valor a nuestro objeto vacio
		alimentos.setTipoAlmacen("Almacen de viveres");
//		alimentos.setCapacidad(10);
		//Si quisieramos cambiar un valor estatico, en este caso la capacidad de un almacen,
		//en realidad se cambia para todos, y se llama a traves del metodo set, 
		//pero ahora es propio de su clase
//		
//		Almacen.setCapacidad(1000);
//		
		//Vamos a intentar mandar a imprimir nuestros objetos en consola
		
		System.out.println(alimentos);
		
		//Ej, Imprimir un atributo de un objeto
		System.out.println(ladrillos.getTipoProductos());
		
		//ej. imprimir almacen con todos los atributos  carros
		//se imprime gracias al toString()
	
		System.out.println(carros);
		
		//Clase 1 clase zapateria
		
		Zapateria atletismo = new Zapateria();
		Zapateria futbol = new Zapateria("Adidas", "Profesional", 2, 1000);
		
		atletismo.setCantidad(2);
		atletismo.setMarca("Puma");
		atletismo.setPrecio(2000);
		
		System.out.println(atletismo);
		System.out.println(futbol);
		
		//Clase " clase Camionetas
		
		Camionetas ford = new Camionetas ();
		Camionetas toyota = new Camionetas("Tacoma", 2024, "Azul", "Gasolina", true);
		
		ford.setMarca("Ranger");
		ford.setGarantia(false);
		ford.setCombustible("Diesel");
		
		
		System.out.println(toyota);
		System.out.println(ford);
		
		//Clase 3 clase Jugeteria
		
		Jugeteria moto = new Jugeteria();
		Jugeteria bicicleta = new Jugeteria("Carreras", "Fibra", 3000, true, 2);
		
		moto.setCosto(6000);
		moto.setEchode("Metal");
		moto.setGarantia(false);

		System.out.println(moto);
		System.out.println(bicicleta);
		
		
		//Clase 4 clase perfumes
		
		Perfumes versace = new Perfumes ();
		Perfumes nautica = new Perfumes("Nautica", true, 1300 , 2, true);
		
		
		versace.setPromocion(true);
		versace.setCosto(1600);
		versace.setImportado(true);
		
		System.out.println(versace);
		System.out.println(nautica);
		
		//Clase 5 clase Instrumentos
		
		Instrumentos trompeta = new Instrumentos();
		Instrumentos tuba = new Instrumentos("tuba", "USA", "Laton", 10000, 2);
		
		trompeta.setCosto(5000);
		trompeta.setCantidaddeInstrumentos(2);
		trompeta.setPaisdeOrigen("Francesa");
		
		System.out.println(trompeta);
		System.out.println(tuba);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
