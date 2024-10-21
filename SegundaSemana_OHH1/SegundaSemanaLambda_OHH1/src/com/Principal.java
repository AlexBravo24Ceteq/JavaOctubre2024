package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Expresiones Lambda
		// Son conocidas como funciones an�nimas
		// Que implementan un m�todo de una interface funcional
		// La sintaxis es la sig:
		
		// (parametros) -> (cuerpo de lambda)
		
		// Persona juan = new persona();
		// juan.
		
		IFuncional calculadora = (a, b) -> System.out.println(a+b); // se crea un objeto "calculadora" de una clase an�nima
																	// (que no existe), pero que va a permitir implementar 
																	// la interface
		
		// Ya tengo declarado lo que voy a hacer, solo llamo al m�todo
		// a trav�s del objeto calculadora
		calculadora.operacion(18, 20);
		
		// Ej. puedo crear otro objeto que implementa la misma interface y m�todo
		// pero que ahora ejecute una resta

		IFuncional resta = (x,y) -> System.out.println(x-y);
		
		resta.operacion(10, 7);
		
		IFuncional multiplica = (c, d) -> { // Cuando nuestra sint�xis es m�s larga
			// utilizamos llaves
			Scanner entrada = new Scanner(System.in);
			System.out.print("Introduce el primer n�mero a multiplicar");
			c = entrada.nextInt();
			System.out.print("Introduce el segundo n�mero a multiplicar");
			d = entrada.nextInt();
			
			System.out.println("El resultado de la operaci�n es: " + (c*d));
			
		};  // Se termina con llave y ";" el cierre de la expresi�n lambda
		
		multiplica.operacion(0, 0);
		
		
			
		
		
				

		
		
		
		

	}

}
