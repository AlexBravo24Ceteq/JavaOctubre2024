package com.condicionales;

import java.util.Scanner;

public class Condicionales4_SJP {

	public static void main(String[] args) {
		
		//EJERCICIO 4:
		//Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
		
		Scanner cadena = new Scanner (System.in);
	    String c1;
	    Scanner convertir= new Scanner (System.in);
	    String c2;
	    System.out.print("Introduce una cadena: ");
	    c1 = cadena.nextLine(); //Introducir la letra 
	    c2= c1.toLowerCase();
	    
	    if(c1.equals(c2)) {
	    	System.out.println("El texto está en minúsculas.");
	    } else {
	    	System.out.println("El texto contiene mayúsculas.");
	    }
	}

}
