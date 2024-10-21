package com;

public class Principal {

	public static void main(String[] args) {
		// la programacion orientada objetos solo deve existir una clase con el metodo main
		//que es la que se encargara de ejecutar todo el proyecto las demas clases las iremos creando para modelar objetos

		//provar crear nuestro primer almacen
		// utilizando el constructor vacio 
		Almacen alimentos = new Almacen();
		
		//vamos a ver la forma incorrecta de asignarles valores a los atributos de nuestro almacen
		
		// -> alimentos.tipoAlmacen = "Almacen de viveres";
		
		//provando el construtor con todos los elementos 
		
		Almacen carros = new Almacen("Bodega", "Autos", "Toluca", false);
		//provar el constructor con solo dor argumentos 
		Almacen ladrillos = new Almacen("Ladrillos", false);

		//provar los metodos set para establecerle valor a nuestro objetom vacio
		alimentos.setTipoAlmacen("Viveres");
		//alimentos.setCapacidad(10);
		
		//si quisieramos cambiar unn valor e¿static en este caso la capacidad de un almacen, en realidada se cambia para todos
		//y se llama de metodos set pero que ahora es propio de la clase
		//
		//Almacen.setCapacidad(1000);
		alimentos.setDireccion("Toluca");
		//vamos a intentar mandar a imprimir a nuestros objetos en consola 
		System.out.println(alimentos);
		
		//ej imprimir un atributo de un objeto 
		System.out.println(ladrillos.getTipoProductos());
		
		//Imprimir al almacen con todos nuestros atributos 
		System.out.println(carros);
		
		//van a crear 5 clases para crear 10 objetos 
		//cada clase va a contar con minimo 3 atributos, maximo los que yo quiera
		//de cada clase van a crear 2 objetos uno basio y otro con todos sus argumentos 
		//al vacio posteriormenet le asignaaremos valores con los geteter y setters 
		// y lo manda a imprimir en esta msima clase 
		
		System.out.println("----- inicio de ejemplos Reloj -----");
		Reloj rolex = new Reloj("Omega", "Plateado", 150000, true, "Oro blanco");
		Reloj oris = new Reloj();
		oris.setMarca("ORIS");
		oris.setTipoMaterial("Plata");
		oris.setPrecio(2000);
		System.out.println(rolex + "\n" + oris);
		
		System.out.println("\n----- inicio de ejemplos Coches -----");
		Coches chebrolet = new Coches("Camaro", 350000, "Amarillo", "Pase tollocan", true);
		Coches nissan = new Coches();
		nissan.setMarca("Nissan Pick up");
		nissan.setColor("Rojo");
		nissan.setNacional(true);
		System.out.println(chebrolet + "\n" + nissan);
		
		System.out.println("\n----- inicio de ejemplos Celulares -----");
		Celulares samsung = new Celulares("S21 Ultra", 9000, "Negro", "8Gen1", "16G RAM");
		Celulares xiaomi = new Celulares();
		xiaomi.setColor("Rosa");
		xiaomi.setProcesador("8 Gen 3");
		xiaomi.setPrecio(11000);
		System.out.println(samsung + "\n" + xiaomi);
		
		System.out.println("\n----- inicio de ejemplos Persona -----");
		Persona persona = new Persona("Alan", 18, "Toluca edo Mexico", 1234567890, "Masculino");
		Persona persona2 = new Persona();
		persona2.setNombre("Ferrer");
		persona2.setEdad(31);
		persona2.setSexo("Masculino");
		System.out.println(persona + "\n" + persona2);
		
		System.out.println("\n----- inicio de ejemplos Animal -----");
		Animal acuatico = new Animal("Condrictios", "Tiburon", "Oceano templado", true, false);
		Animal terrestre = new Animal();
		terrestre.setNombre("Jirafa");
		terrestre.setEspecie("Mamifero");
		terrestre.setVertebrado(true);
		System.out.println(acuatico + "\n" + terrestre);
		
		 
	}

}
