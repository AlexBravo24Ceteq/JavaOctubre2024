package com.condicionales;

import java.util.Scanner;

public class Condicionales1_SJP {
	public static void main(String[] args) {

		//EJERCICIO 1:
	    //Realiza un programa que reciba dos n�meros por teclado 
		//e indique cu�l es mayor o si son iguales.
	Scanner numeros = new Scanner (System.in);
	int numero1; //Primer n�mero
    int numero2; //Segundo n�mero 
	System.out.println("Introduce el primer n�mero: ");	
    numero1 = numeros.nextInt();
    System.out.println("Introduce el segundo n�mero: ");
    numero2 = numeros.nextInt();
		    
    //Para c�lcular que n�mero que es mayor:
    if (numero1 > numero2){
    	System.out.println("El primer n�mero: " + numero1 + ", es mayor que el n�mero dos: " + numero2);
    }else if (numero1 < numero2){
    	System.out.println("El segundo n�mero: " + numero2 + ", es mayor que el primer n�mero: " + numero1);
    }else {// Si ninguna de las condiciones anteriores se cumple, entonces:
    	System.out.println("Ambos n�meros son iguales " + numero1);
		  }
	}
}
