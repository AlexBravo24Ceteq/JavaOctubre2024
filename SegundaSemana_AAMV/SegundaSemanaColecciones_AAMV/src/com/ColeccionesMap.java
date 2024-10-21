package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// Interfaz Map asocia o almacena los datos en pares
		// (Clave - valor a almacenar)
		// Las claves no pueden duplicarse

		// Es decir la clave actua como un identificadpor unico
		// para cada elemento a almacenar (ID)

		// Declaracion de un Map HashMap
		// Para almacenar claves de tipo Integer y tipo String
		// Map es la interface y HashMap es la clase que nos permite almacenar los
		// valores

		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		// Agregamos elemntos a nuestro HashMap
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");

		// Imprimir mi HashMap en consola

		System.out.println(usuarios);

		// Imprimir en pantalla un solo valor al,acenado en una determinada clave
		System.out.println(usuarios.get(2));

		// Eliminar un elemento de nuestro HashMap

		usuarios.remove(3);
		System.out.println(usuarios);

		// Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());

		// Imprime en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());

		// Imprimir cada una de las llaves con un ciclo for each
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);

		}

		// Imprimir cada uno de los valores con un ciclo for each
		for (String i : usuarios.values()) {
			System.out.println(i);

		}
		
		//Imprimir llaves y valores
		for (Integer i: usuarios.keySet()) {
			System.out.println("Llave: " +i + (" ") + "Valor: " + usuarios.get(i));
		}

	}

}
