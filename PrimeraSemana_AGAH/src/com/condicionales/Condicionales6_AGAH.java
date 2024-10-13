package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AGAH {

	public static void main(String[] args) {
////6. El director de una escuela est� organizando un viaje de estudios y requiere 
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
//		alumno por el viaje.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para determinar cuanto pagar a la compa�ia");
		System.out.println("Ingrese el numero de alumnos que iran al viaje: ");
		int alumnos = sc.nextInt();
		
		if(alumnos >= 100) {
			System.out.println("El costo por cada alumno es de 65 euros");
			System.out.println("La cantidad a pagar a la compa�ia es de: " + (alumnos*65));
		}else if((alumnos >= 50) && (alumnos <= 99)) {
			System.out.println("El costo por cada alumno es de 70 euros");
			System.out.println("La cantidad a pagar a la compa�ia es de: " + (alumnos*70));
		}else if((alumnos >= 30) && (alumnos <= 49)) {
			System.out.println("El costo por cada alumno es de 95 euros");
			System.out.println("La cantidad a pagar a la compa�ia es de: " + (alumnos*95));
		}else if(alumnos < 30) {
			double renta = (4000.0/alumnos);
			double resultado = renta * alumnos;
			System.out.println("El costo por cada alumno es de " + renta + " euros");
			System.out.println("La cantidad a pagar a la compa�ia es de: " + (resultado));
		}
	}

}
