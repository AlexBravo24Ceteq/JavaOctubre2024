package com.condicionales;

import java.util.Scanner;

public class Condicionales7_FOD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdusca el numero obtenido al lanzar el dado del 1 al 6 ");
		int numero = entrada.nextInt();
		
		String resultadoEscrito = "";
		
		switch (numero) {
		case 1:
			resultadoEscrito = "seis";
			break;
		case 2:
			resultadoEscrito = "cinco";
			break;
		case 3:
			resultadoEscrito = "cuatro";
			break;
		case 4:
			resultadoEscrito = "tres";
			break;
		case 5:
			resultadoEscrito = "dos";
			break;
		case 6:
			resultadoEscrito = "uno";
			break;
		default:
			System.out.println("ERROR: numero incorrecto");
			entrada.close();
			return;
		
		}
		System.out.println("La cara opuesta es: " + resultadoEscrito);
		entrada.close();
	}

}
