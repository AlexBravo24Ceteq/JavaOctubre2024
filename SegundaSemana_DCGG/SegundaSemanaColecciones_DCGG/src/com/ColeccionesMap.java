package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La interfaz Map asocia o almacena los datos en pares
		// (clave - valor)
		// las claves no pueden almacenarse
		
		// Es decir , la vlace actua como un identificador único
		// para cada elemento a almacenar (ID)
		
		// Declaracion de un Map y la clase HashMap
		// para almacenar claves de tipo Integer y elementos de tipo String
		
		Map<Integer,String> mp = new HashMap<Integer,String>(); 
		
		mp.put(1, "Angel");
		mp.put(3, "Carla");
		mp.put(2, "Luis");
		mp.put(5, "Alejandra");
		mp.put(4, "Fernanda");
		
		// Imprimir mi MAP en consola
		System.out.println(mp);
		
		// imprimir en pantalla un solo valor almacenado en una determinada clave
		System.out.println(mp.get(2));
		
		//metodo para eliminar un elemento
		mp.remove(3);
		System.out.println(mp);
		
		// metodo para mandar a imprimir en consola las llaves de mi Map
		System.out.println(mp.keySet());
		
		// metodo para mandar a imprimir los valores del Map
		System.out.println(mp.values());
		
		// mandar a imprimir cada una de las llaves con un ciclo foreach
		for(int i:mp.keySet()) {
			System.out.println(i);
		}
		
		// mandar a imprimir cada uno de los valores con ciclo foreach
		for(String i:mp.values()) {
			System.out.println(i);
		}
		
		//imprimir llaves y valores
		for(int i:mp.keySet()) {
			System.out.println("llave: "+i+" valor: "+mp.get(i));
		}

	}

}
