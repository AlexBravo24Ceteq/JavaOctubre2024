package com.condicionales;

import java.util.Scanner;

public class Condicionales3_OHH {

	public static void main(String[] args) {
//		3.Crea un programa que pida al usuario dos n�meros y muestre el resultado
//		de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		int numeroUno, numeroDos, resultado;
		Scanner entradaDatos =  new Scanner(System.in);
		
		System.out.println("Ingresa el primer n�mero: ");
		numeroUno =  entradaDatos.nextInt();
		System.out.println("Ingresa el segundo n�mero: ");
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
