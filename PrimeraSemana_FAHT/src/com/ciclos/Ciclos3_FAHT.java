package com.ciclos;

import java.util.Scanner;

public class Ciclos3_FAHT {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Ingrese una cadena de texto: ");

		String cadena = scanner.nextLine();
		String cadenalimp = cadena.replace(" ", "").toLowerCase();
		System.out.println("");
		
		boolean palindromo=true;
		
		 for (int i = 0, j = cadenalimp.length()-1; i < j; i++, j--) {
			 if (cadenalimp.charAt(i) != cadenalimp.charAt(j)) {
				 palindromo=false;
				 break;
			 }
		 }
		 if (palindromo) {
			 System.out.println("La cadena es un palindromo");
		 } else {
			 System.out.println("La cadena no es un palindromo");
		 }
		 
	}//end

}
