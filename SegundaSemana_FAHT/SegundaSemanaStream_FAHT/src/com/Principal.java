package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream -Funcionalidad a partir de Java 8
		//Que nos va  apermitir gestionar de una forma más 
		//rápida e imperativa la información que tengamos
		//en nuestras colecciones de datos
		//Las colecciones se vuelven un flujo de datos a partir
		//del cual podemos solicitar la informacion que necesitemos
		
		//Ejemplo del el uso de Steram
		Stream <String> nombres = Stream.of("Carlos", "Frida", "Alex","Alberto")
				.filter(item -> item.contains("i"));
		//Una vez filtramos la informacion la llevo a una lista
		List <String> names = nombres.collect(Collectors.toList());
		
		//Mostrar los resultados en consola
		//System.out.println(names);

		//Declaramos una lista para guardar nuestros objetos persona
		List<Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a mi lista original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("César", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Lucina", "FEMENINO", 26));
		original.add(new Persona("Raul ","MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));
		
		//Imprimir la lista original en consola
//		System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elemento
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i)); 
//			}
//		
//		//Recuperar todos los elemntos con ciclo for each
//		for(Persona i:original) {
//			System.out.println(i);
//		}
		
		//forEach pero ahora a travez de la lista
//		original.forEach(item -> System.out.println(item));
		
		//si filtratamos a los elementos del genero masculino
		//con un ciclo convencional
//		for (Persona i: original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		
		//Filtrar con el API Stream a pas personas del genero femenino
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(item -> System.out.println(item));
//		filtrada.forEach(System.out::println);
		
		//Ordenar a personas po edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println);
		
		//Contar el numero de elementos de mi lista 
		
//		long conteo = original.stream().count();
//		
//		System.out.println(conteo);
		
		// Solicitar una variable boolean si algun elemento o todos 
		//los elemntos cumplen alguna condicion
//		boolean alguno = original.stream().allMatch(item->item.getEdad()<30);
//		System.out.println(alguno);
		
		//Retornar un valor a una clase Optional
		//Optional e suna clase que nos permite manejar valores nulos,
		//en caso de que no se encuentren
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
	}//end
}
