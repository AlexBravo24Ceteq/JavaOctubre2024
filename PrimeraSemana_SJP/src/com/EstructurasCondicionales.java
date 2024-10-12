package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras de decisi�n (condicionales) if- valores booleanos (verdaderos o Falsos)
		
		int x = 12; 
		
		if (x<=12) { //condici�n de la ejecuci�n de una acci�n dependiendo del valor de x
				
			System.out.println("Cierto"); //Si se cumple la condici�n se ejecuta el programa
			
			} else { // si no se cumple la condici�n entonces 
				System.out.println("Falso");	
			}
			
		//Condiciones compuestas con operadores l�gicos AND, OR, NOT, DIFERENTE DE, IGUALDAD
		//AND - && Nos devuelve un valor true cuando se cumplan todas las condiciones
		System.out.println("Operador AND &&:");
		
		if (x<=12 && x>14) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
	
		//OR - || - Nos devuelve un valor true cuando se cumple al menos una condici�n 
		System.out.println("Operador OR !!:");
		
		if (x<=21 || x>14) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
			
		//NOT ! Niega una condici�n/ Cambia el valor de True a False y viceversa
		System.out.println("Operador NOT !:");
		
		if (!(x>1)) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//IGUALDAD O COMPARACI�N (==) Revisa o compara el valor, si el valor es igual manda True
		// y si no es igual manda False. Solo para valores numericos
		
		System.out.println("Operador IGUALDAD ==:");
		
		if (x == 12) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		
		//DIFERENTE DE - != - Compara el valor y si es diferente manda True, si no, manda False.
		
		System.out.println("Operador DIFERENTE DE !=:");
		
		if (x != 12) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
					
			//ESTRUCTURA IF ELSE (concatenado o anidado)
			System.out.println("Estructura IF-ELSE ANIDADO:");
			int d = 2; //Variable entera
			
			if (d==1) { // Inicio una condici�n, comparando el valor contenido en d contra el que quiero comparar
				System.out.println("Lunes"); // si no se cumple alguna condici�n pasa a la siguiente
			} else if (d==2) {
				System.out.println("Martes");
			} else if(d==3) {
				System.out.println("Mi�rcoles");
			} else if (d==4) {
				System.out.println("Jueves");
			} else if (d==5) {
				System.out.println("Viernes");
			}else { // Si no cumple con ninguna de las anteriores
				System.out.println("Error de d�a"); 
			}
			
			
			//ESTRUCTURA DE DECISI�N SWITCH-CASE
			//Evalua o ejecuta bloques de codigo en funcion del cambio de valor de una variable
			//Puede ser con tipo de dato int, String, char, etc.
			System.out.println("Estructura SWITCH-CASE:");	
			
			switch (d) {//Indicamos que vamos a decidir 
			
			case 1: //en caso de que d�a valga 1 
				System.out.println("Enero");
				break; //Indica cierre del proceso 
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
			default: //En caso de que no se cumpla con ning�n valor
				System.out.println("Error de mes");
			}

	}

}
