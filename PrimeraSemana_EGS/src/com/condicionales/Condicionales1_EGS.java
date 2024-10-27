package com.condicionales;
import java.util.Scanner;

public class Condicionales1_EGS {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado e 
		// indique cuál es mayor o si son iguales.
		
		Scanner consola = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int numero1 = consola.nextInt();
		System.out.println("Ingresa otro numero: ");
		int numero2 = consola.nextInt();
		consola.close();
		
		if(numero1 > numero2) {
			System.out.println("El numero 1 es mayor");
		}else if (numero1 < numero2) {
			System.out.println("El numero 2 es mayor");
		}else if (numero1 == numero2) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Error al ingresar los numeros");
		}
		

	}

}
