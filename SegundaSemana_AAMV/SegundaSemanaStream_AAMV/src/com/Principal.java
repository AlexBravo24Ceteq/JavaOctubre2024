package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//API Stream es una funcionalidad a partir de Java 8
		//que nos va a permitir gestionar de una forma mas rapida
		//e imperativa la info que tengamos en nuestras colecciones de datos
		//las colecciones se vuelven un flujo de datos a partir del cual
		//podemos solicitar la informacion que necesitemos
		
		//Ej. de el uso de Stream
		Stream <String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto").filter(item -> item.contains("i"));
		
		//System.out.println(nombres);
		//Esto es un flujo de los datos
		//Una vez filtramos la informacion la llevo hacia una lista
		List<String> names = nombres.collect(Collectors.toList());
		
		//Mostrar los resultados en consola
		//System.out.println(names);
		
		//Declaramos una lista para guardar a nuestros objetos Persona
		
		List<Persona> original = new ArrayList<Persona>();
		
		//Crear una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elemntos a mi lista original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO",  25));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe","FEMENINO", 25));
		original.add(new Persona("Lucina", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));
		
		
		//Imprimir mi lista original en consola 
		//System.out.println(original);
		
		//recorrer nuestra lista para ver cada elemento con
		//un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//			
//		}
//		
		//Recorrer o recuperar todos los elementos con el ciclo forEach
//		for (Persona i:original) {
//			System.out.println(i);
//		}
		
		//forEach pero ahora a traves de nuestra lista
//		original.forEach(a -> System.out.println(a));
		
		//Si filtraramos a los elementos del genero masculino con un ciclo convencional
		
//		for (Persona i: original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		
		//Filtrar con el API Stream a las personas del genero femenino
		filtrada = original.stream().filter(item -> item.getGenero().equals("FEMENINO")).collect(Collectors.toList());
		
		//filtrada.forEach(a -> System.out.println(a));
		filtrada.forEach(System.out::println);
		
		//Ordenar a las personas por edad ascendente
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		
		filtrada.forEach(System.out::println);
		
		//Contar el numero de elementos de mi lista 
		
		long conteo = original.stream().count();
		
		System.out.println(conteo);
		
		//Solicitar una variable booleana si algun elemento o todos los elementos cumplen
		//alguna condicion
		
		//boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30);
		//System.out.println(alguno); //true
		
		boolean alguno = original.stream().allMatch(a -> a.getEdad()<30);
		System.out.println(alguno); //false
		
		//Retornar un valor a una clase Optional
		//Optional es una clase que nos permite manejar valores nulos
		//en caso de que nos encuentren
		
		
		Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		
	
		
		
		
				
		
		
		
		
	
	}

}
