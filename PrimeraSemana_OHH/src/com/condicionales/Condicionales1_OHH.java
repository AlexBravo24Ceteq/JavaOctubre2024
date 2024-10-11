package com.condicionales;

import java.util.Scanner;

public class Condicionales1_OHH {

	public static void main(String[] args) {
		
//		1.Realiza un programa que reciba dos números por teclado e indique cuál es
//		mayor o si son iguales.
		
		int numeroUno, numeroDos;
		Scanner entradaDatos = new Scanner(System.in);
		
		System.out.println("Ingresa el primer número: ");
		numeroUno =  entradaDatos.nextInt();
		System.out.println("Ingresa el segundo número: ");
		numeroDos =  entradaDatos.nextInt();
		entradaDatos.close();
		
		if(numeroUno > numeroDos) {
			System.out.println("El numero uno: "+ numeroUno +" es mayor a " + numeroDos);
		}else if(numeroUno < numeroDos) {
			System.out.println("El numero dos: "+ numeroDos +" es mayor a " + numeroUno);
		}else {
			System.out.println("Los números son iguales: " + numeroUno +" y " + numeroDos);
		}

 	}

}
