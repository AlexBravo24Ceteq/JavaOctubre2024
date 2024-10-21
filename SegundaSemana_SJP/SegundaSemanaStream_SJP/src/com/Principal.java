package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API STREAM - Funcionalidad a partir de JAVA 
		//Permite gestionar de forma rapida e imperativa la informacion en 
		//en colecciones de datos. Las colecciones se vuelven un flujo de datos a partir del cual
		//podemos solicitar inf. que necesitemos
		
		//Ej. Uso del uso de Stream
		Stream<String> nombres = Stream.of("Oliver", "Nicholls", "Malia", "Kean") //Flujo de datos en movimiento
				.filter(item -> item.contains("i"));
		
		//System.out.println(nombres); //No se puede mostrar
		//Filtrada la inf. la almacenamos en una lista
		List<String> names = nombres.collect(Collectors.toList());
		
		//Imprimir resultados
		//System.out.println(names);

		//LISTA DE PERSONAS
		//Lista para guardar objetos Persona
		List<Persona> original = new ArrayList<Persona>();
		
		//Crear lista para recolectar inf. filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a lista original
		original.add(new Persona("Oliver", "Masculino", 28));
		original.add(new Persona("Nicholls", "Masculino", 30));
		original.add(new Persona("Kean", "Masculino", 39));
		original.add(new Persona("Malia", "Masculino", 36));
		original.add(new Persona("Alissa", "Femenino", 26));
		original.add(new Persona("Chester", "Masculino", 41));
		original.add(new Persona("Brad", "Masculino", 45));
		original.add(new Persona("Rob", "Masculino", 36));
		original.add(new Persona("Han", "Masculino", 32));
		original.add(new Persona("Courney", "Femenino", 29));
		
		//Imprimir lista original
//		System.out.println(original);
		
//		//Recorrer lista para ver cada elemento con un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}
		
//		//Recuperar todos los elementos con el ciclo forEach
//		for (Persona i : original) {
//			System.out.println(i);
//		}
		
		//forEach a tráves de lista
//		original.forEach(a -> System.out.println(a)); //expresion lambda
		
//		//Si filtramos elementos del genero masculino con un ciclo convencional
//		for (Persona i : original) {
//			if (i.getGenero().equals("Masculino")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		
//		//Filtrar con el API stream a las personas de genero femenino
//		filtrada = original.stream().filter(item -> item.getGenero().equals("Femenino")).collect(Collectors.toList());
//		
////		filtrada.forEach(a -> System.out.println(a));
//		
//		filtrada.forEach(System.out::println); //Imprime todo los elementos uno a uno contenidos en la lista
		
		//ORDENAR A LAS PERSONAS
		//Por edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println);
		
//		long conteo = original.stream().count(); //Guardamos en una variable el valor para despues mostrarlo
		
		//CONTAR NUMERO DE ELEMENTOS
//		System.out.println(original.stream().count()); //elemento tipo long
		
		//SOLICITAR UNA VARIABLE BOOLEANA
		//Si algun elemento o todos cumplen con alguna condicion
//		boolean alguno = original.stream().anyMatch(a -> a.getEdad() < 30);
//		System.out.println(alguno);
//		
//		boolean todos = original.stream().allMatch(a -> a.getEdad() < 30);
//		System.out.println(todos);
		
		//RETORNAR UN VALOR A UNA CLASE OPTIONAL
		//Optional es una clase que nos permite manejar valores nulos
		//en caso de que no se encuentren
		
		Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		
		
	}

}
