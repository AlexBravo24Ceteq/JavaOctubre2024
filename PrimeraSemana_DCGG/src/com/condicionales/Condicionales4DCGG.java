package com.condicionales;

import java.util.Scanner;

public class Condicionales4DCGG {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas
		
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		boolean contieneMayusculas = false;
		
		System.out.println("programa que ingresa una frase o palabra por teclado y comprueba si contiene mayúsculas");
		System.out.println("Máximo 10 caracteres");
		System.out.println("Ingresa la frase o palabra: ");
		cadena = entrada.nextLine();
		
		
		System.out.println("Evaluando.. ");
		switch (cadena.length()) {
		case 0:
			contieneMayusculas = false;
			System.out.println("no ha ingresado ningun caracter");
			break;
		case 1:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 2:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 3:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1))||
			Character.isUpperCase(cadena.charAt(2));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 4:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1))||
			Character.isUpperCase(cadena.charAt(2))||
			Character.isUpperCase(cadena.charAt(3));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 5:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1))||
			Character.isUpperCase(cadena.charAt(2))||
			Character.isUpperCase(cadena.charAt(3))||
			Character.isUpperCase(cadena.charAt(4));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 6:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1))||
			Character.isUpperCase(cadena.charAt(2))||
			Character.isUpperCase(cadena.charAt(3))||
			Character.isUpperCase(cadena.charAt(4))||
			Character.isUpperCase(cadena.charAt(5));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 7:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1))||
			Character.isUpperCase(cadena.charAt(2))||
			Character.isUpperCase(cadena.charAt(3))||
			Character.isUpperCase(cadena.charAt(4))||
			Character.isUpperCase(cadena.charAt(5))||
			Character.isUpperCase(cadena.charAt(6));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 8:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1))||
			Character.isUpperCase(cadena.charAt(2))||
			Character.isUpperCase(cadena.charAt(3))||
			Character.isUpperCase(cadena.charAt(4))||
			Character.isUpperCase(cadena.charAt(5))||
			Character.isUpperCase(cadena.charAt(6))||
			Character.isUpperCase(cadena.charAt(7));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 9:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1))||
			Character.isUpperCase(cadena.charAt(2))||
			Character.isUpperCase(cadena.charAt(3))||
			Character.isUpperCase(cadena.charAt(4))||
			Character.isUpperCase(cadena.charAt(5))||
			Character.isUpperCase(cadena.charAt(6))||
			Character.isUpperCase(cadena.charAt(7))||
			Character.isUpperCase(cadena.charAt(8));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		case 10:
			contieneMayusculas = Character.isUpperCase(cadena.charAt(0)) ||
			Character.isUpperCase(cadena.charAt(1))||
			Character.isUpperCase(cadena.charAt(2))||
			Character.isUpperCase(cadena.charAt(3))||
			Character.isUpperCase(cadena.charAt(4))||
			Character.isUpperCase(cadena.charAt(5))||
			Character.isUpperCase(cadena.charAt(6))||
			Character.isUpperCase(cadena.charAt(7))||
			Character.isUpperCase(cadena.charAt(8))||
			Character.isUpperCase(cadena.charAt(9));
			if(contieneMayusculas == true) {
				System.out.println("La cadena ingresada tiene mayúsculas..");
			}else {
				System.out.println("La cadena ingresada NO contiene mayúsculas");
			}
			break;
		default:
			System.out.println("Error: ha excedido el número máximo de caracteres permitidos..");
			System.out.println("Ejecute de nuevo el programa");
			break;
		}
		
		entrada.close();	
		

	}

}
