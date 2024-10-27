package com.condicionales;

import java.util.Scanner;

public class Condicionales1_OHH {

	public static void main(String[] args) {
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in); 

        int numero1, numero2;              

        System.out.println("Introduzca un número: "); 
        numero1 = entrada.nextInt(); 

        System.out.println("Introduzca otro número: "); 
        numero2 = entrada.nextInt(); 

        if (numero1 > numero2) {
        	System.out.println("El número "+numero1+ " es mayor que el número "+numero2);
        }
        else if (numero1 < numero2) {
        	System.out.println("El número "+numero1+ " es menor que el número "+numero2);
        }
        else  {
        	System.out.println("Los dos números son iguales");
        }
        		
		}
	}
