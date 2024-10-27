package com;

public class Array {

	public static void main(String[] args) {
		// Los arrays sonn una estructura que nos permiten almacenar datos
		//de un mismo tipo. Una vez declarados, estos no pueden crecer 
		//en tiempo de ejecucion.
		
		//Array de números enteros:
		int [] numeros = new int [4];
		
		//Una vez iniciado el array se guardan valores
		
		numeros[0] = 1000;
		numeros[1] = 2000;
		numeros[2] = 3000; //Valores estaticos
		
		//Ej. si añadimos un valor en una posicion que no existe
		numeros[3] = 4000;
		
		//Ej. Se pueden sumar los valores del array llamandolos 
		//por su posición
		
		int suma = numeros[2] + numeros[1];
		System.out.println(suma);
		numeros[1] = 10000; //Sustituye el valor en esa posición (son mutables o se pueden reemplazar)
		
		//Ej. Imprimir en consola un valor determinado del array
		System.out.println(numeros[1]);
		
		//Otra forma de declarar un array es iniciandolo con valores asignados
		
		int [] numeros2 = {100, 200, 300, 400, 500};
		System.out.println(numeros2); //Objeto estructurado por lo que nos muestra datos "erroneos"
		
		System.out.println(numeros2[0]);
		
		//Para recorrer un array o imprimir todos los elementos del mismo:
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		//Imprimir todos los valores del array con un ciclo for-each
		System.out.println("USO DEL CICLO FOR-EACH");
		
		for (int item:numeros2) {//para cada elemento contenido en numeros 2
			System.out.println(item); //imprimir en una nueva linea cada elemento
		}
		
		//TEORIA: los arrays solo pueden contener elementos de un mismo tipo de dato en común
		//Ej. Array de strings
		String [] nombres = {"Alex", "Ana", "Roberto"};
		char [] palabra = {'H', 'o', 'l', 'a'};
		
		//Podriamos tener un array de elementos de tipo Object
		Object elemento = "String";
		Object elemento1 = 3.1416;
		Object [] objeto = {elemento, elemento1};
		
		Object [] objetos = {true, false, 3.1416, 1000, "Adriana", 'B'}; //1000 se guarda como objeto, para usarse
																		//deben convertirse a int, string...
		
		for (Object item:objeto) {
			System.out.println(item);
			}
		
	}

}
