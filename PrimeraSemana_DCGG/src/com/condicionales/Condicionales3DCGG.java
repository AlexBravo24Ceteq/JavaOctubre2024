package com.condicionales;

import java.util.Scanner;

public class Condicionales3DCGG {

	public static void main(String[] args) {
		// 3. Crea un programa que pida al usuario dos números y muestre el resultado 
		// de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		int valor1;
		int valor2;
		float resultado;
		
		System.out.println("Programa que solicita 2 valores numéricos y realiza la división");
		System.out.println("Proporcione el primer valor numérico entero: ");
		valor1 = entrada.nextInt();
		
		System.out.println("Proporcione el segundo valor numérico entero: ");
		valor2 = entrada.nextInt();
		
		if(valor2 == 0 ) {
			System.out.println("La división entre 0 no es matemáticamente posible!");
			System.out.println("(ejecute de nuevo el programa y elija otro número)");
		}
		
		resultado = (float)valor1/valor2;
		System.out.println("El resultado de dividir "+valor1+" / " +valor2+" = " + resultado);
		
		entrada.close();
	}

}
