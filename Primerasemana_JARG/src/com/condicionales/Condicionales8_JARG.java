package com.condicionales;

import java.util.Scanner;

public class Condicionales8_JARG {

	public static void main(String[] args) {
		/*Condicionales 8 dias de la semana*/
		int n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que dias es? 1 al 7 para dia correspondiente:");
		n = entrada.nextInt();
		entrada.close();
		switch (n){
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIERCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
			break;
	}

	}

}
