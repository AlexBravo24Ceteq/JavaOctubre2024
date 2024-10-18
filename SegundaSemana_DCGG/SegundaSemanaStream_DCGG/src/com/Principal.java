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
		// que nos va a permitir gestionar de una forma más
		// rápida e imperativa la información que tengamos
		// en nuestras colecciones de datos
		// las colecciones se vuelven un flujo de datos a partir 
		// del cual podemos solicitar información que necesitemos
		
		// Ejemplo del uso de Stream
		
		Stream<String> nombres = Stream.of("Carlos","Frida","Alex","Alberto")
				.filter(nombre -> nombre.contains("i"));
		
//		System.out.println(nombres);
		// una vez filtramos la información la llevo hacia una lista
		List<String> names = nombres.collect(Collectors.toList());
		
		// mostrar resultados en consola
//		System.out.println(names);
		
		// Declaramos una lista para guardar nuestro objetos persona
		List<Persona> original = new ArrayList<Persona>();
		
		// Crear una lista para recolectar la información filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		// añadir elementos a la lista "original"
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("César", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Lucina", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));
		
		
		System.out.println("--------------impresion objeto original---------------");
		System.out.println();
		
		// imprimir la lista "original" en consola
		System.out.println(original);
		System.out.println();
		System.out.println("--------------impresion cada elemento de original con for---------------");
		System.out.println();
		
		// recorrer lista para ver cada elemento con for (tamaño = objetolista.size()) y el metodo .get()
		for(int i = 0; i< original.size(); i++) {
			System.out.println(original.get(i));
		}
		System.out.println();
		System.out.println("-------------impresion de cada elemento de original con forEach-----------------");
		System.out.println();
		
		// recorrer lista para ver cada elemento con foreach
		for(Persona persona:original) {
			System.out.println(persona);
		}
		System.out.println();
		System.out.println("------------impresion de cada elemento de original con metodo de lista------------------");
		System.out.println();
		
		// imprimir forEach pero a travpes de nuestralista
		original.forEach(elemento -> System.out.println(elemento));
		
		System.out.println();
		System.out.println("------------impresion de cada elemento filtrado por genero MASCULINO------------------");
		System.out.println();
		
		// si filtraramos a los elementos del genero masculino
		// con un ciclo convencional
		for(Persona genero:original) {
			if(genero.getGenero() == "MASCULINO") {
				filtrada.add(genero);
				System.out.println(genero);
			}
		}
		
		System.out.println();
		System.out.println("------------impresion de cada elemento filtrado por genero FEMENINO API Stream------------------");
		System.out.println();
		
		// filtrar con el API Stream a las personas del genero femenino
		filtrada = original.stream()
				.filter(genero -> genero.getGenero().equals("FEMENINO"))
				.collect(Collectors.toList());
		
		filtrada.forEach(persona -> System.out.println(persona));
		System.out.println();
		
		System.out.println("impresion forEach con System.out::println sin ejecutar al metodo solo llamandolo por referencia");
		System.out.println();
		// otra forma de mandarlos a imprimir
		filtrada.forEach(System.out::println);
		
		System.out.println();
		System.out.println("------------lista de impresion ordenada por edad ascendente------------------");
		System.out.println();
		
		// ordenar a las personas por edad
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		
		filtrada.forEach(System.out::println);
		
		System.out.println();
		System.out.println("------------imprimir cantidad de elementos en mi lista------------------");
		System.out.println();
		
		// contar el numero de elementos de mi lista
		System.out.println(original.size());
		System.out.println(original.stream().count());
		System.out.println(original.size() == original.stream().count());
		
		System.out.println();
		System.out.println("------------metodo anyMatch si alguna persona < 30 años------------------");
		System.out.println();
		boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30);
		System.out.println(alguno);
		
		System.out.println();
		System.out.println("------------metodo allMatch si todas persona < 30 años------------------");
		System.out.println();
		boolean alguno2 = original.stream().allMatch(a -> a.getEdad()<30);
		System.out.println(alguno2);
		
		System.out.println();
		System.out.println("------------Optinal filtrando a la persona de menor edad y se imprime------------------");
		System.out.println();
		
		// retornar un valor a una clase optional
		// optinal es una clase que nos permite manejar valores nulos,
		// en caso de que no se encuentren
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		

	}

}
