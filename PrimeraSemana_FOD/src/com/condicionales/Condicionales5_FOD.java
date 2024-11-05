package com.condicionales;

import java.util.Scanner;

public class Condicionales5_FOD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la edad: ");
		int edad = entrada.nextInt();
		
		System.out.println("Introduce la nota: ");
		int nota = entrada.nextInt();
		
		System.out.println("Introduce el sexo (M/F): ");
		char sexo = entrada.next().toUpperCase().charAt(0);
		
		if (nota == 5 && edad == 18) {
			if (sexo == 'M') {
				System.out.println("Resultado: Posible");
		}else if (sexo == 'F') {
			System.out.println("Resultado: Aceptada");
		}else {
			System.out.println("Sexo no valido deve ser F o M");
		}
		
		}else {
			System.out.println("Resultado no aceptado");
		}
		
		entrada.close();
	}
		
}
