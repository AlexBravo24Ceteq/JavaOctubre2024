package com.ciclos;

import java.util.Scanner;

public class Ciclos3_OHH {
	public static void main(String[] args) {
//		3. Realiza un programa para determinar si un String es palíndromo.
		
		String frase;
		int indiceIncial = 0;
		int indiceFinal;
		Scanner entradaDatos = new Scanner(System.in); 
		
		System.out.println("Ingresa una frase para saber si es palindromo, no incluyas carácteres especiales, ni acentos");
		frase = entradaDatos.nextLine();
		
		//cambiando a minusculas y quitando espacios
		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		indiceFinal = frase.length() - 1;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(indiceIncial) == frase.charAt(indiceFinal)) {
				indiceIncial++;
				indiceFinal--;
			}
			else {
				System.out.println("no es palindromo");
			}
		}
		entradaDatos.close();
		System.out.println("Es palindromo");
		
	}
}
