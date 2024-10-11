package com.ciclos;
import java.util.Scanner;
public class Ciclos6_JARG {

	public static void main(String[] args) {
//		Dibuja un cuadrado, como en la imagen que acompaña, introducir desde 
//		teclado el ancho y el alto.
		
		int tam;
		Scanner scan = new Scanner(System.in);
		System.out.println("Deme el tamaño del cuadro");
		tam = scan.nextInt();
		scan.close();
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
	}

}
