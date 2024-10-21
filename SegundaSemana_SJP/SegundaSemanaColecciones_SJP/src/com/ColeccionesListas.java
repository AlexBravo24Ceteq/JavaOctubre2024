package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		//Listas- coleccion de datos o elementos definida como
		//una sucesión de los mismos.
		//Esta coleccion se implementa a través de la interface List
		//y por medio de un array redimensionable de la clase List
		//Las listas si admiten valores duplicados. Colecciones mas utilizadas y con mejor rendimiento.
		//No podemos guardar tipos de dato primitivo
		//Pero si datos de tipo Onjeto (String, wrapper, etc)
		
		List<String> lista = new ArrayList<String>();
		
		//Agregar elementos a la lista
		lista.add("Chester");
		lista.add("Oliver");
		lista.add("Nicholls");
		lista.add("Kean");
		lista.add("Malia");
		lista.add("Nocholls");
		
		//Imprimir en consola
		System.out.println(lista);
		
		//Recuperar el valor de un solo elem. de la lista
		System.out.println(lista.get(1));
		
		//Devuelve un valor booleano si el elem. existe en la lista
		System.out.println(lista.contains("Malia"));
		
		//Devuelve la posicion donde se encuentra al elem. por primera vez
		System.out.println(lista.indexOf("Nicholls"));
		
		//Devuelve la ultima posicion donde se encuentra al elem.
		System.out.println(lista.lastIndexOf("Nicholls"));
		
		//Eliminar un elem. de la lista
		lista.remove("Nicholls");
		System.out.println(lista);
		//Eliminar por indice
		lista.remove(4);
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una deteminada posicion
		lista.add(2, "Jordan");  //Desplaza las posiciones. No reemplaza el elem. del indice indicado
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(2, "Matt");
		System.out.println(lista);
		
		System.out.println(); //Salto de linea
		//Recorrer o recuperar todos los valores de la lista e imprimirlos en una nueva lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		
		//Se puede almacenar varios elementos si se parametriza la lista
		//con elem Object o si no se parametriza
		List<Object> coleccion = new ArrayList<Object>();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add("$");
		
		System.out.println(coleccion.get(2));
	}

}
