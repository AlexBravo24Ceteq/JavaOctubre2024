package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JARG {

	public static void main(String[] args) {
		/* Caso 6 de condicionales*/
		
		int na;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cual es el numero de alumnos?: ");
		na = entrada.nextInt();
		entrada.close();
		
		double ca;
		double tp;
		
		if (na>=100) {
			ca = 65;
			tp = na * ca;
			System.out.println("El costo de la renta es del bus es de "+tp+", cada alumno paga 65 euros");
		}else if (na>=50 && na<100){
			ca = 70;
			tp = na * ca;
			System.out.println("El costo de la renta es del bus es de "+tp+", cada alumno paga 70 euros");
		}else if (na>=30 && na<50){
			ca = 95;
			tp = na * ca;
			System.out.println("El costo de la renta es del bus es de "+tp+", cada alumno paga 95 euros");
		}else if (na<30){
			System.out.println("El costo de la renta es del bus es de 4000");
		}
		
	}

}
