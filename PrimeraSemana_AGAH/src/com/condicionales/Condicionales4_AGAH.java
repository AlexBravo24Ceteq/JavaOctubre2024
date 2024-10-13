package com.condicionales;

import java.util.Scanner;

public class Condicionales4_AGAH {

	public static void main(String[] args) {
//		4. Realiza un programa que lea una cadena por teclado y compruebe si 
//		contiene letras mayúsculas.

	Scanner cadena = new Scanner (System.in);
	String c1,c2;
	System.out.println("ingrese la cadena: ");
	c1 = cadena.nextLine();
	
	c2 = c1.toLowerCase();//lo que hace es convertir la cadena en minusculas
	
	
	
	if(c1.equals(c2)) {//
		System.out.println("La cadena no tiene letras mayusculas..");
	}else {
		System.out.println("La cadena tiene letras mayusculas..");
	}
	
	cadena.close();
		
	}

}
