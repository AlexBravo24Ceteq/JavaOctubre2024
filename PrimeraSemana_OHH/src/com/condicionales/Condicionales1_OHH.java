package com.condicionales;

import java.util.Scanner;

public class Condicionales1_OHH {

	public static void main(String[] args) {
		
//		1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es
//		mayor o si son iguales.
		
		int numeroUno, numeroDos;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa el primer n�mero: ");
		numeroUno =  entradaDatos.nextInt();
		System.out.println("Ingresa el segundo n�mero: ");
		numeroDos =  entradaDatos.nextInt();
		entradaDatos.close();
		
		if(numeroUno > numeroDos) {
			System.out.println("El numero uno: "+ numeroUno +" es mayor a " + numeroDos);
		}else if(numeroUno < numeroDos) {
			System.out.println("El numero dos: "+ numeroDos +" es mayor a " + numeroUno);
		}else {
			System.out.println("Los n�meros son iguales: " + numeroUno +" y " + numeroDos);
		}

 	}

}
