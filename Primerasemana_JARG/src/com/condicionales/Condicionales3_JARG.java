package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JARG {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario dos números y muestre el resultado 
		 *de su división. Si el segundo número es 0, debe mostrar un mensaje de error
		 */
		
		Double x,y;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deme su primer numero");
		x = entrada.nextDouble();
		System.out.println("Deme su segundo numero");
		y = entrada.nextDouble();
		entrada.close();
		
		if (y==0) {
			System.out.println("No se puede dividir entre 0");
		}else {
			System.out.println("El resultado es: " + (x/y));
		}

	}

}
