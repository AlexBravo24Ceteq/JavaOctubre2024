package com.condicionales;

import java.util.Scanner;

public class Condicionales8_SJP {
	//EJERCICIO 8:
	//Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
	//correspondiente. Si introducimos otro n�mero nos da un error.
	
	public static void main(String[] args) {
			Scanner diaSemana = new Scanner(System.in);
		    int dia;
		    System.out.println("DIAS DE LA SEMANA");
		    System.out.println("1.- Lunes.");
		    System.out.println("2.- Martes.");
		    System.out.println("3.- Mi�rcoles.");
		    System.out.println("4.- Jueves.");
		    System.out.println("5.- Viernes.");
		    System.out.println("6.- S�bado.");
		    System.out.println("7.- Domingo.");
		    System.out.println("Introduce un n�mero para saber a que d�a corresponde: ");
		    dia=diaSemana.nextInt();
		   
		    System.out.println("El d�a seleccionado es: ");
		    switch (dia) {
		    case 1:
		      System.out.println("LUNES");
		      break;
		    case 2:
		      System.out.println("MARTES");
		      break;
		    case 3:
		      System.out.println("MI�RCOLES");
		      break;
		    case 4:
		      System.out.println("JUEVES");
		      break;
		    case 5:
		      System.out.println("VIERNES");
		      break;
		    case 6:
		      System.out.println("S�BADO");
		      break;
		    case 7:
		      System.out.println("DOMINGO");
		      break;
		    default:
		      System.out.println("ERROR: n�mero incorrecto.");
		    }	
		 
	}

}
