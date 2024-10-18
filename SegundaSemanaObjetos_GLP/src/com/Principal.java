package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el
		//metodo main, es la que se encargara de ejecutar
		//todo el proyecto. las demas clases
		//las iremos creando para modelar objetos
		
		//Vamos a probar a crear nuestro primer almacen
		
		//Almacen = Clase
		//alimentos = objeto/intancia
		Almacen alimentos = new Almacen();
		
		//Vamos a ver la forma "incorrecta" de asignarle valor
		//a los atributos de nuestro almacen
		//alimentos.tipoAlmacen="Almacen de Viveres";
		
		
		
		//si quisieramos cambiar un valor estatico, en este caso la capacidad
		//de un almacen, en realidad se cambia para todos, y se llama a traves
		//del metodo set, pero que ahora es propio de la clase
		
		//Van a crear 5 clases para crear 10 objetos
		//Cada clase va a contar con minimo 3 atributos, maximo los que ustedes quieran
		//De cada clase van a crear 2 objetos, uno vacio y uino con todos los argumentos
		//Al vacio posteriormente le asignan algunos valores con los setters
		//y los manda a imprimir en esta misma clase Principal
		
		Auto auto1 = new Auto();
		auto1.setMarca("Honda");
		auto1.setAutonomo(true);
		auto1.setHP(500);
		System.out.println(auto1);
		Auto auto2 = new Auto("VW",false,800);
		System.out.println(auto2);
		
		Motocicleta moto1 = new Motocicleta("Yamaha","Cross",600);
		System.out.println(moto1);
		Motocicleta moto2 = new Motocicleta();
		moto2.setMarca("Pulsar");
		moto2.setTipo("doble proposito");
		moto2.setCC(600);
		System.out.println(moto2);
		
		Teclado teclado1 = new Teclado("Razer","Mecanico","EN");
		System.out.println(teclado1);
		Teclado teclado2 = new Teclado();
		teclado2.setMarca("Corsair");
		teclado2.setTipo("Membrana");
		teclado2.setLenguaje("ES");
		System.out.println(teclado2);
		
		Audifonos audifonos1 = new Audifonos();
		audifonos1.setMarca("Astro");
		audifonos1.setTipoConexion("Inalambrica");
		audifonos1.setMicrofono(false);
		System.out.println(audifonos1);
		Audifonos audifonos2 = new Audifonos("Samsung","Alambrica",true);
		System.out.println(audifonos2);
		
		Celular cel1 = new Celular();
		cel1.setMarca("Huawei");
		cel1.setAlamcenamiento(1000);
		cel1.setRam(12);
		System.out.println(cel1);
		Celular cel2 = new Celular("Samsung",2000,16);
		System.out.println(cel2);
		
		
	}

}
