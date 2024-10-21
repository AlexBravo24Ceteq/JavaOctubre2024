package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - Son una coleccion de datos o elementos definida como una sucesion de los mismos
		//esta coleccion se implementa a traves de la interface List y por medio de un Array
		//redimensionable de la clse Array List
		//Las listas si admiten valores duplicados es de las colecciones mas utilizadas y con 
		//mejor rendimiento
		//No podemos guardar tipos de datos primitivos pero si datos de tipo objeto (String,Wraper, etc.)
		
		//Declarar una lista de elementos de tipo String
		
		List<String> lista = new ArrayList<String>();
		
		//Agregaer valores o elementos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarahi");
		lista.add("Alberto");
		lista.add("Gabriela");
		
		lista.add("Alberto");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemento de la lista 
		System.out.println(lista.get(2));
		
		//Se devuelva un valor booleano si el elmento existe en la lista
		System.out.println(lista.contains("Gabriela"));
		
		//Devuelve la posicio0n donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve la ultima posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemnto de mi lista
		lista.remove(5); //Se selecciona si eliminamos por indice o por el objeto 
		System.out.println(lista);
		
		//Podemos añadir elementos a la lista , indicando una determinada posicion
		lista.add(2, "Celso"); //Se agrega el elemento y desplaza las posiciones, no reemplaza 
		//las el elemento del indice indicado
		System.out.println(lista);
		
		//Remplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Si yo quiero recorrer o recuperar todos los valores de mi lista
		//e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos object
		//o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object> ();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		
		

	}

}
