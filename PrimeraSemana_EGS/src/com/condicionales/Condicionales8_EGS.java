package com.condicionales;

import java.util.Scanner;

public class Condicionales8_EGS {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		 * correspondiente. Si introducimos otro número nos da un error.
		 */
		Scanner consola = new Scanner(System.in);
		System.out.println("***Dias De La Semana***");
		System.out.println("Ingresa un numnero de dia 1-Lunes/7-Domingo:");
		int numeroDia = consola.nextInt();
		consola.close();
		
		switch (numeroDia) { 
		case 1:
			System.out.println("Lunes"); 
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles"); 
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes"); 
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo"); 
			break;
		default:
			System.out.println("ERROR. El dia no existe");
			break;
		}

	}

}
