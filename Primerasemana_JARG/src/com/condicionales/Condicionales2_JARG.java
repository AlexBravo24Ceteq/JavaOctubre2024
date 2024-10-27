package com.condicionales;

import java.util.Scanner;
public class Condicionales2_JARG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realiza un programa que pida un número por teclado y nos indique si es par 
		 *o impar
		 */
		int x;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deme un numero");
		x = entrada.nextInt();
		entrada.close();
		
		if (x % 2==0) {
			System.out.println("Es par");
			
		}else {
			System.out.println("Es impar");
			
		}
		

	}

}
