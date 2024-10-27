package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o bucles: estructuras que nos van a permitir
		//repetir sentencias o procesos (bloques de codigo)
		//indeterminadas veces
		
		//while- -ciclo indeterminado
		
//		int x=1;
//		while (x<=5) {
//			System.out.println("Hola Mundo");
//			//Podemos controlar este ciclo aumentando el valor de x
//			//x = x + 1;
//			//Otra forma de inclementar una variable es
//			//x++;
//		}
		
		//do while - primero ejecuta la accion y luego pregunta si debe continuar.
		//cuando no se puede cumplir una condicion
//		do {
//			System.out.println("Hola Mundo");
//			x++;
//		}while (x<5); //(indeterminado)
		
		//Otro ejemplo es:Una maquina expendedora solicita dinero para comprar un producto
		//mientras no se llegue al precio seguira mostrando "Introduce dinero"
		
		//for - ciclo determinado - es util para saber cuantas veces se ejecuta una tarea
		
		//para (estos args) {
		//ejecuta bloque
		//}
		//para (variable ctrl; condicion; incremento){
		//ejecuta bloque
		//}
		
		System.out.println("Ciclo FOR");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". Hola Mundo");
		}
		//Ciclo controlado

	}

}
