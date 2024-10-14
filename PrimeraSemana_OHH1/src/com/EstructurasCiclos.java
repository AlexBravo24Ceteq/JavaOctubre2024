package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
//		// CICLOS o tambi�n llamados Bucles
//		//Estructuras que nos van a permitir repetir sentencias 
//		//o procesos o ejecutar un bloque de c�digo un determinado o
//		//indeterminado n�mero de veces
//		
//		//While - ciclo indeterminado
//		
//		/*mientras (esto se cumpla){
//		 *      se ejecutar� este bloque de c�digo 
//		 */
//	
	int x = 1;
//	
//	while (x<=5) {
//		System.out.println(x +".-Hola Mundo");
//		//Podemos controlar este ciclo infinito aumentando el valor de x
//		
//		//x = x + 1;
//		//Otra forma de incrementar o expresar el incremento de una variable de 
//		//uno en uno ser�a la siguiente
//		
//		x++;
//				
//	}
		
		// do while - primero ejecuta la acci�n y luego pregunta si debe seguir
		//realiz�ndose. Este ciclo es �til cuando nos encontremos en situaciones 
		//en las que posiblemente el programa tenga una condici�n imposiblo o que
		//no se pueda cumplir. Ej. n�meros al azar
		//Por lo menos nuestro programa aseguramos que se ejecute una vez
		
		//do { // haz lo siguiente
		//	System.out.println("Hola Mundo");
		//} while (x>5);
		
		//Otro ejemplo en el cual este ciclo puede ser �til, imagine una m�quina 
		//expendedora de productos que tiene que solicitar dinero para la compra
		//de un producto
		//mientras no lleguemos al precio del producto, la m�quina debe seguir
		//mostrando un mensaje que diga "introduce el dinero"
		
		//for - ciclo determinado - es �til cuando queremos o sabemos cu�ntas veces
		//se va a ejecutar una tarea
		
		/*
		 * para (estos argumentos){
		 * ejecuta este bloque de c�digo
		 * }
		 * 
		 *  
		 *  para (variable de control; condici�n; un incremento en el control){
		 *  ejecuta este bloque de c�digo
		 *  } 
		 */
		System.out.println("Ciclo For");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i+ ".- Hola Mundo");
		}

	}

}
