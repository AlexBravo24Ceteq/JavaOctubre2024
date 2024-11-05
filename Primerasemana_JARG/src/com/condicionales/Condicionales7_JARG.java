package com.condicionales;

import java.util.Scanner;

public class Condicionales7_JARG {

	public static void main(String[] args) {
		/*Condicionales problema 7*/
		
		int n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que numero le salio en su dado?:");
		n = entrada.nextInt();
		entrada.close();
		switch (n){
		case 1:
			System.out.println("SEIS");
			break;
		case 2:
			System.out.println("CINCO");
			break;
		case 3:
			System.out.println("CUATRO");
			break;
		case 4:
			System.out.println("TRES");
			break;
		case 5:
			System.out.println("DOS");
			break;
		case 6:
			System.out.println("UNO");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
			break;
	}
		
	}

}
