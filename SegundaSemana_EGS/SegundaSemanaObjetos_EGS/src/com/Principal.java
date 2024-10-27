package com;

public class Principal {

	public static void main(String[] args) {
		/*
		 * En la POO(Programacion Orientada a Objetos) solo debe 
		 * existir una clase con el metodo main 
		 * que es la que se encargará de ejecutar todo 
		 * el proyecto. las demás clases las iremos creando 
		 * para modelar objetos
		 */
		
		Almacenes alimentos = new Almacenes();
		
		//Vamos a ver la forma "Incorrecta" de asignarle valor
		//a los atributos de nuestro almacen
		
		//alimentos.tipoAlmacen="Almacen de Viveres";
		
		//Probando el constructor con todos los argumentos
		Almacenes carros = new Almacenes("Bodega", "Autos", "CDMX", false);
		
		//Probando el constructor con solo dos argumentos
		Almacenes ladrillos = new Almacenes("Ladrillos", false);
		
		//Probando metodos set para establecer valor a objeto vacio
		alimentos.setTipoAlmacen("Almacen de Víveres");
		//alimentos.setCapacidad(10);
		//Si quisieramos cambiar un valor estatico, en este caso la capacidad 
		//de un almacen, en realidad se cambia para TODO, y se llama a traves
		//del metodo set, pero que ahora es propio de la clase
//		Almacenes.setCapacidad(1000);
			
		
		//Vamos a intentar mandar a imprimir nuestros objetos en consola
		System.out.println(alimentos);
		
		//Ej. Imprimir un atributo de un objeto
		System.out.println(ladrillos.getTipoProductos());
		System.out.println(carros);
		
		/*
		 * Van a crear 5 clases para crear 10 objetos
		 * Cada clase va a contar con minimo 3 atributos
		 * De cada clase van a crear 2 onjetos, uno vacio y uno con todos los atributos
		 * Al vacio posteriormente le asignan algunos valores con los getters y setters
		 * y los mandan a imprimir en esta misma clase principal
		 */
		
		//Primera clase
		System.out.println("\nClase 1:");
		ConsolasVideojuegos xbox = new ConsolasVideojuegos();
		
		ConsolasVideojuegos playStation = new ConsolasVideojuegos("Sony", 19000.00, true, 3);
		
		xbox.setMarca("Microsoft");
		xbox.setPrecio(7549.99);
		xbox.setVersionPro(false);
		xbox.setAniosGarantia(2);
		
		System.out.println(xbox);
		System.out.println(playStation);
		
		System.out.println("\nClase 2:");
		Gymnasio pesas = new Gymnasio();
		Gymnasio crossFit = new Gymnasio("CrossMax", 249.99, true);
		
		pesas.setNombre("Powerfit");
		pesas.setMensualidad(359.99);
		pesas.setHasRegaderas(true);
		
		System.out.println(pesas);
		System.out.println(crossFit);
		
		System.out.println("\nClase 3:");
		Automoviles ferrari = new Automoviles();
		Automoviles volkswagen = new Automoviles("VolksWagen", "Jetta", 2020, 259580.99);
		
		ferrari.setMarca("Ferrari");
		ferrari.setSubMarca("LaFerrari");
		ferrari.setModelo(2022);
		ferrari.setPrecio(27413762.95);
		
		System.out.println(ferrari);
		System.out.println(volkswagen);
		
		System.out.println("\nClase 4:");
		Lego porsche = new Lego();
		Lego mFalcon = new Lego("Millennium Falcon", 9, 1351, 4099);
		
		porsche.setModelo("Porsche 911 Rsr");
		porsche.setMinEdad(10);
		porsche.setNumPiezas(1580);
		porsche.setPrecio(5290.67);
		
		System.out.println(porsche);
		System.out.println(mFalcon);
		
		System.out.println("\nClase 5:");
		
		Computadora dell = new Computadora();
		Computadora asus = new Computadora("Asus","Rog Strix G16", 44825, true);
		
		dell.setMarca("Dell");
		dell.setModelo("Alienware M16");
		dell.setPrecio(58580);
		dell.setEsGamer(true);
		
		System.out.println(dell);
		System.out.println(asus);
		
		
		
	}
	

}
