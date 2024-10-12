package com.ciclos;

import java.util.Scanner;

public class Ciclos2_SJP {
	
	public static void main(String[] args) {
		//EJERCICO 2:
		//Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int n1 = entrada.nextInt();
		System.out.println("Introduce hasta que número desea multiplicar: ");
		int n3 = entrada.nextInt();
		
		System.out.println("TABLA DE MULTIPLICAR DEL " + n1);
		for(int n2=1; n2<=n3; n2++) {
			System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
		}
	}

}
