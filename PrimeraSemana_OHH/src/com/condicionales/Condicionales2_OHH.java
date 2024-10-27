package com.condicionales;

import java.util.Scanner;

public class Condicionales2_OHH {

	public static void main(String[] args) {
//		2.Realiza un programa que pida un número por teclado y nos indique si es par
//		o impar.
		
		int numero, residuo;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa un número para saber si es para o impar: ");
		numero =  entradaDatos.nextInt();
		residuo = numero % 2;
		entradaDatos.close();
		
		if(residuo == 0) {
			System.out.println("El número ingresado es par");
		}else {
			System.out.println("El número ingresado es impar");
		}
	}

}
