package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		
		//La iterface Map asocia o almacena los datos en pares
		//en pares (clave - valor a almacenar)
		//Las claves no puede duplicarse
		
		//Es decir, la clave actua como un identificador unico
		//para cada elemento a almacenar (ID)
		
		//Declaracion de un Map y la clase HashMap
		//para almacenar clase de tipo Integer y elementos de tipo
		//String
		
		//Map es la interface
		//HashMap es la clase que nos va a derjar almacenar los valores
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Alo");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Imprimir mi HashMap en consola
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en
		//una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		
		System.out.println(usuarios);
		
		//Imprimir en consola solo las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola solo los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//Imprimir cada una de las llaves con un ciclo
		//for each
		
		for(Integer i : usuarios.keySet()) {
			System.out.println(i);
		}
		
		// Imprimir cada una de los elementos con un ciclo
		// for each

		for (String i : usuarios.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores
		for(Integer i : usuarios.keySet()) {
			System.out.println("Llave:"+i+" Valor:"+usuarios.get(i));
		}

	}

}
