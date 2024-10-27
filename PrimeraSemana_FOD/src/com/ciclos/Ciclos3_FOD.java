package com.ciclos;

import java.util.Scanner;

public class Ciclos3_FOD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto para identificar si es un palindromo: ");
		String texto = entrada.nextLine();
		
		String limpio = texto.replace(" ","").toLowerCase();
		boolean esPalindromo = true;
		 int longitud = limpio.length();
		 for (int i = 0; i < longitud/2; i++) {
			if (limpio.charAt(i) != limpio.charAt(longitud -i -1)) {
				esPalindromo = false;
				break;
			}
		}
		
		 if (esPalindromo) {
			System.out.println("La cadena de texto es un palindromo\n" + texto);
		}else {
			System.out.println("La cadena de texto no es un palindromo\n" + texto);
		}
		 entrada.close();
	}

}
