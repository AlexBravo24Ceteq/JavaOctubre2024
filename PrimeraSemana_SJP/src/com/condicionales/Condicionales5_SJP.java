package com.condicionales;

import java.util.Scanner;

public class Condicionales5_SJP {

	public static void main(String[] args) {
		//Ejercicio 5:
		//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		//parámetros: edad, nota y sexo.
		//Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//Otros casos -> NO ACEPTADA
		
		System.out.println("INGRESE SUS DATOS");
		Scanner datos = new Scanner(System.in);
	    int nota; //DECLARAMOS LAS VARIABLES
	    int edad;
	    String sexo;
	    
	    System.out.print("Edad: "); //Introducir edad
	    edad = datos.nextInt();
	    System.out.print("Nota: "); //Introducir Nota
	    nota = datos.nextInt();
	    System.out.print("Sexo (M o F): "); //Introducir Sexo
	    sexo = datos.next();

	     if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
	         System.out.println("El valor de sexo introducido es incorrecto.\n"
	             + "Realice nuevamente el formulario.");
	     } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	         System.out.println("POSIBLE");
	     }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	          System.out.println("ACEPTADA");
	     }else {
	           System.out.println("NO ACEPTADA");
	     	}
	}

}
