package com.condicionales;

import java.util.Scanner;

public class Condicionales3DCGG {

	public static void main(String[] args) {
		// 3. Crea un programa que pida al usuario dos n�meros y muestre el resultado 
		// de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		int valor1;
		int valor2;
		float resultado;
		
		System.out.println("Programa que solicita 2 valores num�ricos y realiza la divisi�n");
		System.out.println("Proporcione el primer valor num�rico entero: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Proporcione el segundo valor num�rico entero: ");
		valor2 = entrada.nextInt();
		
		if(valor2 == 0 ) {
			System.out.println("La divisi�n entre 0 no es matem�ticamente posible!");
			System.out.println("(ejecute de nuevo el programa y elija otro n�mero)");
		}
		
		resultado = (float)valor1/valor2;
		System.out.println("El resultado de dividir "+valor1+" / " +valor2+" = " + resultado);
		
		entrada.close();
	}

}
