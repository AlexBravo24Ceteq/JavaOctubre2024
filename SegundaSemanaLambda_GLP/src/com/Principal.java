package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda
		//Son conocidas como funciones anonimas
		//Que implementan un metodo de una interface funcional
		//La sintaxis es la sig:
		
		//(parametros) -> (cuerpo de lambda)
		//despues del igual = (parametros). que queremos que haga ->, lo que va hacer(en este caso imprimir)
		//Se esta creando un objeto de una clase anonima, es decir, no existe
		//pero que me va permitir implementar la interface
		IFuncional calculadora = (a,b) -> System.out.println(a+b);
		
		//Ya que tengo declarado lo que voy hacer, solo llamo al metodo
		//a traves del objeto calculadora
		
		calculadora.operacion(18,20);
		
		//Ej. puedo crear otro objeto que implementa la misma interface y metodo
		//pero que ahora ejecute una resta
		IFuncional resta = (x,y) -> System.out.println(x-y);
		
		resta.operacion(10, 7);
		
		IFuncional multiplica = (c,d) -> {//cuando nuestra sintaxisi es mas larga
			//utilizamos llaves
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el primer numero a multiplicar");
			c = entrada.nextInt();
			System.out.println("Introduce el segundo numero a multiuplicar");
			d = entrada.nextInt();
			
			System.out.println("El resultado de la iperacion es: "+(c*d));
		};//se termina con llave y ; el cierre de la expresion lambda
		
		multiplica.operacion(0, 0);
	}

}
