package com.ciclos;

import java.util.Scanner;

public class Ciclos6DCGG {

	public static void main(String[] args) {
//		6. Dibuja un cuadrado como en la imagen adjunta, 
//		introducir desde teclado el ancho y el alto. 
//		Ejemplo: 8X8
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que dibuja un cuadrado dependiendo de la altura y ancho dada por el usuario ");
		System.out.println("Introduce el valor numérico de la altura: ");
		int altura = entrada.nextInt();
		System.out.println("Introduce el valor numérico del ancho: ");
		int ancho =  entrada.nextInt();
		
		for(int al = 0; al < altura; al++) {
			for(int an = 0; an < ancho; an ++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		entrada.close();

	}

}
