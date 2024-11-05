package com.ciclos;


public class Ciclos4_FOD {

	public static void main(String[] args) {

		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		
		while (hora < 24) {
			System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
			
			segundo++;
			
			if (segundo == 60) {
				segundo = 0;
				minuto++;
			}
			
			if (minuto == 60) {
				minuto = 0;
				hora++;
			}
		}
		
	}

}
