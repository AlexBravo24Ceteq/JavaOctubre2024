package com.condicionales;

import java.util.Scanner;

public class Condicionales4_GLP {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean contieneMayuscula = false;
		
		System.out.println("Ingresa un texto");
		String texto = entrada.nextLine();
		
		for(char c : texto.toCharArray()) {
			if(Character.isUpperCase(c)) {
				contieneMayuscula = true;
				break;
			}
		}
		
		if (contieneMayuscula) {
            System.out.println("El texto contiene al menos una letra mayúscula.");
        } else {
            System.out.println("El texto no contiene letras mayúsculas.");
        }

        entrada.close();
		
	}

}
