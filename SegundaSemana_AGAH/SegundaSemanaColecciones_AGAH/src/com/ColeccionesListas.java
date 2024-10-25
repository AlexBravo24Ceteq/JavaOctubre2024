package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - Son una coleccion de datos o elementos 
		//definida como una sucesion de los mismos
		//Esta coleccion se implementa a traves de la interface list
		//Y por medi de un array redimencionable de la clase ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones
		//mas utilizadas y con mejor rendimiento
		//No podemos guardad tipos de datos primitivos
		//Pero si datos de tipo objeto(String, Wrapper,etc)
		
		//Declaramos una lista de elementos
		
		List<String> lista = new ArrayList<String>();
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Imprimir una lista en consola
		
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemnto de la lista 
		System.out.println(lista.get(2));
		
		//Devuelva un valor booleano si el elemnto existe en la lista
		System.out.println(lista.contains("Gabriela"));
		
		//Devuelve la posicion donde se encuentra al elemnto por 
		//primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve la ultima posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posicion
		lista.add(2, "Celso");//Se agrega el elemento y desplaza
		//las posiciones. No remplaza el elemento del indici indicado
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista
		//Imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con 
		//elementos Object o si no la para metrizo
		
		List coleccion= new ArrayList();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
