package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AGAH {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

	double resultado;	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Programa que divide dos numeros");
	System.out.println("Ingrese el valor del primer numero: ");
	int numero1 = sc.nextInt();
	System.out.println("Ingrese el valor del segundo numero: ");
	int numero2 = sc.nextInt();
	
	if(numero2 == 0) {
		
		System.out.println("Error de numero ingrese otro numero: ");
		
	}else {
		resultado = (numero1 / numero2);
		System.out.println("El resultado de la division de " + numero1 + " / "+ numero2 + " es: " + resultado );
	}
	sc.close();
	}

}
