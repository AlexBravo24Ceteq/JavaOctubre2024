package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// API String
//		ejemplo de Stream, es un flujo de estos datos
//		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")
//				.filter(item -> item.contains("i"));
//		
////		se filtran los nombres con i y se lleva a una lista
//		List<String> names = nombres.collect(Collectors.toList());
//		
////		mostrar en consola
//		System.out.println(names);
		
		List<Persona> original = new ArrayList<Persona>();
		
//		Lista pare recolectar la info recolectada de original
		List<Persona> filtrada = new ArrayList<Persona>();
		
//		añadiendo elementos a original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Lucina", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gariela", "FEMENINO", 22));
		original.add(new Persona("Rafel", "MASCULINO", 24));
		
//		imprimiendo lista también se puede usar for
//		for (Persona persona : original) {
//			System.out.println(persona);
//		}
//		
////		imprimiendo con el método foreach y funciones lambda
//		System.out.println();
//		original.forEach(a -> System.out.println(a));
		
//		filtrando por genero MASCULINO con foreach
//		for (Persona i : original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		
//		filtrando con API stream al genero femenino
//		filtrada =  original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(a -> System.out.println(a));
//		System.out.println();
//		filtrada.forEach(System.out::println);
		
//		ordenar a las personas por edad ascendente
//		filtrada =  original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		filtrada.forEach(a -> System.out.println(a));
//		 
		
//		contar los lementos d ela lista
//		long conteo = original.stream().count();
//		System.out.println(conteo);
		
//		Solicitar una variable booleana si algun o algunos elementos
//		cumplen una condicion
//		boolean alguno = original.stream().anyMatch(a -> a.getEdad() < 30);
//		System.out.println(alguno);
////		Para todo s los elementos
//		boolean alguno2 = original.stream().allMatch(a -> a.getEdad() < 30);
//		System.out.println(alguno2);
	
//	retornar un valor a una clase optional, permite mannejar valores nulos
//		si no los encuentra
		Optional<Persona> menorEdad =  original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	}

}
