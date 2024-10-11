package com.condicionales;

import java.util.Scanner;

public class Condicionales8DCGG {

	public static void main(String[] args) {
		// 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		// correspondiente. Si introducimos otro número nos da un error.
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que pide el numero del día de la semana y escribe el día");
		System.out.println("Suponiendo que los dias de la semana van de la siguiente manera: ");
		System.out.println("1 -> Lunes");
		System.out.println("2 -> Martes");
		System.out.println("3 -> Miercoles");
		System.out.println("4 -> Jueves");
		System.out.println("5 -> Viernes");
		System.out.println("6 -> Sábado");
		System.out.println("7 -> Domingo");
		System.out.println("Elige un número de día de la semana: ");
		int dia = entrada.nextInt();
		
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
			System.out.println("Error: día de la semana no válido");
			break;
		}
		
		entrada.close();
	}

}
