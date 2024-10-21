package com;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		//API Stream es una funcionalidad a partir de java 8 que nos va a permitir gestionar de una forma mas rapida e imperativa
		//la informacion que tengamos en nuestras colecciones de datos 
		//las colecciones se vuelven un flujo de datos al partir del cual podemos solicitar la informacion
		//que becesitemos
		//ejemplo del uso de stream
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")
				.filter(item -> item.contains("i"));
		//una ves filtramos la infoermacionla llevo hacia una lista
		List<String> names = nombres.collect(Collectors.toList());
		
		//mostrar los resultados en consola
		System.out.println(names + "\n");
		
		//declaramos una lista para guardar a nuestros objetos persona
		List<Persona> original = new ArrayList<Persona>();
		//tambien vamos a crear una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//añadir elementos a mi lista original
		original.add(new Persona("Jorge", "Masculino" , 37));
		original.add(new Persona("Alicia", "Femenino" , 25));
		original.add(new Persona("Pedro", "Masculino" , 30));
		original.add(new Persona("Guadalupe", "Femenino" , 30));
		original.add(new Persona("Adrian", "Masculino" , 37));
		original.add(new Persona("Jose", "Masculino" , 22));
		original.add(new Persona("Tomas", "Masculino" , 26));
		original.add(new Persona("Ana", "Femenino" , 22));
		original.add(new Persona("Alan", "Masculino" , 37));
		original.add(new Persona("Gabriela", "Femenino" , 25));
		
		//imprimir mi lista original en consola 
		System.out.println(original +"\n");
		
		//recorrer nuestra lista para ver cada elemento con un ciclo for 
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i)+"\n");
//		}
		
		//recuperar todos los elementos con el ciclo for each
//		for (Persona i : original) {
//			System.out.println(i);
//		}

		//imprimir el mismo ciclo pero a traves de nuestra lista
		//original.forEach(a -> System.out.println(a));
		
		//si filtraramos a los elementos del genero masculino con un ciclo for each
//		for (Persona persona : original) {
//			if (persona.getGenero().equals("Masculino")) {
//				filtrada.add(persona);
//				System.out.println(persona);
//			}
//		}
		
		//como podemos filtrar con API stream a la persona del genero femenino
		
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("Femenino"))
//				.collect(Collectors.toList());
//		
//		//filtrada.forEach(a -> System.out.println(a));
//		filtrada.forEach(System.out::println);
		
		//como podemos ordenar a las personas por la edad ascendente
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		filtrada.forEach(System.out::println);
		
		long conteo = original.stream().count();// la logica nos dice que nos dara el mismo resultado
		System.out.println("\n" + conteo);
		//contar el nuemro de elementos de mi lista 
		System.out.println("\n" + original.stream().count());
		
		//solicitar una bariable booleana si algun elemento o todos cumplen alguna condicio
		
		boolean alguno = original.stream()
				.allMatch(a -> a.getEdad() < 30);//.anyMatch(a -> a.getEdad() < 30); filtra si alguno cumple con la condicion
		System.out.println(alguno);
		
		//retornar un valor a una clase opcional 
		//Optional es una clase que nos permite manejar valores nulos en caso de que no se encuentren
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		
		
		
		
		
	}

}
