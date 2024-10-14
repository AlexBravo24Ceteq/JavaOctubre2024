package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras condicionales o de decisión if
		//Evaluán valores booleanos
		
		/*
		 * si (esto se cumple){
		 * se ejecuta este bloque de código
		 * } si no {
		 *       ejecuta este otro bloque
		 * }
		 */
		
		int x = 12;
		
		//Evaluamos 
		
		if (x<=12) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
	
		//Condiciones compuestas con operadores lógicos 
		//AND, OR, NOT, IGUALDAD y DIFERENTE DE
		
		//AND && - devuelve el primer bloque (true) cuando se cumplan las condiciones
		//TODAS las condiciones
		System.out.println("Operador AND &&");
		
		if (x<=21 && x>14) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//OR || - devuelve true cuando se cumpla al menos una condición
		
		System.out.println("Operador OR ||");
		
		if (x<=21 || x>14) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//NOT - ! - Niega una condición o cambia su valor de true a false y viceversa
		
		System.out.println("Operador NOT !");
		
		if (!(x>1)) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//IGUALDAD - == - compara un valor contra otro y revisa si son iguales
		//Este operador es más recomendado sólo para valores numéricos
		
		System.out.println("Operador de IGUALDAD ==");
		
		if (x==12) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
	
		//DIFERENTE DE - != - Compara un valor contra otro y si son diferentes manda true
		
		System.out.println("Operador DIFERENTE DE !=");
		
		if (x!=12) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//Estructura IF ELSE ANIDADO
		
			System.out.println("Estructura IF ELSE ANIDADO");				
		int d = 2;
		
		if (d==1) {
			System.out.println("Lunes");			
		}
		else if (d==2) {
			System.out.println("Martes");
		}
		else if (d==3) {
			System.out.println("Miércoles");
		}
		else if (d==4) {
			System.out.println("Jueves");
		}
		else if (d==5) {
			System.out.println("Viernes");
		}
		else {
			System.out.println("Error de día");
		}
		
		//Switch Case - sirve para evaluar o ejecutar bloques de código 
		//en función del cambio de valor de una variable
		
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
		
		case 5:
			System.out.println("Mayo");
			break;
				
		default:
			System.out.println("Error de mes");
			break;
		}
		
		}
		}


