package com.condicionales;

import java.util.Scanner;

public class Condicionales2_GLP {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        System.out.print("Ingresa un n�mero: ");
	        int numero = entrada.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("El n�mero " + numero + " es par.");
	        } else {
	            System.out.println("El n�mero " + numero + " es impar.");
	        }

	        entrada.close();
	    }

	}

