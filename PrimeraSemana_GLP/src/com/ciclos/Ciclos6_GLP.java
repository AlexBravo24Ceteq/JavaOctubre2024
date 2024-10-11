package com.ciclos;

import java.util.Scanner;

public class Ciclos6_GLP {

	public static void main(String[] args) {
		/*
		 * 6. Dibuja un cuadrado, como en la imagen que acompaña, introducir desde 
			teclado el ancho y el alto. Ejemplo: 8 x 8
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el ancho");
		int ancho = entrada.nextInt();
		
		System.out.println("Ingresa el alto");
		int alto = entrada.nextInt();
		
		String asteriscosAncho = "";
		
		for (int i = 1; i <= alto; i++) {
			asteriscosAncho = "";
			for (int j = 1; j <= ancho; j++) {
				asteriscosAncho = asteriscosAncho.concat("* ");
			}
			System.out.println(asteriscosAncho);
		}
		
		entrada.close();
	}

}
