package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cientifica calculadora = new Cientifica();
		
		char caracter =' ';
		while(caracter != 't') {
			System.out.println("CALCULADORA");
			System.out.println("opciones:");
			System.out.println("1 -> promedio abstracto");
			System.out.println("2 -> potencia abstracto");
			System.out.println("3 -> factorial abstracto");
			System.out.println("4 -> sumaabstracta");
			System.out.println("5 -> suma");
			System.out.println("6 -> dividir");
			System.out.println("Que operacion deseas realizar: ");
			int dato = sc.nextInt();
			switch(dato){
				case 1: System.out.println(calculadora.promedio());
				break;
				case 2: System.out.println(calculadora.potencia());
				break;
				case 3: System.out.println(calculadora.factorial(6));
				break;
				case 4: calculadora.suma(1, 2, 3);
				break;
				case 5: System.out.println(calculadora.suma(2, 3));
				break;
				case 6: calculadora.dividir(9, 3, 1);
				break;
			}
		}

	}

}
