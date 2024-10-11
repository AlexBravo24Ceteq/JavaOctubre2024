package com.ciclos;

public class Ciclos4_EGS {
	public static void main(String[] args) {
		/*Simular el comportamiento de un reloj digital, imprimiendo la hora,
		 *minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		 *horas
		 */
		
		System.out.println("*** Simulacion de Reloj ***");
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		boolean fin = false;
		while(!fin) {
			segundos++;
			if (segundos > 59) {
				segundos = 0;
				minutos++;
			}else if(minutos > 59) {
				minutos = 0;
				horas++;
			}else if(horas > 22 && minutos > 58 && segundos > 58){
				fin = true;
			}
			System.out.printf("\nLa hora es: %02d:%02d:%02d", horas, minutos, segundos);
		}	
	}
	
}
