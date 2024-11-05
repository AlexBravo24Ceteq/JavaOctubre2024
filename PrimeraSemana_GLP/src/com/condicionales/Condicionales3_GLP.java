package com.condicionales;

import java.util.Scanner;

public class Condicionales3_GLP {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		int num1 = entrada.nextInt();
		System.out.println("Ingresa un numero");
		int num2 = entrada.nextInt();
		
		if(num1 == 0 || num2 == 0) {
			System.out.println("El valor de los numeros no puede ser 0");
		}else {
			System.out.println("El resultado de la division es: "+(num1/num2));
		}
		
		entrada.close();
	}

}
