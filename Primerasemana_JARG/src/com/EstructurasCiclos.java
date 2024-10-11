package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ciclos o tambien llamdos bucles
		//Estructuras que nos van a permitir repetir
		//sentencias o procesos o ejecutar un bloque de
		//codigo un determinado o indeterminado numero
		//de veces
		
		//while - ciclo indeterminado
		
		/* mientras (esto se cumpla){
		 * 			se ejecutara este bloque de codigo
		 * }
		 */
		int x = 1;
//		
//		while (x<5) {
//			System.out.println("Hola mundo");
//			//podemos controlar este ciclo infinito aumentando el valor
//			//de x
//			//x = x+1;
//			//otra forma de incrementar o expresar el incremento de una variable de uno en uno
//			//seria la siguiente
//			x++;
//			
//			
//			
//		}
		// do while - primer ejecuta la accion y luego pregunta si debe seguir
		//realizando. Este ciclo es util cuando nos encontramos en sistuaciones
		//en las que posiblemente el programa tenga una condicion imposible o
		// que se pueda cumplir. Ej. numeros al azar
		//Por lo menos nuestro programa aseguramos que se ejecute 1 vez
		
		do {//haz lo siguiente
			System.out.println("Hola mundo");
			x++;
		}while(x<5);
		
		//for - ciclo determinado - es util cuando queremos o sabemos cuantas veces
		//se va a ejecutar una tarea
		
		/*
		 * para (estos argumentos){
		 * 	ejecuta este bloque de codigo
		 * }
		 * para (variable control; condicion; incremento en el control){
		 * ejecuta este bloque de codigo
		 * }
		 */
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i + "Hola muntdo");
			
		}
	}

}
