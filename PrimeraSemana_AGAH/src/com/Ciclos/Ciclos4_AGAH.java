package com.Ciclos;

import java.util.Scanner;

public class Ciclos4_AGAH {

	public static void main(String[] args) throws InterruptedException{
		/*
		 * 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
horas

		 */
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Simulador de reloj digital");
		
		for(int hora = 0; hora <= 23; hora++) {
			for(int min = 0; min <= 59; min++) {
				for(int seg = 0; seg <= 59; seg++) {
					System.out.printf("%2d:%2d:%2d\n",hora,min,seg);
					Thread.sleep(1000);
				}
			}
		}

	}

}
