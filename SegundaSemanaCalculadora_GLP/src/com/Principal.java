package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Cientifica cientifica = new Cientifica();
		double a = 0;
		double b = 0;
		System.out.println("Bienvenido a la Calculadora");
		int index = -1;
		
		while(index!=0){
			System.out.println("\nElige una opcion: \n"
	                + "1. Sumar\n"
	                + "2. Restar\n"
	                + "3. Multiplicacion\n"
	                + "4. Dividir\n"
	                + "0. Salir\n");
			
			index = entrada.nextInt();
			
			if(index >=1 && index <=4 ) {
				System.out.println("Ingresa el primer numero");
				a = entrada.nextInt();
				
				System.out.println("Ingresa el segundo numero");
				b = entrada.nextInt();
			}else if(index >4){
				
			}
			
			switch (index) {
			case 1:
				System.out.println(cientifica.sumar(a, b));
				break;
			case 2:
				System.out.println(cientifica.restar(a, b));
				break;
			case 3:
				System.out.println(cientifica.multiplicar(a, b));
				break;
			case 4:
				System.out.println(cientifica.dividir(a, b));
				break;
			case 0:
				System.out.println("Hasta Pronto");
				break;
			default:
				System.out.println("Ese opcion no existe intenta de nuevo");
				break;
			}
		
		}
		
		entrada.close();

	}

}
