package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JARG {

	public static void main(String[] args) {
		/*
		 * .Realiza un programa que reciba dos números por teclado e indique cuál es 
		 *mayor o si son iguales.
		 */
		int x,y;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deme su primer numero");
		x = entrada.nextInt();
		System.out.println("Deme su segundo numero");
		y = entrada.nextInt();
		entrada.close();
		
		if (x>=y) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		

	}

}
