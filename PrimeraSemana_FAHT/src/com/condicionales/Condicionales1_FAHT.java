package com.condicionales;

import java.util.Scanner;

public class Condicionales1_FAHT {

	public static void main(String[] args) {
		//Realiza un programa que reciba dos n�meros 
		//por teclado e indique cu�l es mayor o si son iguales.
        
		int x;
    	int y;
    	Scanner uno = new Scanner (System.in);
    	Scanner dos = new Scanner (System.in);
    	
        System.out.println("Dame el valor de tu primer n�mero:");
        	 x = uno.nextInt();
        	 
        System.out.println("Dame el valor de tu segundo n�mero n�mero:");
        y = dos.nextInt();
        
        System.out.println("Respuesta:");
        if (x>y) {
       	 System.out.println("El numero " +x+"  es mayor al numero  "+y);
        }else if (x<y) { 
       	 System.out.println("El numero " +x+"  es menor al numero  "+y);
        } else 
          	 System.out.println("Los numeros son iguales");
           }
        
	}//main

