package com.condicionales;

import java.util.Scanner;

public class Condicionales8_AGAH {
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Programa que determina el dia de la semana...");
	System.out.println("Ingresa el dia de la semana que desea conocer en numero (1-7)");
	int dia=sc.nextInt();
	
	if(dia == 1) {
		System.out.println("El valor ingresado " + dia + " es el dia Lunes..");
	}else if (dia == 2) {
		System.out.println("El valor ingresado " + dia + " es el dia Martes..");
	}else if (dia == 3) {
		System.out.println("El valor ingresado " + dia + " es el dia Miercoles..");
	}else if (dia == 4) {
		System.out.println("El valor ingresado " + dia + " es el dia Jueves..");
	}else if (dia == 5) {
		System.out.println("El valor ingresado " + dia + " es el dia Viernes..");
	}else if (dia == 6) {
		System.out.println("El valor ingresado " + dia + " es el dia Sabado..");
	}else if (dia == 7){
		System.out.println("El valor ingresado " + dia + " es el dia Sabado..");
	}else {
		System.out.println("ERROR... Ese dia no existe..");
	}
}
}
