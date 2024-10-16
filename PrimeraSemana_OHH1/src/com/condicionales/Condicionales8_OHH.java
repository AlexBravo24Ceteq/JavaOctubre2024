package com.condicionales;

import java.util.Scanner;

public class Condicionales8_OHH {

	public static void main(String[] args) {
		// 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		//correspondiente. Si introducimos otro número nos da un error.

		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Ingresa el día de la semana (del 1 al 7): ");
		
		int numero = entrada.nextInt();
		
		if (numero >=1 && numero <= 7) {
			switch (numero) {
			case 1:
				System.out.println("El día es: LUNES");
				break;
			case 2:
				System.out.println("El día es: MARTES");
				break;
			case 3:
				System.out.println("El día es: MIÉRCOLES");
				break;	
			case 4:
				System.out.println("El día es: JUEVES");
				break;	
			case 5:
				System.out.println("El día es: VIERNES");
				break;
			case 6:
				System.out.println("El día es: SÁBADO");
				break;
			case 7:
				System.out.println("El día es: DOMINGO");
				break;	
			}
		}
		else {
			System.out.println("El número debe ser de 1 - 7");
		}
	
	}
	
	}


