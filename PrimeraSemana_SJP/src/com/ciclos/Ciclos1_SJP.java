package com.ciclos;

import java.util.Scanner;

public class Ciclos1_SJP {

	public static void main(String[] args) {
		//EJERCICIO 1:
		//Programa un algoritmo que realice la tabla de multiplicar del 12
		
		//En caso de que quisieramos introducir otro n�mero:
		//Scanner entrada = new Scanner(System.in);
        //int n;
		//System.out.print("Introduce un n�mero: ");           
        //n = entrada.nextInt(); //Asigamos valor 
  
		System.out.println("-TABLAS DE MULTIPLICAR-");
		
		int n = 12;
        System.out.println("Tabla del " + n + ": ");
        for(int i = 1; i<=10; i++){ //Incrementar en 1 el valor de la variable i 
             System.out.println(n + " * " + i + " = " + n*i);// concatenaci�n para dar formato al resultado                                                    
        }

	}

}
