package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Expresiones Lambda
		//Son conocidas como funciones anónimas que implementan el método de 
		//una interface funcional
		//La sintaxis es la siguiente;
		
		//(parametros) -> (cuerpo de lambda)
		//(con los parametros de mi interface) -> (quiero hacer lo siguiente)
		
		IFuncional calculadora = (a,b) -> System.out.println(a+b);
		
		//Ya que tengo declarado lo que voy a hacer, solo llamo al método
		//atravez del objeto declarado calculadora
		
		calculadora.operacion(18, 20);

		//ej puedo crear otro objeto que implementa la misma interface y método
		//pero ahora que ejecute una resta
		IFuncional resta = (x,y) -> System.out.println(x-y);

		resta.operacion(10, 5);
		
		IFuncional multiplica = (c,d) -> { //cuando nuestra sintaxis es máslarga
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce el primero numero");
			c=entrada.nextInt();
			System.out.println("Introduce el primero numero");
			d=entrada.nextInt();
			System.out.println("multiplicacion "+ (c*d));
			};//se termina con llave y ; el cierre de la expresion lambda
			
			multiplica.operacion(0, 0);
			
	}//end

}
