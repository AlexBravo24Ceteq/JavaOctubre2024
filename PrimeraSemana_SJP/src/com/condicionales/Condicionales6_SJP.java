package com.condicionales;

import java.util.Scanner;

public class Condicionales6_SJP {

	public static void main(String[] args) {
		//EJERCICIO 6:
		//El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
		//debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
		//cobrar es la siguiente:
		//Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		//De 50 a 99 alumnos, el costo es de 70 euros.
		//De 30 a 49 alumnos, el costo es de 95 euros.
		//Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
		//alumnos.
		//Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
		//pagar cada alumno por el viaje.

		    Scanner entrada= new Scanner(System.in);
		    int numeroAlumnos;
		    
		    System.out.println("N�mero de alumnos: "); //Numero de alumnos 
		    numeroAlumnos= entrada.nextInt();
		    
		    if (numeroAlumnos>= 100) { //costo 65
		    	System.out.println("El pago a la agencia es de: " + (numeroAlumnos*65) + " euros y cada alumno debe pagar 65 euros");	
		    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) { //costo de 70
		        System.out.println("El pago a la agencia es de " + (numeroAlumnos*70) + " euros y cada alumno debe pagar 70 euros");
			 } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) { //costo de 95
			      System.out.println("El pago a la agencia es de " + (numeroAlumnos*95) + " euros y cada alumno debe pagar 95 euros");
			 } else {
			       System.out.println("El coste del autob�s es de 4000 euros y cada alumno debe pagar " 
			    		   			+ (4000/numeroAlumnos) + " euros.");
			        } 
	
	}

}
