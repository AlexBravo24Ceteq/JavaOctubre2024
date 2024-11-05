package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//Ciclos tambien llamados bucles
		//Estructuras que nos van a poermitir repetir sentencias o procesos o ejetucar
		//codigo un detertminado o indeterminado numero
		//de veces
		
		//while - ciclo indeterminaod
		
		/*mientras(esto se cumpla){
		 * se ejecuta este bloque
		 * }
		 * 
		 * 
		 */
		
		
		  int x = 1;
		 /* 
		 * while (x<5) { System.out.println("Hola mundo"); 
		 * podemos controlar este cliclo aumentaro el valor 
		 * x = x+1 //otra forma de incrementar es poniendo
		 * ++ //x++; }
		 */
		
		/*do while - primero ejecuta la accion y luego pregunta si debe seguir
		 * realizandose. Este ciclo es util cuando nos encontremos en situasiones
		 * en las que posiblementre el programa tenga una condicion imposible o 
		 * que no se pueda cumplir
		 * ej. numeros al azar
		 * aseguramos que se ejecute 1 vez
		 * */
		
		do {
			System.out.println("Hola mundo");
		}while (x > 5);
		
		//Otro ejemplo, maquina expendedora de productos que tiene que solicitar dinero
		//mientras se llegue al precio se seguira mostrando el msj
		
		
		// for - ciclo determinado - es util cuando queremos o 
		//sabemos cuantas veces se va a ejecutar una tarea
		
		/*
		 * for (estos argumentos){
		 * ejecuta bloque ciclo
		 * }
		 * 
		 * for (variable contol; condicion; incremente en el control){
		 * ejecuta este bloque de codigo
		 * }
		 * */
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i +"Hola mundo");
		}
		
		
		
		
		
	}

}
