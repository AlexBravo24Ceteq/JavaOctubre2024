package com.condicionales;

import java.util.Scanner;

public class Condicionales6_GLP {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de alumnos");
		int alumnos = entrada.nextInt();
		
		if(alumnos >= 100) {
			System.out.println("El costo por alumno es de 65 euros");
		}else if(alumnos >= 50 && alumnos <= 99) {
			System.out.println("El costo por alumno es de 70 euros");
		}else if(alumnos >= 30 && alumnos <= 49){
			System.out.println("El costo por alumno es de 95 euros");
		}else {
			int costo = 4000/alumnos;
			System.out.println("El costo por alumno es "+ costo);
		}
		
		entrada.close();
		
	}
}
