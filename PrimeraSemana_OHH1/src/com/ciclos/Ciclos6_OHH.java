package com.ciclos;

import java.util.Scanner;

public class Ciclos6_OHH {

	public static void main(String[] args) {
		// 6. Dibuja un cuadrado, como en la imagen que acompaña, introducir desde
		//teclado el ancho y el alto. Ejemplo: 8 x 8

		Scanner entrada = new Scanner (System.in);
		
						
		System.out.println("Ingresa el lado del cuadrado: ");
				int lado = entrada.nextInt();
		
				
		for (int i=1; i<=lado; i++) {
			System.out.print("*");
			for (int l=1; l<lado; l++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

}
