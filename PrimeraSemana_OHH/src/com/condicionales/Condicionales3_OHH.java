package com.condicionales;

import java.util.Scanner;

public class Condicionales3_OHH {

	public static void main(String[] args) {
//		3.Crea un programa que pida al usuario dos números y muestre el resultado
//		de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int numeroUno, numeroDos, resultado;
		Scanner entradaDatos =  new Scanner(System.in);
		
		System.out.println("Ingresa el primer número: ");
		numeroUno =  entradaDatos.nextInt();
		System.out.println("Ingresa el segundo número: ");
		numeroDos =  entradaDatos.nextInt();
		entradaDatos.close();
		
		if(numeroDos == 0) {
			System.out.println("error");
		}else {
			resultado = numeroUno / numeroDos;
			System.out.println("El resultados es " + resultado);
		}
	}

}
