package com.condicionales;

import java.util.Scanner;

public class Condicionales3_SJP {

	public static void main(String[] args) {
		//EJERCICIO 3:
		//Crea un programa que pida al usuario dos números y 
		//muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.

		Scanner numeros = new Scanner (System.in);
	    int n1; //Parte de la división
	    int n2;
	    System.out.print("Introduce el primer número: ");
	    n1 = numeros.nextInt(); //Escribir el número a dividir
	    System.out.print("Introduce el segundo número: ");
	    n2 = numeros.nextInt(); //Escribir entre cuantas partes dividir
	    
	    if (n2!= 0){ //El denominador debe ser diferente de 0
	        System.out.println(n1/n2);
	    }else {
	        System.out.println("Error, el denominador no puede ser 0. "
	            + "Reinicie el programa e introduzca un valor válido."); //Al introducir 0 marcará error
	    }  

	}

}
