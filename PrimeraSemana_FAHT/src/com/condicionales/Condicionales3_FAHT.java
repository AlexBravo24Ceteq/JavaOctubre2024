package com.condicionales;

import java.util.Scanner;

public class Condicionales3_FAHT {

	public static void main(String[] args) {
		double x;
		Scanner numero1 = new Scanner (System.in);
		 System.out.println("Dame el valor de tu primer número:");
    	 x = numero1.nextInt();
    	 double y;
 		Scanner numero2 = new Scanner (System.in);
 		 System.out.println("Dame el valor de tu segundo número:");
     	 y = numero1.nextInt();

     	 if (y==0) {
     		 System.out.println("Error, no se puede dividir entre 0");
     	 }else {
     		 double result = x/y;
     		 System.out.println("El resultado es: "+result);
     	 }
     	 
	}

}
