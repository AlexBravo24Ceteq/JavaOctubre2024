package com.condicionales;

import java.util.Scanner;

public class Condicionales4_EGS {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayúsculas.
		System.out.println("***Comprobador de mayusculas en frases***");
		Scanner consola = new Scanner(System.in);
		System.out.print("Ingresa un texto corto(Juega con las mayusculas y minusculas): ");
		String $frase = consola.nextLine();
		consola.close();
		String fraseLower = $frase.toLowerCase();
		
		if($frase.length() != 0){
			if (fraseLower.equals($frase)) {
				System.out.println("La frase: \"" + $frase + "\" no contiene Mayusculas ");
			}else {
				System.out.println("La frase: \"" + $frase + "\" contiene Mayusculas ");
			}
		}else {
			System.out.println("No ah ingresado ningun caracter");
		}
	}

}
