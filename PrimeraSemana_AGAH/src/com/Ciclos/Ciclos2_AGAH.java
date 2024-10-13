package com.Ciclos;

import java.util.Scanner;

public class Ciclos2_AGAH {

	public static void main(String[] args) {
		/*2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
introducido desde teclado, hasta la iteración deseada por el usuario. 
Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???*/
		
		System.out.println("tablas de multiplicar de (x numero * n veces)");

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Teclea el numero que desea obtener su multiplicacion:");
		int num = sc.nextInt();
		System.out.println("Teclea hasta que numero desea multiplicar:");
		int veces= sc.nextInt();
		
		for (int i = 1; i <=1; i++) {
			System.out.println("El resultado es:");
			for(int j = 1; j <= veces; j++) {
				System.out.println(num + "x" + j + "=" + num*j);
			}
			
		}
	}

}
