package com.condicionales;

import java.util.Scanner;

public class Condicionales6_EGS {

	public static void main(String[] args) {
		/*
		 * El director de una escuela está organizando un viaje de estudios y requiere
		 * determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
		 * compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
		 * 100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99
		 * alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
		 * euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000
		 * euros, sin importar el número de alumnos. Realiza un algoritmo que permita
		 * determinar el pago a la compañía de autobuses y lo que debe pagar cada
		 * alumno por el viaje
		 */
		
		Scanner consola = new Scanner(System.in);
		
		System.out.println("*** Cotizador de viaje por alumno***");
		System.out.print("Ingrese el numero de alumnos: ");
		int numeroAlumnos = consola.nextInt();
		consola.close();
		
		if(numeroAlumnos >= 100) {
			System.out.println("El precio por alumno es de: 65 euros");
			System.out.println("El total a paga es de: " + (numeroAlumnos*65));				
		}else if(numeroAlumnos > 49 && numeroAlumnos < 100) {
			System.out.println("El precio por alumno es de: 70 euros");
			System.out.println("El total a paga es de: " + (numeroAlumnos * 70));
		}else if(numeroAlumnos > 29 && numeroAlumnos < 50) {
			System.out.println("El precio por alumno es de: 95 euros");
			System.out.println("El total a paga es de: " + (numeroAlumnos * 95));
		}else {
			System.out.printf("El precio por alumno es de: %d euros\n",(4000/numeroAlumnos));
			System.out.println("El total a paga es de: 4000 euros");
		}
		
	}

}
