package com.condicionales;

import java.util.Scanner;

public class Condicionales2_FAHT {

	public static void main(String[] args) {
		int x;
		Scanner numero = new Scanner (System.in);
		 System.out.println("Dame el valor de tu primer n�mero:");
    	 x = numero.nextInt();
    	 
    	 if (x % 2==0) {
    		 System.out.println("El n�mero "+x+" es par."); 
    	 }else {
    		 System.out.println("El n�mero "+x+" es impar.");
    	 }

	}

}
