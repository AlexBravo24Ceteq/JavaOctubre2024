package com.ciclos;

import java.util.Scanner;

public class Ciclos4DCGG {

	public static void main(String[] args) {
//		4. Simular el comportamiento de un reloj digital, imprimiendo la hora,
//		minutos y segundos de un día, desde las 00:00:00 horas hasta las 23:59:59
//		horas
		Scanner entrada = new Scanner(System.in);
				
		for(int h = 0 ; h < 24; h++) {
			for(int m = 0; m < 60; m++ ) {
				for(int s = 0; s < 60; s++) {
					System.out.printf("%02d:%02d:%02d\n",h,m,s);
					
					if((s) == 1 ) {
						System.out.println((s)+" segundo ha pasado.. ");
						entrada.nextLine();
					}else {
						System.out.println((s)+" segundos han pasado.. ");
						entrada.nextLine();
					}
				}
			}
		}
		entrada.close();

	}

}
