package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// expreciones lambda conocidad como exptreciones anonimas 
		//que implementa una interface de un metodo funcional 
		//la sintaxis es ls siguiente
		
		//(parametros)-> (cuerpo de lambda)
		//con los parametros de mi interface) -> quiero hacer lo siguiente
		IFuncional calculadora = (a, b) -> System.out.println(a+b);
		//ya que tengo declarado lo que voy a hacer lo llamo al metodo con el objeto calculadora
		calculadora.operacion(18, 20);
		
		//ejemplo puedo crear otro objeto que implemente la misma interface y metodo 
		//pero que ahora inmplemente una resta
		
		IFuncional resta = (x, y) -> System.out.println(x-y);
		resta.operacion(50, 20);
		
		IFuncional multiplica = (c, d) ->{
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce el primer numero a multiplicar: ");
		c = ent.nextInt();
		System.out.println("Introduce el segundo numero a multiplicar");
		d = ent.nextInt();
		System.out.println("El resultado de la operacion es: " + (c*d));
		
		};
		multiplica.operacion(0, 0);
		
	}

}
