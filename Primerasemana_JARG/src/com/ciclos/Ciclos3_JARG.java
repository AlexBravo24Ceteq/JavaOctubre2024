package com.ciclos;
import java.util.Scanner;
public class Ciclos3_JARG {

	public static void main(String[] args) {
//		Realiza un programa para determinar si un String es palíndromo.
		
		String frase;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe una cadea");
		frase = scan.nextLine();
		scan.close();
		String fraseLimpia = frase.replaceAll(" ", "").toLowerCase();
		String entradaInvertida = new StringBuilder(fraseLimpia).reverse().toString();
		if (fraseLimpia.equals(entradaInvertida)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
		
	}

}
