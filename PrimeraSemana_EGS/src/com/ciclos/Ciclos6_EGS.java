package com.ciclos;
import java.util.Scanner;

public class Ciclos6_EGS {
	public static void main(String[] args) {
		/*
		 * Dibuja un cuadrado, como en la imagen que acompaña, introducir desde
		 * teclado el ancho y el alto.
		 */
		Scanner consola = new Scanner(System.in);
		System.out.println("*** Creador de Imagenes ***");
		System.out.printf("Introduce el ancho: ");
		int ancho = consola.nextInt();
		System.out.print("Introduce el alto: ");
		int alto = consola.nextInt();
		consola.close();
		int altoLinea = 0;
		int i = 0;
		boolean fin = false;
		while(!fin) {
			if(i<(ancho+ancho-1)) {
				if (i%2==0) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}else{
					System.out.print("\n");
					altoLinea++;
					i= -1;
				}	
			i++;
			if(altoLinea==alto)
				fin = true;
		}
	}
	

}
