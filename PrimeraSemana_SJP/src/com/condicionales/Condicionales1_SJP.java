package com.condicionales;

import java.util.Scanner;

public class Condicionales1_SJP {
	public static void main(String[] args) {

		//EJERCICIO 1:
	    //Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales.
	Scanner numeros = new Scanner (System.in);
	int numero1; //Primer número
    int numero2; //Segundo número 
	System.out.println("Introduce el primer número: ");	
    numero1 = numeros.nextInt();
    System.out.println("Introduce el segundo número: ");
    numero2 = numeros.nextInt();
		    
    //Para cálcular que número que es mayor:
    if (numero1 > numero2){
    	System.out.println("El primer número: " + numero1 + ", es mayor que el número dos: " + numero2);
    }else if (numero1 < numero2){
    	System.out.println("El segundo número: " + numero2 + ", es mayor que el primer número: " + numero1);
    }else {// Si ninguna de las condiciones anteriores se cumple, entonces:
    	System.out.println("Ambos números son iguales " + numero1);
		  }
	}
}
