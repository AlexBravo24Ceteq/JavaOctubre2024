package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
//		hashmap clave-valor, no puden duplicarse las claves
		
//		declarción de un map con hashmap, guarda int y string
		Map<Integer, String> usuarios = new HashMap<Integer, String>();

//		agregar elementos a hashmap .put(clave, valor)
		usuarios.put(1, "Angel");
		usuarios.put(3, "Carla");
		usuarios.put(2, "Pedro");
		
//		imprimiendo en pantalla todo
		System.out.println(usuarios);
//	imprimiedno una solo valor con la clave
		System.out.println(usuarios.get(2));
		
//		eliminar un elemento 
		usuarios.remove(3);
		System.out.println(usuarios);
		
//		imprimir llaves solo llaves
		System.out.println(usuarios.keySet());
		
//		imprimir los valores que contiene el hash map
		System.out.println(usuarios.values());
		
//		mandar a imprimir cada llave con foreach
		for (int elemento : usuarios.keySet()) {
			System.out.println(elemento);
		}
		
//		mandar a imprimir los valores con foreach
		for (String elemento : usuarios.values()) {
			System.out.println(elemento);
		}
		
//		imprimir llaves y valores
		for (Integer i: usuarios.keySet()) {
			System.out.println("Llave: " + i + " / Valor: " + usuarios.get(i));
		}
		
	}

}
