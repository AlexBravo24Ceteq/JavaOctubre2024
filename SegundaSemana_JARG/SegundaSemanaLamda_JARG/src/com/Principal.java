package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lamda
		//Conocidas como funciones anonimas
		//Que implementan un metodo de una interface funcional
		//La sintaxsis es la sig:
		
		//(parametros) -> (cuerpo de lamda)
		//(con los parametros de mi interdace) -> (quiero hacer lo siguiente)
		
		IFuncional calculadora = (a,b) -> System.out.println(a+b);
		
		//Ya que tengo declarado loq eu voy a hacer, solo llamo al metodo
		//a traves del objeto calculadora
		
		calculadora.operacion(10, 20);
		
		//Ej. Puedo crar otro objeto que implemente la misma interface y metodo
		//pero ahora ejecute una resta
		
		IFuncional resta = (x,y) -> System.out.println(x-y);
		
		resta.operacion(10, 7);
		
		IFuncional multiplicacion = (c,d)->{//cuando nuestra sintaxsis es mas larga
			//utilizamos llaves
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduce el primer numero a multiplicar");
			c = scan.nextInt();
			System.out.println("Introduce el segundo numero a multiplicar");
			d = scan.nextInt();
			
			System.out.println("El resultado de la operacion es: "+(c*d));
			
		};//Se termina con llave y ; el cierre d ela expresion lamda
		
		multiplicacion.operacion(0, 0);
		
		
	}

}
