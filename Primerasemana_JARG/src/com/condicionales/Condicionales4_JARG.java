package com.condicionales;
import java.util.Scanner;
public class Condicionales4_JARG {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que lea una cadena por teclado y compruebe si 
		 *contiene letras mayúsculas
		 */
		
		String frase;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdusca el texto");
		frase = entrada.nextLine();
		entrada.close();
		boolean mayus = !frase.equals(frase.toLowerCase());
		
		if (mayus) {
            System.out.println("Tiene mayusculas");
        } else {
            System.out.println("No tiene mayusculas");
        }
	}

}
