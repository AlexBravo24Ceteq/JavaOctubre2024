package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
//	Coleeccion de datos o elementos definida como 
//	una sucesión de los mismos y se implementa com la
//	intefaz List y es redimensionable, no guarda datos primitivos
		List<String> lista = new ArrayList<String>();
		
//		agregando nombres a la lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarahí");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
//		Imprimiendo la lista
		System.out.println(lista);
		System.out.println();
		
//		Imprimiendo lista con get 
		System.out.println(lista.get(2));
		System.out.println();
		
//		Imprimiendo un valor booleano .contains
		System.out.println(lista.contains("Alex"));
		System.out.println(lista.contains("Gabriela"));
		System.out.println();
		
//		Devuelve la posiicion del elemento donde se encuentra la primera vez
		System.out.println(lista.indexOf("Alberto"));

//		Devuelev la última posicion del elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
//		.remove elimina un elemento d ela lista
//		se puede eliminar el indice o el objeto
//		lista.remove("Alberto");
//		System.out.println(lista);
		lista.remove(5);
		System.out.println(lista);
		
//		añadir elementos en cualquier posición, no borra, desplaza posiciones
		lista.add(2, "Celso");
		System.out.println(lista);

//Remplazar el valor de la lista .set
		lista.set(3, "Sandy");
		System.out.println(lista);
		
//		recorrer o recuperar los valores e imprimirlos con for each
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("con for " + lista.get(i));
		}
		System.out.println();
		
//		con for each
		for(String elementos: lista) {
			System.out.println("con for each " + elementos);
		}
		
//		con la clase Object, parametrizando con la clase object
		List<Object> coleccion = new ArrayList<Object>();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
//		Sin parametrizar
		List coleccion2 = new ArrayList<>();
		coleccion2.add("Nombre");
		coleccion2.add(23);
		System.out.println(coleccion2);
		
		
	}

}
