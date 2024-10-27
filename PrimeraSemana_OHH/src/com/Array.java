package com;

public class Array {

	public static void main(String[] args) {
//		Declarando un array de números enteros 
		
		int suma;
		int [] numeros = new int[3];
		
		numeros[0] = 1000;
		numeros[1] = 2000;
		numeros[2] = 3000;
		
//		Se pueden sumar los valores 
		suma = numeros[1] + numeros[2];
		System.out.println("suma de las posiciones 1 y 2: " + suma);
		numeros[1] = 1000;
		System.out.println("impresion de la posicion 1: " + numeros[1]);
		
//		declarando un array con valores iniciales
		int numeros2[]= {100,200,300,400,500};
		
		for(int i=0; i<numeros2.length; i++) {
			System.out.println("Valor en la posicion "+ i + " = " + numeros2[i]);
		}
		
//		usando for each
		for (int elemento:numeros2) {
			System.out.println("Con for each: " + elemento);
		}
		
		String nombre[] = {"Alex", "Ana", "Roberto"};
		char palabra[] = {'H', 'o', 'l', 'a'};
		
//		array de elementos de tipo Object, se guardan como tipo objeto
		Object elemento[] = {true, 3.1416, "Oscar", "C"};
	}

}
