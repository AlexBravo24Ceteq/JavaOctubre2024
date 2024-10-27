package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		
		/*
		 * CICLOS o tambien llamados Bucles
		 * Estructuras que nos van a permitir repetir
		 * secuencias o procesos o ejecutar un bloque de 
		 * codigo un determinado o indeterminado numero
		 * de veces
		 */
		
		//While - ciclo indeterminado
		
		/*
		 * mientras(esto se cumpla) {
		 * 		Se ejecutara este bloque de codigo
		 * }
		 */
		
		int x=1;
		
//		while (x<5) {
//			System.out.println(x + ".- Hola Mundo");
//			//Podemos controlar este ciclo infinito aumentando el valor
//			//de x
//			//x += 1;
//			//Otra forma de incrementar o expresar el incremento de una variable
//			//de uno en uno seria la siguiente
//			
//			x++;
//		}
		
		// do while - primero ejecuta la accion y luego pregunta si debe
		//seguir realizandose. Este ciclo es utili cuando nos encontramos
		// en situaciones en las que posiblemente el programa tenga una 
		//condicion imposible o que no se pueda cumplir. Ej. numeros al azar
		//por lo menos aseguramos que nuestro programa se ejecute 1 vez
		
		do {
			System.out.println("Hola mundo");
		}while(x>5);
		
		/*
		 * Otro ejemplo en el cual este ciclo puede ser util, imagine una maquina
		 * expendedora de productos que tiene que solicitar dinero para la compra
		 * de un producto
		 * mientras no llegamos al precio del producto la maquina debe seguir
		 * mostrando un msj "introduce dinero"
		 */
		
		/*
		 * for - ciclo determinado - es util cuando queremos o sabemos cuantas
		 * veces se va a ejecutar una tarea
		 */
		
		/*
		 * para (estos argumentos){
		 * 		ejecuta este bloque de codigo
		 * }
		 * 
		 * para (variable de control; condicion; incremento en el control) {
		 * 		ejecuta este bloque de codigo
		 * }
		 */
		
		System.out.println("\nCiclo For");
		for(int i=1; i < 5; i++) {
			System.out.println(i + ".- Hola Mundo");
		}

	}

}
