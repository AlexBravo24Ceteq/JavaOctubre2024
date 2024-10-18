package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas -son una coleccion de datos o elementos
		// definida como una sucesion de los mismos
		// esta coleccion es implementada a través de la interface List
		// y por medio de un array redimensionable de la clase
		// ArrayList
		// Las listas si admiten valores duplicados, es de las colecciones
		// más utilizadas y con mejor rendimiento
		// no es posible almacenar tipos de dato primitivo
		// pero si datos de tipo Ibjeto (String, Wrapper, etc.)
		
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		
		// Agregar elementos a nuestra lista
		list.add("Adriana");
		list.add("Carlos");
		list.add("Sarai");
		list.add("Alberto");
		list.add("Gabriela");
		list.add("Alberto");
		
		list2.add("Karla");
		list2.add("Francisco");
		list2.add("Julieta");
		
		// imprimir una lista en consola
		System.out.println(list);
		
		// imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(list.get(2));
		
		// tambien se devuelve valor booleano si el elemento existe en la lista
		System.out.println(list.contains("Alberto"));
		
		// otro metodo que devuelve la posicion donde se encuentra el elemento por primera vez
		System.out.println(list.indexOf("Sarai"));
		
		// otro metodo que devuelve la ultima posicion donde encuentra el elemento
		System.out.println(list.lastIndexOf("Alberto"));
		
		// metodo para eliminar un elemento de mi lista
		list.remove(5);
		System.out.println(list);
		
		// metodo para añadir elementos a la lista en una posicion determinada, desplazando los demas
		// valores si exísten despues del valor agregado
		list.add(2, "Juanito");
		System.out.println(list);
		
		// metodo que reemplaza el valor en una lista dada su posicion
		list.set(3, "Sandra");
		System.out.println(list);
		
		// metodo para recorrer o recuperar todos los valores de mi lista
		// e imprimirlos en una nueva linea
		System.out.println();
		System.out.println("imprimir valores de uno a uno: ");
		for(String nombre:list) {
			System.out.println(nombre);
		}
		
		// probando el metodo .addAll();
		list2.addAll(list);
		System.out.println("List 2 contiene: "+list2);
		
		list2.addAll(list.subList(1, 4));
		System.out.println("ahora List 2 tiene: "+list2);
		
		
		// puedo almacenar varios elementos si parametrizo mi lista
		// con elementos Object o sino la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		
		coleccion.add('a');
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add("Hola");
		
		System.out.println(coleccion);
		
		

	}

}
