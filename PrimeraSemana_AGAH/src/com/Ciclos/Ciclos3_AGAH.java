package com.Ciclos;

import java.util.Scanner;

public class Ciclos3_AGAH {

	public static void main(String[] args) {
		/*
		 * 3. Realiza un programa para determinar si un String es palíndromo.
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("teclea el supuesto palindromo:");
		String  cadena = sc.next();
		cadena = cadena.replace(" ", "").toLowerCase();
		String opuesto = "";
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			opuesto += cadena.charAt(i);
			
			}
		if(cadena.equals(opuesto)) {
			System.out.println("La palabra si es un palindromo..");
			
		}else {
			System.out.println("La palabra no es un palindromo..");
			}
	

	}

}
