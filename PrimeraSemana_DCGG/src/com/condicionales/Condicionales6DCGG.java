package com.condicionales;

import java.util.Scanner;

public class Condicionales6DCGG {

	public static void main(String[] args) {
//		6. El director de una escuela está organizando un viaje de estudios y 
//		requiere determinar cuánto debe cobrar a cada alumno y cuánto debe 
//		pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: 
//			* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
//			* De 50 a 99 alumnos, el costo es de 70 euros. 
//			* De 30 a 49 alumnos, el costo es de 95 euros. 
//			* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
//			Realiza un algoritmo que permita determinar el pago a la 
//			compañía de autobuses y lo que debe pagar cada alumno por el viaje.
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroAlumnos;
		
		System.out.println("Programa para determinar el pago de viaje por alumno según la cantidad de alumnos");
		System.out.println("Ingrese el número total de alumnos que irán al viaje: ");
		numeroAlumnos = entrada.nextInt();
		
		if(numeroAlumnos == 100) {
			System.out.println("El costo por alumno es: €65");
		}else if(numeroAlumnos >= 50 && numeroAlumnos <= 99) {
			System.out.println("El costo por alumno es: €70");
		}else if(numeroAlumnos >= 30 && numeroAlumnos <= 49) {
			System.out.println("El costo por alumno es: €95");
		}else {
			System.out.println("El costo por alumno es: €4000");
		}
		
		entrada.close();
	}

}
