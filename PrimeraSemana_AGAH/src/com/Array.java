package com;

public class Array {

	public static void main(String[] args) {
		//Los arrays son una estructura que permite almacenar datos de un mismo tipo
		//Una vez declarado su toamaño estos no pueden crecer en tiempo
		//de ejecucion
		// Estas estucturas deben conocerse aveces con el nombre de vectores.
		//o arreglos
		
		//Ej, declarando un array de numeros enteros con su tamaño iniciado
		
		
		int [] numeros =new int [4]; //se crea el espacio de almacenar 3 datos
		
		//una vez teniendo el array iniciado podemos guardar los valores en el 
		
		
		numeros[0] = 1000;
		numeros[1] = 2000;
		numeros[2] = 3000;
		//Ej. que sucede si añidimos un valor mas en una posicion que no existe
		
		numeros [3] = 4000;
		
		//Ej. puedo sumar los valores de mi array llamandolos por su posicion
		
		
		int suma = numeros[2] + numeros[1];
		System.out.println(suma);
		numeros [1] = 10000;//En esta linea ya remplaza el valor que tenia inicialmente 
		//sus valores son mutables o los podemos remplazar
		
		//Ej. Imprimir en consola un valor determinado de nuestro array
		
		System.out.println(numeros[1]);
		
		//Otra forma de declarar un array es iniciandolo ya con sus valores asignados
		
		int [] numeros2 = {100,200,300,400,500};
		
		//System.out.println(numeros2[]);
		
		//para recorrer un array o imprimir todos los elementos del mismo en consola podemos
		//recurrir al uso de un ciclo for
		
		for (int i = 0; i <numeros2.length; i++) {
			System.out.println(numeros2[i]);
			//podemos extraer datos del array validando de donde a donde lo queremos extraer
		}
		
		//Imprimir en pantalla todos los valores dl array con un ciclo for each
		
		System.out.println("Uso de ciclo for each:");
		for (int item:numeros2) {//item quiere decir oara cada elemento en numeros 2
			System.out.println(item);//mando a imprimir en una nueva linea cada elemento 
			//Este ciclo si rrecorre todos los elemtentos del array a no er que le pongamos una
			//validacion
		}
		
		//Recordae la teoria es que los arrays solo pueden contener elementos de un mismo tipo
		//de datos en comun
		//Ej. Array de Strings,array de caracteres, etc.
		
		String [] nombres = {"Alex", "Ana", "Roberto"};
		char [] palabra = {'h', 'o', 'l', 'a'};
		//¿Como puedo tener un array o almacenar en un array varios tipos de dato'
		//Quiero almacenar valore, decimales, booleanos,enteros,cadenas de texto, etc
		
		//Podriamos tener un array de elementos de tipo Object
		//si se pueden almacenar otros datos pero no se guardarian como enteros o caracteres
		//o decimales si no mas bien se almacenan como tipo object.
		
		Object elemento = "String";
		Object elemento1 = 3.1416;
		
		Object [] objetos = {true, false, 3.1416, 1000, "Adriana", 'B'};
		
		
		
	
	
	}	
		
		
		
		
		
		
		
	
	}

