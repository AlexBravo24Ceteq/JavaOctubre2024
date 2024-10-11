package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras condicionales o de decision if
		// Evaluan valores booleanos
		
		/*
		 * si (esto se cumple){
		 * 		se ejecuta este bloque de codigo
		 * } si no{
		 * 		ejecuta este otro bloque
		 * }
		 */
		
		int x = 12;
		
		//Evaluamos
		
		if(x < 12) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//Condiciones compuestas con operadores lógicos
		//AND, OR, NOT, IGUALDAD Y DIFERENTE DE
		
		//AND -> && -> Devuelve el bloque (true) cuando se cumplan 
		//TODAS las condiciones
		System.out.println("Operador AND &&:");
		
		if(x <= 21 && x > 14) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		// OR -> || -> Devuelve true cuando se cumpla alguna condicion
		
		System.out.println("Operador OR ||:");
		
		if(x <= 21 || x > 14) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//NOT -> ! -> Niega una condicion o cambia su valor de true a false
		// y viceversa
		System.out.println("Operador NOT !:");
		
		if(!(x > 1)) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//IGUALDAD -> == -> Compara un valor contra otro y revisa Si son iguales
		//Este operador es mas recomendado solo para valores numéricos
		
		System.out.println("Operador de IGUALDAD ==:");
		
		if(x == 12) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		/*
		 * DIFERENTE DE -> != -> Compara un valor contra otro y si son
		 * diferentes manda "true"
		 */
		System.out.println("Operador de Diferente de !=:");
		
		if(x != 12) {
			System.out.println("Cierto");
		}
		else {
			System.out.println("Falso");
		}
		
		//ESTRUCTURA IF ELSE ANIDADO
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
			System.out.println("Error de día");
		}
		
		//Switch Case -> sirve para evaluar o ejecutar bloqyes de codigo
		//en funcion del cambio de una variable
		
		switch (d) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Enero");
			break;
		case 3:
			System.out.println("Enero");
			break;
		case 4:
			System.out.println("Enero");
			break;
		default:
			System.out.println("Enero");
			break;
			
		}
		

	}

}
