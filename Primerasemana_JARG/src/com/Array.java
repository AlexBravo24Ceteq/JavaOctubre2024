package com;

public class Array {

	public static void main(String[] args) {
		// Los Arrays son una estructura que permite almacenar datos
		// de un mismo tipo
		//una vez declarado su tamaño estos no pueden crecer en tiempo de ejecucion
		//
		
		//Ej. declarando un array de numeros enteros con su tamaño
		//inciado
		
		int [] numeros = new int [3];
		
		//Una vez que tenemos nuestro array iniciado podemos guardar
		//los valores en el
		
		numeros[0] = 1000;
		numeros[1] = 2000;
		numeros[2] = 3000;
		
		//Ej. puedo sumar los valores de mi array llamandolas por
		//su posicion
		
		int suma = numeros[2] + numeros[1];
		
		//Ej. imprimir en consola un valor determinado en nuestro array
		System.out.println(numeros[1]);
		
		//otra forma de declarar un array es inciandolo ya con sus valores asignados
		
		int[] numeros2 = {100,200,300,400,500};
		
		//para recorrar un array o imprimir todos los elementos del mismo en consola
		//podemos recurrir al uso del ciclo for
		
		for (int i = 2; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		//Imprimir en pantalla todos los valores del array con un ciclo for each
		System.out.println("Uso del ciclo for each");
		
		for (int item:numeros2) {//para cada elemento contenido en numeros2
			System.out.println(item);//mando a imprimir en una nueva linea cada elemento
		}
		
		//recuerden la teoria es que los arrays solo pueden contener elementos de
		//un mismo tipo de dato en comun
		//Ej. Array de Strings, array de caracteres, etc
		
		String [] nombres = {"Alex", "Ana", "Roberto"};
		char [] palabra = {'H','o','i','a'};
		
		//Como puedo tener un array o almacenar enun aarry varios tipos de datos?
		//Quiero almacenar valores, decimales, booleanos, enteros, cadenas de textos, etc
		
		//podriamos tener un array de elemtos de tipo Object
		
		Object elemento ="String";
		Object elemento1 = 3.1416;
		
		Object [] objetos = {true, false, 3.1416, 100, "Adriana",'B'};
	}

}
