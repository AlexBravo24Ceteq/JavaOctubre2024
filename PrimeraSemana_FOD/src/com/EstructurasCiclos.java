package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// ciclos o tambien llamados bucles que son estructuras que nos van a 
		//permitir repetir centencias o procesos o ejecutar un 
		//bloque de codigo en determinado numero de  veces
		//ciclo wile -> ciclo ideterminado
		
		/* mientras (esto se cumpla){
		 * 		se ejecuta este bloque de codigo
		 * }
		 */
		
		int x = 1;
		/*
		while (x <= 5) {
			
			System.out.println(x +".-Hola mundo");
			//podemos controlar este ciclo infinito aumentando el valor de x
			//x = x +1;
			 //otra forma de incrementar o expresar el incremento de una
			 //variable seria simplificar con x++
			x++;
			}
			*/
		// do while -> primero ejecuta la accion y despues pregunta si deve seguir realizandose,
		//es ciclo es util cuando no esncontramos con situaciones en las que posiblemente
		//el programa tenga una condicion inposible o numero al azar
		//por lo menos aseguramos que n uetro programa se ejecute una sola vez
			do {
				System.out.println("Hola Mundo");
				x++;
			} while (x<5);
			// otro ejemplo en el cual este ciclo puede ser util
		//imaginene una maquina expendedoraa de productos que necesita dinero para la compra de producto
			//mientras no se llegue al precio del producto la maquina deve seguir mostrando un mensaje "Introduce dinero"
			
			//for -> que es un ciclo determinado es util cuando queremos o sabemos cuantas veces queremos ejecutar una tarea 
			//para (estos argumentos){
			//ejecuta este bloque de codigo
			//}
			//
			//para (una variable de control; condicion; un incremento en el control){
			//ejecutar este bloque de codigo;
			//}
			System.out.println("\nCiclo for");
			for (int i = 1; i < 5; i++) {// si iniciamos i = 0 iniciaremos desde cero y no desde 1
				System.out.println(i + ".-Hola Mundo");
			}
	}

}
