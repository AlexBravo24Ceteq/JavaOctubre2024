package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
//		expresiones lambda(funciones anonimas)
//		implementados por una interface funcional
		
//		se crea un objeto de la clase anonima(no exist)
//		sirve para implementar la interface
		
		IFuncional calculadora = (a, b) -> System.out.println(a+b);
		calculadora.operacion(18, 20);
		
		IFuncional resta = (x, y) -> System.out.println(x - y);
		resta.operacion(10, 7);
		
//		con llaves
		IFuncional multiplica = (c, d) -> {
			Scanner entradaDatos = new Scanner(System.in);
			System.out.println("Ingresa el primer número");
			c =  entradaDatos.nextInt();
			System.out.println("Ingresa el segundo número");
			d = entradaDatos.nextInt();
			
			System.out.println("La multiplicación es " + (c * d));
			entradaDatos.close();
		};
//		se inicia en 0 para que el usuario introduzca los valores
		multiplica.operacion(0, 0);
	}
}
