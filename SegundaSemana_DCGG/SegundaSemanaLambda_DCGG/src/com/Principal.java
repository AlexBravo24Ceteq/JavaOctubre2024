package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// expresiones Lambda conocidas como funciones anonimas
		// que implementan un método de una interface funcional
		// la sintaxis es la sig:
		// (parametros) -> (cuerpo de lambda)
		
//		IFuncional sumas = (a,b) -> System.out.println(a+b);
//		IFuncional restas = (a,b) -> System.out.println(a-b);
//		
//		sumas.operacion(18, 20);
//		restas.operacion(10, 5);
		
		IFuncional multiplica = ()->{
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el primer dato: ");
			int dato1 = sc.nextInt();
			System.out.println("Introduce el segundo dato: ");
			int dato2 = sc.nextInt();
			
			System.out.println("Resultado de la operación es: "+(dato1*dato2));
		};
		
		multiplica.operacion();

	}

}
