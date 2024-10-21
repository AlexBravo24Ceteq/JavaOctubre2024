package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// LISTAS - Son una colecciones de datos o elementos
		// definida como una sucesi�n de los mismos
		// Esta colecci�n se implementa a trav�s de la interface List
		// y por medio de un array redimensionable de la clase
		// ArrayList
		// Las listas s� admiten valores duplicados, es de las colecciones
		// m�s utilizadas y con mejor rendimiento
		// No podemos guardar tipos de dato primitivo
		// pero s� datos de tipo Objeto (String, Wrapper, etc)
		
		// Declarar una lista de elementos de tipo String
		
		List <String> lista = new ArrayList<String>();  // List es interfase y ArrayList es una Clase
		
		// Agregar elementos a nuestra lista
		
		lista.add("Adriana");   // posici�n 0
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		// Imprimir una lista en consola
		System.out.println(lista);
		
		// Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));
		
		// Devuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Gabriela"));
		
		// Devuelve la posici�n donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		// Devuelve la �ltima posici�n donde encuentra al elemento 
		System.out.println(lista.lastIndexOf("Alberto"));
		
		// Eliminar un elemento de mi lista
		//lista.remove("Alberto"); // Quita al primer elemento que encuentra
		System.out.println(lista);
		
		//lista.remove(5); // Quita al elemento en posici�n n�mero 5
		System.out.println(lista);
		
		// Podemos a�adir elementos a la lista, indicando una deteminada posici�n
		lista.add(2, "Celso"); // Se agrega el elemento y desplaza
		// las posiciones. No desplaza el elemento del �ndice indicado
		System.out.println(lista);
		
		// Reemplazar el valor de una determinada posici�n
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		// Recorrer o recuperar todos los valores de mi lista 
		// e imprimirlos en una nueva l�nea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		} 
		
		// Puedo almacenar varios elementos si parametrizo mi lista
		// con elementos Object o si no la parametrizo
//		List<Object> coleccion = new ArrayLista<Object>();
//		
//		coleccion.add("Nombre");
//		coleccion.add(23);
//		coleccion.add(3.1446);
//		coleccion.add(true);
//		coleccion.add('$');
//		
		List coleccion = new ArrayList(); //se puede sin se�alar qu� tipo de datos vamos a a�adir a la lista
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1446);
		coleccion.add(true);
		coleccion.add('$');
		
		// sin problema acepta los datos
		
		System.out.println(coleccion.get(2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
