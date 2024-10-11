package com.ciclos;

import java.util.Scanner;

public class Ciclos3DCGG {

	public static void main(String[] args) {
//		3. realizar un programa para determinar si un string es palíndromo
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("programa que verifica si una palabra es palíndromo");
		System.out.println("introduce tu palabra: ");
		String palabra = entrada.nextLine();
		
		System.out.println("Evaluando..");
		
		palabra = palabra.replace(" ", "").toLowerCase();
		
		
		String palabrainvertida = "";
		
		for(int i = palabra.length()-1; i >= 0; i-- ) {
			palabrainvertida += palabra.charAt(i);
		}
		
		if(palabra.equals(palabrainvertida)) {
			System.out.println("La palabra es un palíndromo :D");
		}else {
			System.out.println("NO es palíndromo :(");
		}
		
		entrada.close();

	}

}
