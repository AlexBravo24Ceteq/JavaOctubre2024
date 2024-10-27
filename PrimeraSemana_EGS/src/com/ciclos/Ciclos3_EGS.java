package com.ciclos;
import java.util.Scanner;

public class Ciclos3_EGS {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		Scanner consola = new Scanner (System.in);
		System.out.print("*** identificador de Palindromos ***");
        System.out.print("\nIntroduce una palabra(sin acentos): ");
        String palabra = consola.nextLine().trim().replace(" ","").toLowerCase();
        consola.close();
        
        boolean palindromo = false;
		
		for ( int i = 0, j = palabra.length() - 1; i < j; i++, j--) {
	           if (palabra.charAt(i) != palabra.charAt(j))
	              palindromo = false;
	           else
	        	   palindromo = true; 
	       }
     	   
		if (palindromo == true)
			System.out.println("\nEs palindromo");
        else
     	   System.out.println("\nNo es palindromo");
	}

}
