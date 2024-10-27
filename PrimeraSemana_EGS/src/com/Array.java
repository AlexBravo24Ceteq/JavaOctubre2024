package com;

public class Array {

	public static void main(String[] args) {
		/*
		 * Los arrays son una estructura que permite almacenar datos
		 * de un mismo tipo
		 * Una vez declarado su tamaño estos no pueden crecer en tiempo
		 * de ejecucion
		 */
		
		/*
		 * Ej. declarado un array de numeros enteris con su tamaño
		 * iniciado
		 */
		
		int []  numeros = new int [3];
		
		/*
		 * Una vez que tenemos nuestro array iniciado podemos guardar
		 * los valores en el
		 */
		
		numeros[0] = 1000;
		numeros[1] = 2000;
		numeros[2] = 3000;
		// Ej. que sucede si añadimos un valor más en una posicion que no existe
		//numeros[3] = 4000;
		/*
		 * Ej. puedo sumar los valores de mi array llamandolos por
		 * su posicion
		 */
		
		int suma = numeros[2] + numeros[1];
		System.out.println(suma);
		numeros[1] = 1000;//a partir de esta linea la posicion numeros[1] tiene
		// reemplazar
		
		//Ej. Imprimir en consola un valor determinado de nuestro array
	
		System.out.println(numeros[1]);
		
		//Otra forma de ddeclarar un array es iniciandolo ya con sus 
		//valores asignados
		
		int [] numeros2 = {100,200,300,400,500};
		
		//System.out.println(numeros2[0]);
		
		/*
		 * Para recorrer un array o imprimir todos los elementos del mismo en consola
		 * Podemos recurrir al uso de un ciclo for
		 */
		for (int i = 0; i<numeros2.length; i++)
			System.out.println(numeros2[i]);
		
		//imprimir en pantalla todos los valores del array con un ciclo for each
		System.out.println("\nUso de ciclo for each");
		
		for (int item:numeros2) 
			System.out.println(item);
		
		/*
		 * Recuerde la teoria es: los arrays solo pueden contener elementos de 
		 * un mismo tipo de dato en común
		 * Ej. Array de tipo Strings
		 */
		
		String[] nombres = {"Alex","Ana","Roberto"};
		char [] palabras = {'H', 'o', 'l','a'};
		
		/*
		 * ¿Como puedo tener un array o almacenar en un array varios tipos de datos?
		 * Quiero almacenar valores de elementos de tipo Object
		 */
		
		// Podríamos tener un array de elementos de tipo Object
		Object elemento = "String";
		Object numero = 3.1416;
		
		Object [] objetos = {true, false, 3.1416, 1000, "Adriana", 'B'};
	}

}
