package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream - Funcionalidad a partir de Java 8
		//que nos va a permitir gestionar de una forma mas
		//rapida e imperativa la informacion que tengamos
		//en nuestras colecciones de datos
		//Las colecciones se vuelven un flujo de datos a partir
		//del cual podemos solicitar la informacion que necesitemos
		
		//Ejemplo de le uso de Stream
		Stream<String> nombres = Stream.of("Gerardo","Alo","Maite","Marcus")
			.filter(a -> a.contains("i"));
		
		//Una vez filtramos la informacion la llevo hacia una lista
		//Esto se debe realizar asi, ya que aunque filtramos nombres
		//si mandamos a imprimir no se vera nada, solo el valor en memoria
		List<String> names = nombres.collect(Collectors.toList());
		
		//Mostrar los resultados en consola
		//System.out.println(names);
		
		//Declaramos una lista para guardar a nuestros objetos Persona
		List<Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//A;adir elementos a mi lista original
		original.add(new Persona("Gerardo", "MASCULINO", 26));
		original.add(new Persona("Alondra", "FEMENINO", 27));
		original.add(new Persona("Azul", "FEMENINO", 7));
		original.add(new Persona("Marcus", "MASCULINO", 1));
		original.add(new Persona("Mayte", "FEMENINO", 26));
		original.add(new Persona("Erika", "FEMENINO", 34));
		original.add(new Persona("Jose Luis", "MASCULINO", 24));
		original.add(new Persona("Donovan", "MASCULINO", 17));
		original.add(new Persona("Angela", "FEMENINO", 35));
		original.add(new Persona("Vicente", "MASCULINO", 37));
		
		//Imprimir la lista original en consola
		//System.out.println(original);
		
		//Recorrer nuestrra lista para ver cada elemento con
		//un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}
		
		//Recuperar todos los elementos con el ciclo forEach
//		for(Persona i : original) {
//			System.out.println(i);
//		}
		
		//forEach pero ahora atraves de nuestra lista
		//esto gracias a un expresion lambda
		//original.forEach(a -> System.out.println(a));
		
		//Si filtraramos a los elementos del genero masculino
		//con un ciclo convencional
//		for(Persona i: original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		
		//Filtrar con el API Stream a las personas del genero femenino
		//con esto el ciclo for de arriba puede ser en 1 sola linea
		//despues del =, original lo converitmos en un flujo de datos
		filtrada = original.stream()
				.filter(item -> item.getGenero().equals("FEMENINO"))
				.collect(Collectors.toList());
		
		//opccion 1
		//filtrada.forEach(a -> System.out.println(a));
		
		//opcion2
		//filtrada.forEach(System.out::println);
		
		//Ordenar a las personas por edad ascendente
		filtrada = original.stream()
				.sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		
		filtrada.forEach(System.out::println);
		
		//Contar el numero de elementos de mi lista
		System.out.println(original.stream().count());
		
		//solicitar una variable boolean si algun elemento o todos
		//los elementos cumplen alguna condicion anymatch
		boolean alguno = original.stream().anyMatch(a -> a.getEdad() < 30);
		System.out.println(alguno);
		
		//solicitar una variable boolean si todos los elementos
		//los elementos cumplen alguna condicion anymatch
		boolean alguno2 = original.stream().allMatch(a -> a.getEdad()<30);
		System.out.println(alguno2);
		
		//Retornar un valor a una clase Optional
		//Optional es una clase que nos permite manejar valores nulos,
		//en caso de que no se encuentren
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
	}

}
