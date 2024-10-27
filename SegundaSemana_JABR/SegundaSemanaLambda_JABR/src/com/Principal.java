package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda
		//Son conocidas como funciones anónimas
		//Que implementan un método de una interface funcional
		//La sintaxis es la sig:
		
		//(parametros) -> (cuerpo de lambda)
		/*
		 * (con los parametros de mi interface) -> (quiero hacer los siguiente)
		 */
		
		IFuncional calculadora = (a, b) -> System.out.println(a+b);
		
		//Ya que tengo declarado lo que voy a hacer, solo llamo al método
		//a través del objeto calculadora
		calculadora.operacion(18, 20);
		
		//Ej. puedo crear otro objeto que implementa la misma interface y metodo
		//pero que ahora ejecute una resta
		IFuncional resta = (x,y) -> System.out.println(x-y);
		
		resta.operacion(10, 7);
		
		IFuncional multiplica = (c, d) -> { //cuando nuestra sintaxis es más larga
			//utilizamos llaves
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce el primer numero a multiplicar");
			c = entrada.nextInt();
			System.out.println("Introduce el segundo numero a multiplicar");
			d = entrada.nextInt();
			
			System.out.println("El resultado de la operacion es: " + (c*d));
		}; //se termina con llave y ; el cierre de la expresion lambda
		
		multiplica.operacion(0, 0);
		

	}

}
