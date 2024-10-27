package com.condicionales;

import java.util.Scanner;

public class Condicionales8_OHH {

	public static void main(String[] args) {
//		8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
//		correspondiente. Si introducimos otro número nos da un error.
		
		int dia;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa un número del 1 al 7: ");
		dia = entradaDatos.nextInt();
		entradaDatos.close();

		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Número no valido.");
			break;
		}
	}

}
