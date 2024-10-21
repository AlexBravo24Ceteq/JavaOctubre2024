package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cientifica casio =  new Cientifica("Casio", "Negro", 526.80, true);
		Scanner entradaOpcion = new Scanner(System.in);
		String mensaje = "Ingresa el numero de la operación que deseas realizar\n1. Sumar \n2. Restar \n3. Dividir \n4. Multiplicar \n5. Salir";
		double numero1 = 0;
		double numero2 = 0;
		double numero3 = 0;
		double resultado;
		int opcion = 0;
		
		do {
			System.out.println(mensaje);
			opcion =  entradaOpcion.nextInt();
			switch (opcion) {
			case 1:
				do {
					System.out.println("SUMAR \n1. Dos números \n2. Tres números \n3. Salir al menú principal");
					opcion = entradaOpcion.nextInt();
					switch (opcion) {
					case 1:
						resultado = casio.sumar(numero1, numero2);
						System.out.println("La suma de dos números es = " + resultado);
						break;
					case 2:
						resultado = casio.sumar(numero1, numero2, numero3);
						System.out.println("La suma de tres números es = " + resultado);
						break;
					case 3:
						System.out.println("Saliendo al ménu principal");
						break;
					default:
						System.out.println("Ingresa una opción valida");
						break;
					}
				} while (opcion != 3);
				break;
			case 2:
				do {
					System.out.println("RESTAR \n1. Dos números \n2. Tres números \n3. Salir al menú principal");
					opcion = entradaOpcion.nextInt();
					switch (opcion) {
					case 1:
						resultado = casio.restar(numero1, numero2);
						System.out.println("La resta de dos números es = " + resultado);
						break;
					case 2:
						resultado = casio.restar(numero1, numero2, numero3);
						System.out.println("La resta de tres números es = " + resultado);
						break;
					case 3:
						System.out.println("Saliendo al ménu principal");
						break;
					default:
						System.out.println("Ingresa una opción valida");
						break;
					}
				} while (opcion != 3);
				break;
			case 3:
				do {
					System.out.println("DIVIDIR \n1. Dos números \n2. Tres números \n3. Salir al menú principal");
					opcion = entradaOpcion.nextInt();
					switch (opcion) {
					case 1:
						resultado = casio.dividir(numero1, numero2);
						System.out.println("La división de dos números es = " + resultado);
						break;
					case 2:
						resultado = casio.dividir(numero1, numero2, numero3);
						System.out.println("La división de tres números es = " + resultado);
						break;
					case 3:
						System.out.println("Saliendo al ménu principal");
						break;
					default:
						System.out.println("Ingresa una opción valida");
						break;
					}
				} while (opcion != 3);
				break;
			case 4:
				do {
					System.out.println("MULTIPLICAR \n1. Dos números \n2. Tres números \n3. Salir al menú principal");
					opcion = entradaOpcion.nextInt();
					switch (opcion) {
					case 1:
						resultado = casio.multiplicar(numero1, numero2);
						System.out.println("La multiplicación de dos números es = " + resultado);
						break;
					case 2:
						resultado = casio.multiplicar(numero1, numero2, numero3);
						System.out.println("La multiplicación de tres números es = " + resultado);
						break;
					case 3:
						System.out.println("Saliendo al ménu principal");
						break;
					default:
						System.out.println("Ingresa una opción valida");
						break;
					}
				} while (opcion != 3);
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no valida, vuelve a ingresar otra opción");
				System.out.println("***********************************************");
				System.out.println();
				break;
			}
		} while (opcion != 5);
		entradaOpcion.close();
	}

}
