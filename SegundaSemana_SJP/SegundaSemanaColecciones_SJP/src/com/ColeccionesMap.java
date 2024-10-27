package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		//La interfaz Map asocia o almacena los datos en pares
		//(clave - valor a almacenar)
		//Las claves no pueden duplicarse
		
		//La clave actua como un identificador unico para c/elem.
		//a almacenar (ID)
		
		//Declaracion de un Map y la clase HashMap
		//para almacenar claves de tipo Integer y elem tipo String
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		
		//Agregamos elem. a HashMap
		usuarios.put(1, "Oliver");
		usuarios.put(3, "Scott");
		usuarios.put(2, "Parker");
		
		//Imprimir HashMap en consola
		System.out.println(usuarios);
		
		//Un solo valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de HashMap
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//llaves del HashMap
		System.out.println(usuarios.keySet());
		
		//Valores contenidos en HashMap
		System.out.println(usuarios.values());
		
		//llaves con un ciclo for
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
		}
		
		//valores con un ciclo for
		for (String i : usuarios.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores
		for (Integer i : usuarios.keySet()) {
			System.out.println("Llave: " + i + " Valor: " + usuarios.get(i));
		}
		
	}

}
