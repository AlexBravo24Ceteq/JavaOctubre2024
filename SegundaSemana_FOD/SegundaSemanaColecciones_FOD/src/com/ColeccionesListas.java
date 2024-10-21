package com;


import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		//Listas -> son una coleccion de datos o elementos definida como una sucesion de los mismos 
		//esta coleccion se implementa atraves de la interface list y por medio de un array rediemencionable
		// de la clase array list
		//las listas si admiten datos duplicados es de las colecciones mas utilizadas y con mejor rendimiento
		//no podemos guardar datos de tipo primitivo pero si de tio String 
		
		List<String> lista = new ArrayList<String>();
		//agrgar valores o elementos a nuestra lista y en este caso llamamos a nuestra lista ponemos un punto
		lista.add("Ferrer");
		lista.add("Adriana");
		lista.add("Alberto");
		lista.add("Sarai");
		lista.add("Gabriela");
		lista.add("Adriana");
		//imprimir una lista en cosola 
		System.out.println(lista);
		//si yo quiero imprimir o recuperar el valor de un solo lemento de la lista en este ejemplo el elemento 5
		//que literalmente esta en la poiscion 6
		System.out.println(lista.get(5));
		//tambien existe la osibilidad que de vuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Alex"));
		//otro de los metodos que tambien podemos utilizar es uno qued devuelve la pocicion 
		//donde encuentra el elemnto por primera vez
		System.out.println(lista.indexOf("Ferrer"));
		
		//devuelve la ultima posicion donde encuentra ele elemento
		System.out.println(lista.lastIndexOf("Adriana"));
	//eliminar un elemento de mi lista
		lista.remove(5);//elimina al objeto que se encuentra ene sa posicion
		lista.remove("Adriana");//elimina el primer objeto que encuentre con ese nombre
		System.out.println(lista);
		//Añadir elemtos a la lista indicando una determinada posicion
		lista.add(2, "Celso");//se agrega el elemento y desplasa las posiciones y no lo reemplaza
		System.out.println(lista);
		//reemplazar el valor de una determinada posicion 
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva linea 
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//puedo alamcenar varios elemetos si parametriso mi lista con elementos object o si no la parametriso
		List<Object> coleccion = new ArrayList<Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('A');
		System.out.println(" \n" + coleccion.get(2));
		
		
	}

}
