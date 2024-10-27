package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AGAH {

	public static void main(String[] args) {
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que diga cual es el mayor de dos numeros");
		System.out.println("Ingrese el primer numero: ");
		int primernumero = sc.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		int segundonumero = sc.nextInt();
		
		if(primernumero > segundonumero) {
			
			System.out.println("EL numero mayor es: " + primernumero);
			
		}else if(primernumero == segundonumero) {
	
			System.out.println("Los dos numeros son iguales...");
		
		}else if (primernumero < segundonumero){
			
			System.out.println("El numero mayor es: " + segundonumero);
		}
		
		
		sc.close();
		
		
		
	}

}
