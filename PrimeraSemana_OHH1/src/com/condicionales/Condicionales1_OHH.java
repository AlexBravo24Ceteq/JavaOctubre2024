package com.condicionales;

import java.util.Scanner;

public class Condicionales1_OHH {

	public static void main(String[] args) {
		//1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es
		//mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in); 

        int numero1, numero2;              

        System.out.println("Introduzca un n�mero: "); 
        numero1 = entrada.nextInt(); 

        System.out.println("Introduzca otro n�mero: "); 
        numero2 = entrada.nextInt(); 

        if (numero1 > numero2) {
        	System.out.println("El n�mero "+numero1+ " es mayor que el n�mero "+numero2);
        }
        else if (numero1 < numero2) {
        	System.out.println("El n�mero "+numero1+ " es menor que el n�mero "+numero2);
        }
        else  {
        	System.out.println("Los dos n�meros son iguales");
        }
        		
		}
	}
