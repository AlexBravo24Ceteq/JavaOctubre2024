package com.condicionales;

import java.util.Scanner;

public class Condicionales6_FOD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el numero de alumnos");
		int numAlumnos = entrada.nextInt();
		
		int costoPorAlum = 0;
		double pagoTotal = 0;
		
		if (numAlumnos == 100) {
			costoPorAlum = 65;
			pagoTotal = numAlumnos * costoPorAlum;
		}else if (numAlumnos >= 50 && numAlumnos <= 99) {
			costoPorAlum = 70;
			pagoTotal = numAlumnos * costoPorAlum;
		}else if (numAlumnos >= 30 && numAlumnos <= 49) {
			costoPorAlum = 95;
			pagoTotal = numAlumnos * costoPorAlum;
		}else if (numAlumnos < 30) {
			pagoTotal = 4000;
		}
		
		if (numAlumnos >=30) {
			System.out.println("El costo por cada alumno es: " + costoPorAlum + " Euros");
			System.out.println("El pago total de la compañia es: " + pagoTotal + " Euros");
		}else {
			System.out.println("El pago total de la compañia es: " + pagoTotal + " Euros");
			System.out.println("cada alumno debe pagar: " + (pagoTotal / numAlumnos) + " Euros");
		}
		
		entrada.close();
	}

}
