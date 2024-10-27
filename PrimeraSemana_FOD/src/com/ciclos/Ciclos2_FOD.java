package com.ciclos;

import java.util.Scanner;

public class Ciclos2_FOD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el numero que dara inicio a la tabla de multipliar: ");
		int num = entrada.nextInt();
		
		System.out.println("¿Hasta que numero desea multiplicar? ");
		int lim = entrada.nextInt();
		
		System.out.println("******Resultado de la operacion solicitada******");
		for (int i = 1; i <= lim; i++) { 
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		entrada.close();
	}

}
