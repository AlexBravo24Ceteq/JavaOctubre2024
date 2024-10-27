package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos numeros desea utilizar? (2 o 3):"); 
		
		int cantiNum = entrada.nextInt();
		
		int num1=0, num2=0, num3=0;
		
		System.out.println("ingrese el primer numero");
		num1=entrada.nextInt();
		
		System.out.println("ingrese el segundo numero");
		num2=entrada.nextInt();
		
		if (cantiNum == 3) {
			System.out.println("Ingresa el tercer numero");
			num3=entrada.nextInt();
		}

		Cientifica calcuadora = new Cientifica("Casio", "Negro Mate", false, 1, 2, 3);
		
		System.out.println("Seleccione la operacion que desea realizar: ");
		System.out.println("1. Sume");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		
		int opcion = entrada.nextInt();
		
		switch (opcion) {
		case 1:
			if (cantiNum == 2) {
				calcuadora.sumar(num1, num2);
			}else {
				calcuadora.sumar(num1, num2, num3);
			}
			break;
		case 2:
			if (cantiNum == 2) {
				calcuadora.restar(num1, num2);
			}else {
				calcuadora.restar(num1, num2, num3);
			}
			break;
		case 3:
			if (cantiNum == 2) {
				calcuadora.multiplicar(num1, num2);
			}else {
				calcuadora.multiplicar(num1, num2, num3);
			}
			break;
		case 4:
			if (cantiNum == 2) {
				calcuadora.dividir(num1, num2);
			}else {
				calcuadora.dividir(num1, num2, num3);
			}
			break;

		default:
			System.out.println("Opcion no valida");
			break;
		}
		
		System.out.println(calcuadora);
		calcuadora.tomarTemperatura();
		entrada.close();

	}

}
