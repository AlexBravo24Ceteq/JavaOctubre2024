package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		Cientifica casio = new Cientifica("CASIO", "FX-991LAPLUS2-S-MT", "Negro", 7, 417, 539);

		System.out.println(casio);
		
		System.out.print("\nIngresa un n�mero: ");
		int a = entrada.nextInt();
		System.out.print("Ingresa otro n�mero: ");
		int b = entrada.nextInt();
		
		System.out.println("\nSuma "+a+" + "+b+" = "+casio.sumar(a,b));
		System.out.println("Resta "+a+" - "+b+" = "+casio.restar(a,b));
		System.out.println("Multiplicaci�n "+a+" x "+b+" = "+casio.multiplicar(a,b));
		
		//ejemplo de m�todo abstracto
		casio.dividir();

		casio.tomarTemperatura();
	
	}

}
