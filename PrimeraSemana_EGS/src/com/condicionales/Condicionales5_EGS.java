package com.condicionales;
import java.util.Scanner;

public class Condicionales5_EGS {
	public static void main(String[] args) {
		/*
		 * . Realiza un programa que calcule la aceptación de una solicitud en base a
		 * los siguientes parámetros: edad, nota y sexo.
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTADA
		 */
		Scanner consola = new Scanner(System.in);
		
		System.out.println("***Sistema de Solicitudes***");
		System.out.println("Ingresa la Nota del Alumno:");
		int notaAlumno= consola.nextInt();
		System.out.println("Ingresa la edad del alumno:");
		int edadAlumno = consola.nextInt();
		System.out.println("ingresa el Sexo del Alumno(F/M):");
		String sexoAlumno = consola.next().trim().toUpperCase();
		consola.close();
		
		if(notaAlumno>4 && edadAlumno>17) {
			System.out.printf("Nota(%d), edad(%d),sexo(%s)-> ACEPTADA",notaAlumno,edadAlumno,sexoAlumno);
		}else {
			System.out.printf("Nota(%f), edad(%d),sexo(%s)-> NO ACEPTADA",notaAlumno,edadAlumno,sexoAlumno);
		}
		
		
	}

}
