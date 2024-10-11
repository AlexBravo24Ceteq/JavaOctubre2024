package com.ciclos;

import java.util.Scanner;

public class Ciclos6_OHH {

	public static void main(String[] args) {		
//		6. Dibuja un cuadrado, como en la imagen que acompaña, introducir desde
//		teclado el ancho y el alto. Ejemplo: 8 x 8
		
		int ancho = 0, alto = 0;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa el ancho del cuadrado: ");
		ancho = entradaDatos.nextInt();
		System.out.println("Ingresa el alto del cuadrado");
		alto = entradaDatos.nextInt();
		entradaDatos.close();
		System.out.println();
		
		for(int i = 0; i < alto; i++) {
			for(int j=0; j<ancho; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
