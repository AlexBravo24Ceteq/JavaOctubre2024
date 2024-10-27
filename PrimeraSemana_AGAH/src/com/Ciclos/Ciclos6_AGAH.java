package com.Ciclos;

import java.util.Scanner;

public class Ciclos6_AGAH {

	public static void main(String[] args) {
		/*
		 * 6. Dibuja un cuadrado, como en la imagen que acompaña, introducir desde 
teclado el ancho y el alto. Ejemplo: 8 x 8
		 */
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Ingrese lo alto del cuadrado a crear con *: ");
		int al = sc.nextInt();
		System.out.println("Ingrese lo ancho del cuadrado a crear con *: ");
		int an = sc.nextInt();
		
		for(int i=1; i<=al; i++) {
			for(int j=1; j<=an; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		
		
	}

}
