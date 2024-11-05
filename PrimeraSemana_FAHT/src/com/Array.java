package com;

public class Array {

	public static void main(String[] args) {
		// Los array son estructuras que permiten almacenar datos
		//de un mismo tipo
		//Una vez declarado su tamaño estos no pueden
		//crecer en tiempo de ejecución
		//Estas estructuras pueden conocerse aveces con el nombre
		// de vectores o arreglos
		
		// ejemplo. declarando un array de numeros enteros con su
		//tamaño iniciado
		
		int [] numeros = new int [4];
		
		//Una vez que tenemos nuestro array iniciado
		//podemos guardar los valores en él
		
		numeros [0]= 1000;
		numeros [1]= 2000;
		numeros [2]= 3000;
		
		//ej. que sucede si añadimos un valor más en una posición
		// que no existe
		numeros [3] = 4000;
		//solo hay que cambiar el valor del array de 3 a 4
		
		// ej. puedo sumar los valores del array 
		//llamandolos por su posición
		
		int suma= numeros [2] + numeros [1];
		System.out.println(suma);
		numeros[1]=33500; //apartir de esta linea la posicion [1]
		//cambia su valor, es decir su valor es mutable on remplazable
		
		// ej. imprimir en consola un valor determinado en nuestro array
		
		System.out.println(numeros[1]);
		
		//otra forma de declarar un array es con sus valores asignados
		
		int [] numeros2 = {100,200,300,400,500};
		
		//System.out.println(numeros2[0]);
		
		//Para recorrer un array o imprimir los elemntos en consola
		// Podemos hacer uso del ciclo For
		
		System.out.println("Ciclo for + array:");
		System.out.println(" ");
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		//Imprimir pantalla todos los valores array con ciclo for
		//each 
		System.out.println("uso de ciclo for each: ");
		System.out.println(" ");
		
		for (int item:numeros2) { // para cada elemento contenido en numeros2
			System.out.println(item);
		}
		
		//la teoria dice queb los array solo pueden contener elementos
		// de un mismo tipo de dato en comun 
		// ej. array de Strings
		
		String [] nombres = {"alex","ana","roberto"};
		char [] palabra = {'H','o','l','a'};
		// ¿Como podemos tener un array o almacenar en un array varios 
		//tipos de datos? 
		//quiero almacenar valores, decimales, booleanos, enteros, cadenas etc
		
		//Podríamos tener un array de elementos de tipo objetc
		Object elemento = "String";
		Object elemento1 = 3.1416;
		
		Object [] objetos = {true, false, 3.1416,1000,"adriana",'b'};
		
	}// end

}
