package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe exitir una clase con el método main 
		// que es la que se encargará de ejecutar todo el proyecto.
		// Las demás clases las iremos creando para modelar objetos
		
		// Vamos a probar a crear nuestro primer Almacén
		
		Almacen alimentos = new Almacen(); // primer objeto que se llama "alimentos"
		
		// Vamos a ver la forma "incorrecta" de asignarle valor 
		// a los atributos de nuestro almacén
		
		//alimentos.tipoAlmacen="Almacén de víveres"; 
		
		//Probando el constructor con todos los argumentos
		
		Almacen carros = new Almacen("Bodega", "Autos", "CDMX", false);
		
		// Probar el constructor con solo dos argumentos 
		
		Almacen ladrillos = new Almacen("Ladrillos", false);
		
		// Probar los métodos Set para establecer valor a nuestro objeto vacio
		
		alimentos.setTipoAlmacen("Almacén de Víveres");
		// alimentos.setCapacidad(10);
		// Si quisiéramos cambiar un valor estático, en este caso la capacidad
		// de un almacén, en realidad se cambia para TODOS, y se llama a través
		// del método set, pero que ahora es propio de la clase
//		Almacen.setCapacidad(1000);
		
				
		// Vamos a tratar mandar a imprimir nuestros objetos en consola
		System.out.println(alimentos);
		// Ej. imprimir un atributo de un objeto
		System.out.println(ladrillos.getTipoProductos());
		
		// Ej. imprimir al almacén con todos los atributos 
		System.out.println(carros+"\n");
		
		// Van a crear 5 clases para crear 10 objetos
		// cada clase va a contar con mínimo 3 atributos, máximo los que ustedes quieran
		// De cada clase van a crear 2 objetos, uno vacío y uno con todos los argumentos
		// Al vacío posteriormente le asignan algunos valores con los setters
		// y los manda a imprimir en esta misma clase Principal
		
		// Ej. voy a crear una clase que me permita crear relojes
		
		Reloj samsumg = new Reloj();
		Reloj nivada = new Reloj("Nivada", 10000, "Zafiro", "Cuero", true);
		
		samsumg.setMarca("Samsum S4");
		samsumg.setManecillas(false);
		
		System.out.println(samsumg);
		System.out.println(nivada+"\n");
		
		Computadora lenovo = new Computadora();
		Computadora hp = new Computadora("HP", 25000, "Windows 11", "Intel Core i5", true);
		
		lenovo.setMarca("Lenovo k20");
		lenovo.setPrecio(15000);
		lenovo.setSistemaOperativo("Windows 10");
		lenovo.setProcesador("Celerón"); 
		lenovo.setLaptop(false);
		
		System.out.println(lenovo);
		System.out.println(hp+"\n");
		
		Celular oppo = new Celular();
		Celular huawei = new Celular("HUAWEI Pura 70", 13858, "Negro", "EMUI 14", false);
		
		oppo.setMarca("OPPO Find N3 Flip");
		oppo.setPrecio(12000);
		oppo.setColor("Perla Brillante");
		oppo.setSistemaOperativo("ColorOS 13.2"); 
		oppo.setPlegable(true);
		
		System.out.println(oppo);
		System.out.println(huawei+"\n");
		
		Pantalla samsumg1 = new Pantalla();
		Pantalla ghia = new Pantalla("GHIA", 2918.64, 32, true, false);
		
		samsumg1.setMarca("Samsumg Crystal UHD");
		samsumg1.setPrecio(8290);
		samsumg1.setPulgadas(55);
		samsumg1.setLed(true); 
		samsumg1.setSmartTv(true);
		
		System.out.println(samsumg1);
		System.out.println(ghia+"\n");
		
		Motocicleta honda = new Motocicleta();
		Motocicleta vento = new Motocicleta("Vento Cyclone 2.0 ", 30499, "Negro/Naranja", 210, false);
		
		honda.setMarca("HONDA CB 190R");
		honda.setPrecio(50000);
		honda.setColor("Tricolor");
		honda.setMotor(190); 
		honda.setPista(false);
		
		System.out.println(honda);
		System.out.println(vento+"\n");
		
	}		
		
}


