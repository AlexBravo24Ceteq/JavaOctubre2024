package com;

public class Array {

	public static void main(String[] args) {
		// Los arrays son una estructura que permite almacenar datos
		//de un mismo tipo
		//Una vez declarado su tamaño, estos no pueden crecer en tiempo de ejecucion
		//Estas estructuras se pueden conocerse a veces con el nombnre de vectores o arreglos
		
		//Ej declarando un array de numeros enteros con su tamaño iniciado
		int [] numeros = new int[4];
		
		//Una vez que tenemos nuestro arrasy iniciado podemos guardar
		//los valores en el
		
		numeros[0] = 1000;
		numeros[1] = 2000;
		numeros[2] = 3000;
		
		//Ej. que sucede si a;adimos un valor mas en una posicion que no existe
		//Aprece el error "ArrayIndexOutOfBoundsException" ya que no se puede agregar mas datos
		numeros[3] = 4000;
		
		//Ej. puedo sumar los valores de mi array llamandolos por 
		//su posicion
		
		int suma = numeros[2] + numeros[1];
		
		//ej, imprimir en consola un valor determinaod de nuestro array
		System.out.println(numeros[1]);
		
		//Otra forma de declarar un array
		
		int[] numeros2 = {100,200,300,400,500};
		
		//imprimir todos los valores del array
		//se requiere de un for
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		//imprimir en pantalla todos los valores del array con un ciclo for each
		//el for each es una forma mas simplificada del for
		
		for(int item:numeros2) {//para cada elemento contenido en numeros2
			System.out.println(item);
		}
		
		//Recuerden la teoria es que los arrays solo pueden contener elementos de
		//un mismo tripo de dato en comun
		//Ej. Array de String
		
		String[] nombres =  {"Alex", "Ana","Roberto"};
		char[] palabra = {'H','o','l','a'};
		
		//Como puedo tener una array y almacenar varios tipos de datos
		//quiero almacenar valores, decimales, booleanos, enteros, etc
		
		//Podriamos hacerlo con un array de tipo "Object"
		Object elemento = "String";
		Object elemento1 = 3.1416;
		
		//Si nos preguntan si se puede pero se estan guardando como tipo Object, no como booleano, double, String, etc
		Object [] objetos = {true, false,3.1416,1000,"Adriana",'B'};
	}

}
