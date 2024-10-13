package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AGAH {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Programa para determinar si un numero es par o impar");
		System.out.println("Ingrese cualquier numero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0 ) {
			System.out.println("El numero " + numero + " si es par..");
		}else {
			System.out.println("El numero " + numero + " no es par..");
		}
		
		sc.close();
	}

}
