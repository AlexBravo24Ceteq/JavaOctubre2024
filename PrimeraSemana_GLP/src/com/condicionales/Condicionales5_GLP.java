package com.condicionales;

import java.util.Scanner;

public class Condicionales5_GLP {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el valor de la nota");
		int nota = entrada.nextInt();
		
		System.out.println("Ingresa tu edad");
		int edad = entrada.nextInt();
		
		System.out.println("Ingresa tu sexo");
		String sexo = entrada.next();
		
		if(nota >= 5 && edad == 18 && sexo.equalsIgnoreCase("M") ) {
			System.out.println("POSIBLE");
		}else if(nota >= 5 && edad == 18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
		
		entrada.close();
	}

}
