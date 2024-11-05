package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras condicionales o de decision if
		//evaluan valores booleanos 
		
		/*si (esto se cumple){
		 * se ejecuta este bloque de codigo
		 * }si no{
		 * ejecutar este otro bloque de codigo
		 * }
		 */
		int x = 15;
		//evaluar
		if (x<12) {
			System.out.println("verdadero: " + x);
		}else {
			System.out.println("falso: " + x);
		}
		
		//condiciones compuestas con operadores logicos, and, or, not, igualdad y diferente de 
		//and = && -> devuelve el primer bloque true cuando se cumplen las condiciones 
		System.out.println("Operador AND &&");
		
		if (x<=21 && x > 14) {
			System.out.println("verdadero: " + x);
		}else {
			System.out.println("falso: " + x);
		}
		
		// operador OR || -> duvelve true cuando se cumple almenos una condicion 

		System.out.println("Operador OR ||: ");
		
		if (x<=21 || x > 14) {
			System.out.println("verdadero: " + x);
		}else {
			System.out.println("falso: " + x);
		}
		
		//operador NOT ! -> niega una condicion o cambia su valor de true a false y viseversa
		System.out.println("operador NOT !");
		if (!(x>1)) {
			System.out.println("Verdadero: " + x);
		}else {
			System.out.println("falso: " + x);
		}
		
		//operador de igualdad == ->  compara un valor contra otro y revisa si son iguales 
		//este operador es mas recoemendado con valores numericos 
		System.out.println("Operador de igualdad ==");
		if (x==12) {
		System.out.println("cierto: " + x);	
		}else {
			System.out.println("falso: " + x);
		}
		
		// operador diferente de != -> compara un valor contra otro y si son diferentes manda true 
		
		System.out.println("Operador de diferente de !=");
		if (x!=12) {
		System.out.println("cierto: " + x);	
		}else {
			System.out.println("falso: " + x);
		}
		
		//estructura if else anidado 
		System.out.println("Estructura if else anidado");
		int d = 2;
		if (d == 1) {
			System.out.println("Lunes");
		}else if (d == 2) {
			System.out.println("Martes");
		}else if (d == 3) {
			System.out.println("Miercoles");
		}else if (d == 4) {
			System.out.println("Jueves");
		}else if (d == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error de dia");
		}
		
		// estructura switch case -> sirve para ejecutar bloques de codigo en funcion de vambio de valor de una variable
		System.out.println("caso de mes");
		switch (d) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		default:
			System.out.println("Error de mes");
			break;
		}
		
		
	}

}
