package com.condicionales;

import java.util.Scanner;

public class Condicionales2_SJP {

	public static void main(String[] args) {
		
		//EJERCICIO 2:
		//Realiza un programa que pida un n�mero por teclado y nos indique si es par 
		//o impar.
		 Scanner numero = new Scanner (System.in); //Se crea un objeto Scanner para poder introducir un valor por teclado 
		    int n;
		    System.out.println("ESTE PROGRAMA TE DICE SI EL N�MERO ES PAR O IMPAR");
		    System.out.print("Introduce el n�mero: "); //Asignamos el valor del n�mero 
		    n = numero.nextInt();
		    
		
		    if (n % 2 == 0){ //Dividir entre 2 si es par
		    				//y que el residuo sea 0
		        System.out.println("El n�mero, " + n + " es par.");
		    }else {
		        System.out.println("El n�mero " + n + " es impar.");
		    }  
		  }
}
