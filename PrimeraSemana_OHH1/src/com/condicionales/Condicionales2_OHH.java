package com.condicionales;

import java.util.Scanner;

public class Condicionales2_OHH {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par
		//o impar.

		Scanner entrada = new Scanner(System.in); 

        int numero, par, impar;              

        System.out.println("Introduzca un número: "); 
        numero = entrada.nextInt(); 
        

        if (numero %2 ==0) {
        	System.out.println("El número "+numero+ " es número par");
        }
        else  {
        	System.out.println("El número "+numero+" es número impar");
        }

	}

}
