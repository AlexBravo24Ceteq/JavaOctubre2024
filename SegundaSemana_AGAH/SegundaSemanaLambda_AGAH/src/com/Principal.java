package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Expresiones Lambda
		//Son conocidas como funciones anonimas que implementan 
		//un metodo de una interface funcional 
		//La sintaxis es la sig.
		
		//(parametro) -> (cuerpo de lambda)
		/*
		 * (Con los parametros de mi interface) -> (quiero hacer
		 * lo siguiente) 
		 */
		
		IFuncional calculadora = (a, b) -> System.out.println(a+b);
		//Se creo un objeto de una clase anonima ,es decir , 
		//una clase que no existe
		//Pero que me va a permitir implementar la interface

		//Ya que tengo declarado lo que voy hacer, solo llamo al 
		//metodo a traves de la calculadora
		
		calculadora.operacion(18, 20);
		
		//Ej. puedo crear otro objeto que implemente la misma interface
		//y metodo pero que ahora ejecute una resta
		
		IFuncional resta = (x, y) -> System.out.println(x-y);
		
		resta.operacion(10, 7);
		
		IFuncional multiplicacion = (c, d) -> {//cuando nuestra sintaxis
			//es mas larga utilizamos llaves {}
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce el primer numero a multiplicar");
			c = entrada.nextInt();
			System.out.println("Introduce el primer numero a multiplicar");
			d= entrada.nextInt();
			
			System.out.println("El resultado es : " + (c*d));
			
		};//se termina con llave y ; en el cierre de la expresion lambda
	multiplicacion.operacion(0, 0);
		
	}

}
