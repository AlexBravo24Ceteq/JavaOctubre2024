package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		Cientifica casio = new Cientifica("CASIO", "FX-991LAPLUS2-S-MT", "Negro", 7, 417, 539);

		System.out.println(casio);
		
		System.out.print("\nIngresa un número: ");
		int a = entrada.nextInt();
		System.out.print("Ingresa otro número: ");
		int b = entrada.nextInt();
		
		System.out.println("\nSuma "+a+" + "+b+" = "+casio.sumar(a,b));
		System.out.println("Resta "+a+" - "+b+" = "+casio.restar(a,b));
		System.out.println("Multiplicación "+a+" x "+b+" = "+casio.multiplicar(a,b));
		
		//ejemplo de método abstracto
		casio.dividir();

		casio.tomarTemperatura();
	
	}

}
