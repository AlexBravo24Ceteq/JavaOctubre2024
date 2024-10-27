package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
//		// CICLOS o también llamados Bucles
//		//Estructuras que nos van a permitir repetir sentencias 
//		//o procesos o ejecutar un bloque de código un determinado o
//		//indeterminado número de veces
//		
//		//While - ciclo indeterminado
//		
//		/*mientras (esto se cumpla){
//		 *      se ejecutará este bloque de código 
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
//		//uno en uno sería la siguiente
//		
//		x++;
//				
//	}
		
		// do while - primero ejecuta la acción y luego pregunta si debe seguir
		//realizándose. Este ciclo es útil cuando nos encontremos en situaciones 
		//en las que posiblemente el programa tenga una condición imposiblo o que
		//no se pueda cumplir. Ej. números al azar
		//Por lo menos nuestro programa aseguramos que se ejecute una vez
		
		//do { // haz lo siguiente
		//	System.out.println("Hola Mundo");
		//} while (x>5);
		
		//Otro ejemplo en el cual este ciclo puede ser útil, imagine una máquina 
		//expendedora de productos que tiene que solicitar dinero para la compra
		//de un producto
		//mientras no lleguemos al precio del producto, la máquina debe seguir
		//mostrando un mensaje que diga "introduce el dinero"
		
		//for - ciclo determinado - es útil cuando queremos o sabemos cuántas veces
		//se va a ejecutar una tarea
		
		/*
		 * para (estos argumentos){
		 * ejecuta este bloque de código
		 * }
		 * 
		 *  
		 *  para (variable de control; condición; un incremento en el control){
		 *  ejecuta este bloque de código
		 *  } 
		 */
		System.out.println("Ciclo For");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i+ ".- Hola Mundo");
		}

	}

}
