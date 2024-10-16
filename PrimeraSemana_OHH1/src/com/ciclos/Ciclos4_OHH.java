package com.ciclos;

public class Ciclos4_OHH {

	public static void main(String[] args) throws InterruptedException{
		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora,
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		//horas
		
		int horas=0, minutos=0, seg=0;
		
		while (true) {
			if (horas<10) {
				System.out.print("0");
			}
			System.out.print(horas+":");
			
			if (minutos<10) {
				System.out.print("0");
			}
			System.out.print(minutos+":");
			
			if (seg<10) {
				System.out.print("0");
			}
			System.out.println(seg);
			
			seg++;
			
			if (seg==60) {
				seg=0;
				minutos++;
				if (minutos==60) {
					minutos=0;
					horas++;
					if (horas==24) {
						horas=0;
					}				
			}
			
		}
			Thread.sleep(1000); 
		}
	}
}