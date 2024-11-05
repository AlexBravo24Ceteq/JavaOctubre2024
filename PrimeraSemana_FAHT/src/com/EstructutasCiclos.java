package com;

public class EstructutasCiclos {

	public static void main(String[] args) {
		// Ciclos o bucles 
		/* Estructuras que nos permiten repetir
		 * sentencias o procesos o ejecutar bloques de
		 * codigo determinado o indeterminado un 
		 * numero de veces
		 */

		//While- ciclo indeterminado
		
		/* mientras (esto se cumpla){
		 * se ejecutara este bloque de codigo
		 * }
		 */
		
		int x=1;
//	
//		while (x<=5) {
//			System.out.println(x+".-Hola Mundo");
//			//podemos controlar este ciclo infinito aumentando 
//			//el valor de x
//			x=x+1;
//		}
		
			//do while-primero ejecita la accion y luego pregunta si debe
			//seguir realizandose. Este ciclo es util cuando nos encontramos en situaciones 
			//en las que posiblemente el programa tenga una condición imposible o
			// que no se pueda cumplir. ej num al azar
			//Por lo menos nuestro programa asegura hacerlo una vez.
		System.out.println("Ciclo do While:");
		do {//haz lo siguiente
			System.out.println("Hola mundo");
		}while (x>5);
		System.out.println(" ");
		
		/* Otro ejemplo ene l cual este ciclo puede ser util, imagina una maquina
		 * expendedora de productos que tiene que solicitar dinero para la compra de 
		 * un producto.
		 * mientras no lleguemos al precio del producto la maquina debe seguir 
		 * mostrando un msj "introduce dinero".
		 */
		
		/* for- ciclo determinado- es util cuando queremos o sabemos cuantas veces
		 * se va a ejecutar una tarea
		 * 
		 * Para (estos argumentos){
		 * ejecuta este bloque de codigo
		 * }
		 * 
		 * para (variable de control; condicion; un incremento en el control){
		 * ejecuta este bloque de codigo
		 * }
		 */
		System.out.println("Ciclo For:");
		for (int i = 1; i < 5; i++) {
			System.out.println(i+".-Hola mundo");
		}
		
	}//end

}
