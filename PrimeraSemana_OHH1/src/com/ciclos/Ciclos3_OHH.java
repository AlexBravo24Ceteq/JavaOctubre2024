package com.ciclos;

import java.util.Scanner;

public class Ciclos3_OHH {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.
		
		Scanner entrada = new Scanner (System.in);
			int i=0, j=0;
		
		System.out.println("Introduce una frase para verificar si es un palíndromo: ");
				String frase = entrada.nextLine();
				frase = frase.toLowerCase().replace(" ","");
				j = frase.length()-1;
			
		while (i < j) {
			if (frase.charAt(i) == frase.charAt(j)) {
				i++;
				j--;
			}
			
			else {
				System.out.println("La frase no es un palíndromo");
				break;
			}
		}
		
		if(i==j){
			System.out.println("La frase es un palíndromo");
		}
			
		
		
	}
}
