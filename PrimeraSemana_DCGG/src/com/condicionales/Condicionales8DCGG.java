package com.condicionales;

import java.util.Scanner;

public class Condicionales8DCGG {

	public static void main(String[] args) {
		// 8.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a
		// correspondiente. Si introducimos otro n�mero nos da un error.
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que pide el numero del d�a de la semana y escribe el d�a");
		System.out.println("Suponiendo que los dias de la semana van de la siguiente manera: ");
		System.out.println("1 -> Lunes");
		System.out.println("2 -> Martes");
		System.out.println("3 -> Miercoles");
		System.out.println("4 -> Jueves");
		System.out.println("5 -> Viernes");
		System.out.println("6 -> S�bado");
		System.out.println("7 -> Domingo");
		System.out.println("Elige un n�mero de d�a de la semana: ");
		int dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Error: d�a de la semana no v�lido");
			break;
		}
		
		entrada.close();
	}

}
