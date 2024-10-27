package com.condicionales;

import java.util.Scanner;

public class Condicionales4_OHH {

	public static void main(String[] args) {
//		4. Realiza un programa que lea una cadena por teclado y compruebe si
//		contiene letras mayúsculas.
		
		String cadena;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.print("Ingresa una cadena de texto: ");
		cadena = entradaDatos.nextLine();
		entradaDatos.close();
		
//		if(cadena.equals(Character.isUpperCase(cadena))) {
//			
//		}
	    
	    if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
	       System.out.println("La cadena tiene letra mayúscula.");
	    }else {
	        System.out.println("La cadena tiene letras minusculas.");
	    }
	}

}
