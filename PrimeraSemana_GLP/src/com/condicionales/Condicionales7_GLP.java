package com.condicionales;

import java.util.Scanner;

public class Condicionales7_GLP {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el numero del dado");
		int numeroDado = entrada.nextInt();
		
		switch (numeroDado){
		case 1 :
			System.out.println("Seis");
			break;
		case 2 :
			System.out.println("Cinco");
			break;
		case 3 :
			System.out.println("Cuatro");
			break;
		case 4 :
			System.out.println("Tres");
			break;
		case 5 :
			System.out.println("Dos");
			break;
		case 6 :
			System.out.println("Uno");
			break;
		default :
			System.out.println("Error no existe el numero "+ numeroDado +" en un dado");
			break;
		}

	}

}
