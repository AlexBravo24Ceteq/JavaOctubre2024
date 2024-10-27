package com;

public class Array {

	public static void main(String[] args) {
		// los arrays son una estructura quepermite almacenar datosd e un mismo tipo 
		//una vez declarado su tamaño, estos no pueden crecer en tiempo de ejecucion
		
		// ej. declarando un array de numeros enteros con su tamaño iniciado 
		
		int [] numeros = new int [4];
		
		//una vez que tenemos nuestro array iniciado podemos guaradar los valores en el
		
		numeros[0] = 1000;
		numeros[1] = 2000;
		numeros[2] = 3000;
		//ej. que sucede si añadfimos un valor mas en una posicion que no existe
		numeros[3] = 4000;
		
		// el. pudeo su,ar los valores de mi array llamandolos por su posicion 

		int sum = numeros[2] + numeros[1];
		
		//ej. imprimir en consola un valor determinado de nuestro array
		System.out.println(sum);
		numeros[1] = 10000; // a partir de esta linea la posicion numero[1]tienen el valor de 10000
		//es decir, su valor es mitable o se puden cambiar 
		//ej imprime en consola un valor de nuestro array en este caso el valor ya modificado 
		System.out.println(numeros[1] + ", " + numeros[0] + ", " + numeros[3]);
		
		System.out.println("Array con ciclo for");
		//otra foerma de declarar un array es iniciandolo ya con sus valores asignados 
		int [] numero2 = {100, 200, 300, 400, 500};

		for (int i = 0; i < numero2.length; i++) {
			System.out.println(numero2[i]);
		}
		System.out.println("Uso de ciclo for each");
		// imprimir en pantalla todos los valores del array con un ciclo for each
		for (int i : numero2) {//para cada elemento contenido en numero2
			System.out.println(i);//manda a imprimir en una nueva linea cada elemento del arreglo
		}
		
		//recuerden la teoria es que los arrays solo pueden contener elementos de un mismo tipo de dato en comun
		//ej. array de strings
		String [] nombres = {"Alex", "Ana", "Roberto"};
		char [] caracter = {'A','B','C','D'};
 		//podemos tener un array de elemto de tipo Object
		Object elemento = "String";
		Object elemento1 = 3.1416;
		
		Object[]objetos = {true, false, 3.1416, 1000, "Adriana", 'B'};
	}

}
