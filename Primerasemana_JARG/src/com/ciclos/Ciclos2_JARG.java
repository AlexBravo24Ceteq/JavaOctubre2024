package com.ciclos;
import java.util.Scanner;
public class Ciclos2_JARG {

	public static void main(String[] args) {
//		Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		introducido desde teclado, hasta la iteración deseada por el usuario. 
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		int x;
		int y;
		int res;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero a multiplicar");
		x = scan.nextInt();
		System.out.println("Por cuanto lo vas a multiplicar");
		y = scan.nextInt();
		scan.close();
		System.out.println("Tabla de su numero: " +x+" hasta el: "+y );
		
		for (int i = 1; i <= y; i++) {
			res = x * i;
			System.out.println(res);
		}
	}

}
