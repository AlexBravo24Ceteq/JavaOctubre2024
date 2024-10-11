package com.ciclos;

import java.util.Scanner;

public class Ciclos6_FOD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el ancho del cuadrado: ");
		int ancho = entrada.nextInt();
		
		System.out.println("Introduce el alto del cuadrado: ");
		int alto = entrada.nextInt();
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("X  ");
			}
			System.out.println();
		}
		
		entrada.close();
	}

}
