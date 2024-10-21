package com;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {

	public static void main(String[] args) {
		// la interfaz map asocia o almacena los datos en pares y los asocia
		// precisamente en una (clave
		// valor a almacenar) Las claves no pueden duplicarse
		// la clave actua ctua como un identificador unico para cada elemento a
		// almacenar
		// ejemplo de una declaracion de un Map y la clase Hasmap para alamcenar claves
		// de tipo
		// Integer y elemetosd e tipo String
		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		// como agregamos elementos a nuestro Hasmap
		usuarios.put(1, "Alan");
		usuarios.put(3, "Angel");
		usuarios.put(2, "Carla");

		// imprimir hashMap en consola
		System.out.println(usuarios);

		// como puedo imprimir en pantalla un solo valor almacenado en una determinada
		// clave
		System.out.println(usuarios.get(2));

		// como eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);

		// podemos mandar a imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());

		// si yo quiero imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());

		// podemos mandar a imprimir cada una de las llaves con un nuevo clo for each
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
		}
		// podemos mandar a imprimir cada una de los valores con un nuevo clo for each
		for (String i : usuarios.values()) {
			System.out.println(i);
		}
		
		//imprimir llaves y valores indivudualmente en una liinea 
		for (Integer i : usuarios.keySet()) {
			System.out.println("Llaves: " + i + "- Valor: " + usuarios.get(i));
		}

	}

}
