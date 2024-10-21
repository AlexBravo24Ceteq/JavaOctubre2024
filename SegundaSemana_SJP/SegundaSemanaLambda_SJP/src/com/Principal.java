package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda
		//Son conocidas como funciones anonimas
		//Implementan un metodo de una interface funcional 
		//sintaxis:
		
		//(parametros) -> (cuerpo de lambda)
		
		IFuncional calculadora = (a, b) -> System.out.println(a+b);
		//Interface objeto <-----------Se crea un objeto de una clase anonima, una clase que no existe
										//pero que me va a permitir implementar la interface
		
		//Declarado lo necesario, llamo al metodo a través del objeto 
		calculadora.operacion(18, 20);
		
		//Ej. Crear otro ibjeto que implemente la interface y metodo
		IFuncional resta = (x,y) -> System.out.println(x-y);
		
		resta.operacion(10, 7);
		
		IFuncional multiplica = (c, d) -> {
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce el primer numero:");
			c = entrada.nextInt();
			System.out.println("Introduce el segundo numero:");
			d = entrada.nextInt();
			System.out.println("El resultado de la multiplicacion es: " + (c*d));
		}; //termina con } y ; el cierre de la expresion
		multiplica.operacion(0, 0);
	}

}
