package com.condicionales;

import java.util.Scanner;

public class Condicionales1_FOD {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce el sugundo numero");
		int num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println("El primer numero es mayor que: " + num2);
		}else if (num1 < num2) {
			System.out.println("El segundo numero es mayor que: " + num1);
		}else {
			System.out.println("Ambos numeros son iguales: " + num1 + " = " + num2);
		}
		
		entrada.close();

	}

}
