package com.condicionales;

import java.util.Scanner;

public class Condicionales3_FOD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		double num2 = entrada.nextDouble();
		
		if (num2 == 0) {
			System.out.println("Error: no se puede dividir entre 0.");
		}else {
			double resultado = num1 / num2;
			System.out.printf("Total= %.2f%n", resultado);
		}
		
		entrada.close();
	}

}
