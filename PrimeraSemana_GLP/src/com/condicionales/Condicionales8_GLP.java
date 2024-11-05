package com.condicionales;

import java.util.Scanner;

public class Condicionales8_GLP {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el dia de la semana en numero");
		int numeroDia = entrada.nextInt();
		
		switch (numeroDia){
		case 1 :
			System.out.println("Domingo");
			break;
		case 2 :
			System.out.println("Lunes");
			break;
		case 3 :
			System.out.println("Martes");
			break;
		case 4 :
			System.out.println("Miercoles");
			break;
		case 5 :
			System.out.println("Jueves");
			break;
		case 6 :
			System.out.println("Viernes");
			break;
		case 7 :
			System.out.println("Sabado");
			break;
		default :
			System.out.println("Error no existe el numero "+ numeroDia +" de la semana");
			break;
		}

	}

}
