package com.condicionales;

import java.util.Scanner;

public class Condicionales8_OHH {

	public static void main(String[] args) {
		// 8.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a
		//correspondiente. Si introducimos otro n�mero nos da un error.

		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Ingresa el d�a de la semana (del 1 al 7): ");
		
		int numero = entrada.nextInt();
		
		if (numero >=1 && numero <= 7) {
			switch (numero) {
			case 1:
				System.out.println("El d�a es: LUNES");
				break;
			case 2:
				System.out.println("El d�a es: MARTES");
				break;
			case 3:
				System.out.println("El d�a es: MI�RCOLES");
				break;	
			case 4:
				System.out.println("El d�a es: JUEVES");
				break;	
			case 5:
				System.out.println("El d�a es: VIERNES");
				break;
			case 6:
				System.out.println("El d�a es: S�BADO");
				break;
			case 7:
				System.out.println("El d�a es: DOMINGO");
				break;	
			}
		}
		else {
			System.out.println("El n�mero debe ser de 1 - 7");
		}
	
	}
	
	}


