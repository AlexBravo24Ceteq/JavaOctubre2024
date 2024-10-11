package com.condicionales;

import java.util.Scanner;

public class Condicionales6_OHH {

	public static void main(String[] args) {
//		6. El director de una escuela está organizando un viaje de estudios y requiere
//		determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
//		compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
//		100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
//		euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000
//		euros, sin importar el número de alumnos. Realiza un algoritmo que permita
//		determinar el pago a la compañía de autobuses y lo que debe pagar cada
//		alumno por el viaje.
		
		int alumnos;
		double precioAlumno, precioTotalAutobus;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Cantidad de viajeros(alumnos): ");
		alumnos =  entradaDatos.nextInt();
		entradaDatos.close();
		
		if(alumnos >= 100) {
			precioAlumno = 65; 
			precioTotalAutobus = (double) alumnos * precioAlumno;
			System.out.println("Total de alumnos: " + alumnos);
			System.out.println("Costo del viaje por alumno: "+ precioAlumno + " Euros");
			System.out.println("Pago total para el autobus: " + precioTotalAutobus + " Euros");
		}else if(alumnos < 100 && alumnos >= 50) {
			precioAlumno = 70;
			precioTotalAutobus = (double) alumnos * precioAlumno;
			System.out.println("Total de alumnos: " + alumnos);
			System.out.println("Costo del viaje por alumno: "+ precioAlumno + " Euros");
			System.out.println("Pago total para el autobus: " + precioTotalAutobus + " Euros");
		}else if(alumnos < 50 && alumnos >= 30) {
			precioAlumno = 95;
			precioTotalAutobus = (double) alumnos * precioAlumno;
			System.out.println("Total de alumnos: " + alumnos);
			System.out.println("Costo del viaje por alumno: "+ precioAlumno + " Euros");
			System.out.println("Pago total para el autobus: " + precioTotalAutobus + " Euros");
		}else{
			precioAlumno = 120;
			precioTotalAutobus = (double) alumnos * precioAlumno;
			System.out.println("Total de alumnos: " + alumnos);
			System.out.println("Costo del viaje por alumno: "+ precioAlumno + " Euros");
			System.out.println("Pago total para el autobus: " + precioTotalAutobus + " Euros");
		}
		
	}

}
