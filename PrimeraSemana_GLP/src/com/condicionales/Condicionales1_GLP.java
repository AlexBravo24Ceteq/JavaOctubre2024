package com.condicionales;

import java.util.Scanner;

public class Condicionales1_GLP {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		int num1 = entrada.nextInt();
		System.out.println("Ingresa un numero");
		int num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("El numero mayor es: "+num1);
		}else {
			System.out.println("El numero mayor es: "+num2);
		}
		
		entrada.close();

	}

}