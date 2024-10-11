package com.condicionales;

import java.util.Scanner;

public class Condicionales5_FAHT {

	public static void main(String[] args) {
		int edad;
		Scanner x = new Scanner (System.in);
		 System.out.println("¿Que edad tienes?:");
    	 edad = x.nextInt();

    	 double nota;
 		Scanner y = new Scanner (System.in);
 		 System.out.println("¿Que nota tienes?:");
     	 nota = y.nextInt();
     	 
     	Scanner palabras = new Scanner (System.in);
		System.out.println("INGRESA el sexo M/F ");
		char sexo = palabras.nextLine().toUpperCase().charAt(0);
		
		if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("Resultado: POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("Resultado: ACEPTADA");
            } else {
                System.out.println("Error: Sexo no válido.");
            }
        } else {
            System.out.println("Resultado: NO ACEPTADA");
        }

	}

}
