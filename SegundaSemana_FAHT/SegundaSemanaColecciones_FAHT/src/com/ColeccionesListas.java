package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas- Son una coleccion de datos o elemntos
		//definida como una sucesion de los mismos
		// Esta coleccion se implementa atravez de la interface
		//list y por medio de un array redimensionable
		//de la clase ArrayList
		// Las listas si admiten valores duplicados, es de las
		//colecciines más utilizdas y con mejor rendimiento
		//No podemos guardar tipos de dato primitivo
		//Pero si datos de tipo Objeto (String, Wrapper, etc)
		
		//Declarar una lista de elemtos tipo String
		List<String> lista = new ArrayList <String> ();
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");

		//Imprimir una lista en consola
		System.out.println(lista);

		//Imprimir el valor d eun solo elemnto de la lista
		System.out.println(lista.get(2) +" "+ lista.get(0));
		
		//Devuelva valor booleano si el elemento exite en la lista
		System.out.println(lista.contains("Alex"));
		System.out.println(lista.contains("Gabriela"));
		
		//Devuelve la posisicion donde se encuentra el elemento por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve la última posiicon donde encuentra el elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5); //nombre o numero de posicion
		System.out.println(lista);
		
		//Podemos Añadir elementos a la lista, 9indicando uan determinada
		//posicion
		lista.add(2, "Celso");//Seagrega el elemnto y dezplaza las posiciones
		//no remplaza al elemnto del indice indicado
		System.out.println(lista);
		
		//Remplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista
		// e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		//Puedo almacenar varios elementos si parametrizo mi lista
		//Con elementos Object o si no la parametrizo
//		List<Object> coleccion = new ArrayList<Object>();//se puede así o 
		List coleccion = new ArrayList<>(); //asi pero no es recomendable
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
	}//end
}//end
