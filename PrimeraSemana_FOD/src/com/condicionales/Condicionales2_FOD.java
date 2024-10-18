package com.condicionales;

import java.util.Scanner;

public class Condicionales2_FOD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = entrada.nextInt();
		
		if (numero == 0) {
			System.out.println("El numero ingrersado no puede ser 0, es un caso especial");
		}else if (numero % 2==0) {
			System.out.println("El numero: " + numero + " es par.");
		}else {
			System.out.println("El numero: " + numero + " es impar.");
		}
		
		entrada.close();
	}

}
