package com.condicionales;

import java.util.Scanner;

public class Condicionales8_FOD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introducir un numero del 1 al 7 pata identificar el dia de la semana");
		int dia = entrada.nextInt();
		
		String diaSemana = "";
		
		switch (dia) {
		case 1:
			diaSemana = "Lunes";
			break;
		case 2:
			diaSemana = "Martes";
			break;
		case 3:
			diaSemana = "Miercoles";
			break;
		case 4:
			diaSemana = "Jueves";
			break;
		case 5:
			diaSemana = "Viernes";
			break;
		case 6:
			diaSemana = "Sabado";
			break;
		case 7:
			diaSemana = "Domingo";
			break;
		default:
			System.out.println("ERROR: numero incorrecto.");
			entrada.close();
			return;
		}
		System.out.println("El dia de la semana correspondiente es: " + diaSemana);
		entrada.close();
		
	}

}
