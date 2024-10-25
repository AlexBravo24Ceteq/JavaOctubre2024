package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda
		//Conocidas como funciones anonimas
		//que implementan un metodo de una interface funcional
		//La sintaxis es la sig:
		
		//(parametros) -> (cuerpo de lambda)
		
		/*(con los parametros de mi interface) -> (quiero hacer lo siguiente)
		 * 
		 */
		
		IFuncional calculadora = (a, b) -> System.out.println(a+b);
		//se esta creando un objeto de una clase anonima, es decir, una clase que no existe
		   
	    //pero que me va a permitir implementar la interface
		
		
		//Ya que tengo declarado lo que voy a hacer, solo llamo al metodo 
		//a traves del objeto calculadora
		
		calculadora.operacion(18, 20);
		
		//Ej. puedo crear otro objeto que implemente la misma interface y metodo
		//pero que ahora ejecute una resta
		IFuncional resta = (x,y) -> System.out.println(x-y);
		
		
		resta.operacion(10, 7);
		
		IFuncional multiplica = (c, d) -> { //cuando nuestra sintaxis es mas larga utilizamos llaves
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce el primer numero a multiplicar");c = entrada.nextInt();
			System.out.println("Introduce el segundo numero a multiplicar");
			d = entrada.nextInt();
			entrada.close();
			
			
			System.out.println("El resultado de la operacion es: " + (c*d));
		}; //se termina con llave y ; el cierre de la expresion lambda
		
		multiplica.operacion(0, 0);
		} 
	
		
		
		
	}


