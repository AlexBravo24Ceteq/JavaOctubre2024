package com.condicionales;

import java.util.Scanner;

public class Condicionales6_OHH {

	public static void main(String[] args) {
		// 6. El director de una escuela está organizando un viaje de estudios y requiere
		//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
		//compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
		//100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99
		//alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
		//euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000
		//euros, sin importar el número de alumnos. Realiza un algoritmo que permita
		//determinar el pago a la compañía de autobuses y lo que debe pagar cada
		//alumno por el viaje.

		Scanner entrada = new Scanner (System.in);
		int numero, total, pagoAlumno;
		
		System.out.println("Ingresa el número de alumnos: ");
		
		numero = entrada.nextInt();
		
		if (numero < 30) {
			pagoAlumno = 4000/numero;
			System.out.println("El total a pagar por alumno es de: $"+pagoAlumno);
			System.out.println("El total a pagar a la compañía de autobuses es de: $4000");
		}
		else if (numero >= 30 && numero <= 49) {
			total = numero * 95;
			System.out.println("El total a pagar por alumno es de: $95");
			System.out.println("El total a pagar a la compañía de autobuses es de: $"+total);
			}
		else if (numero >= 50 && numero <= 99) {
			total = numero * 70;
			System.out.println("El total a pagar por alumno es de: $70");
			System.out.println("El total a pagar a la compañía de autobuses es de: $"+total);
			}
		else if (numero >= 100) {
			total = numero * 65;
			System.out.println("El total a pagar por alumno es de: $65");
			System.out.println("El total a pagar a la compañía de autobuses es de: $"+total);
			}
	}
}
