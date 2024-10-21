package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		// API Stream - Funcionalidad a partir de java 8
		// que nos va a permitir gestionar de una forma mas rapida e imperativa
		// la informacion que tengamos en nuestras colkecciones de datos
		// Las colecciones se vuelven un flujo de datos apartir del cual podemos
		// solicitar la informacion que necesitemos

		// Ejemplo de el uso de Stream

		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto").filter(item -> item.contains("i"));
		// Una vez filtrada la informacion la llevo hacia una lista

		List<String> names = nombres.collect(Collectors.toList());

		// Mostrar los resultados en consola
		// System.out.println(names);

		// Declaramos una lista para guardar a nuestros objetos persona

		List<Persona> original = new ArrayList<Persona>();

		// Crear una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();

		// Añadir elementos a mi lista original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Lucina", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));

		// Imprimir la lista original en consola
		// System.out.println(original);

		// Recorrer nuestra lista para ver cada elemento con un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
		// }

		// Recuperar todos los elementos con un ciclo for each
//		for (Persona i: original) {
//			System.out.println(i);
//		}
		// forEach ahora atraves de nuestra lista
		// original.forEach(a -> System.out.println(a));

		// Si filtraramos a los elementos del genero masculino con un ciclo convencional

//		for (Persona i:original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//			
//		}

		// Filtrar con el API Stream a las personas del genero femenino
		// stream los convierte a un flujo de datos

//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println);//Otra forma de imprimir aparte de los operadores
//		//lambda

		// Ordenar a las personas por edad ascendente

//	filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//			.collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println);

		// Contar el numero de elementos de mi lista

//		long conteo = original.stream().count();
//
//		System.out.println(conteo);
//		
		//Solicitar una variable booleana si algun elemento o 
		//todos los elementos cumplen alguna condicion
		//se una anyMatch para agulno de los elementos su edad es menor a 30
		//y allMatch es para si todos los elementos 
		
//		boolean alguno = original.stream().allMatch(a -> a.getEdad()<30);
//		System.out.println(alguno);

		//Retornar un valor a una clase Optional
		//Optional es una clase que nos perites manejar valores nulos 
		//en caso de que no se encuentren
		//.min busca el valor minimo
		
		Optional<Persona> menorEdad =original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);

	}

}
