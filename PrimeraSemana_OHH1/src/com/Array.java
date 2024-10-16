package com;

public class Array {

	public static void main(String[] args) {
		// Los arrays son una estructura que permite almacenar datos de un mismo tipo
		//Una vez declarado su tama�o estos no pueden crecer en tiempo de ejecuci�n
		//Estas estructuras puedend conocerse a veces con el nombre de de vectores o arreglos
		
		
		//Ej. declarando un array de n�meros enteros con su tama�o iniciado
		
		int [] numeros = new int[4];
		
		// Una vez que tenemos nuestro array iniciado podemos guardar los valores en el
		
		numeros [0] = 1000;
		numeros [1] = 2000;
		numeros [2] = 3000;
		// Ej. qu� sucede si a�adimos un valor m�s en una posici�n que no existe
		numeros [3] = 4000;
		
		// Ej. puedo sumar los valores de mi array llam�ndolos por su posici�n
		
		int suma = numeros [2] + numeros [1];
		System.out.println(suma);
		numeros [1] = 10000; // A partir de esta l�nea la posici�n numeros [1] tiene 
		//el valor de 1000, es decir, sus valores son mutables o los podemos reemplazar 
		
		// Ej. imprimir en consola un valor determinado de nuestro array
		
		System.out.println(numeros [1]);
		
		// Otra forma de declarar un array es inici�ndolo con sus valores asignados
		
		int [] numeros2 = {100, 200, 300, 400, 500};
		
		System.out.println(numeros2[0]);
		
		// Para recorrer un array o imprimir todos los elementos del mismo en consola
		//podemos recurrir al uso de un ciclo for
		
		for(int i = 0; i < numeros2.length; i++){
				
		System.out.println(numeros2[i]);
		}
		
		// Imprimir en pantalla todos los valores del array con un ciclo for each
		
		for(int item:numeros2  ) { // para cada elemento contenido en numeros2
			System.out.println(item); // Mando a imprimir en una nueva l�nea cada elemento
					}
		// Recuerden, la teor�a es que los arrays solo pueden contener elementos de un mismo
		// tipo de dato en com�n
		// Ej. Array de String
		
		String [] nombres = {"Alex", "Ana", "Roberto"};
		//char [] palabra = {"H", "o", "l", "a"};
		
		// �C�mo puedo tener un array o almacenar en un array varios tipos de datos?
		
		// Quiero almacenar valores decimales, booleanos, enteros, cadenas de texto, etc.
		
		// Podriamos tener un array de elementos de tipo object
		
		Object elemento = "String";
		
		//Object elemento = 3.1416;
		
		Object [] objetos = {true, false, 3.1416, 1000, "Adriana", 'B'};
				
	}

}
