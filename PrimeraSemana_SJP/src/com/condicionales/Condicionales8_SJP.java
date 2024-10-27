package com.condicionales;

import java.util.Scanner;

public class Condicionales8_SJP {
	//EJERCICIO 8:
	//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
	//correspondiente. Si introducimos otro número nos da un error.
	
	public static void main(String[] args) {
			Scanner diaSemana = new Scanner(System.in);
		    int dia;
		    System.out.println("DIAS DE LA SEMANA");
		    System.out.println("1.- Lunes.");
		    System.out.println("2.- Martes.");
		    System.out.println("3.- Miércoles.");
		    System.out.println("4.- Jueves.");
		    System.out.println("5.- Viernes.");
		    System.out.println("6.- Sábado.");
		    System.out.println("7.- Domingo.");
		    System.out.println("Introduce un número para saber a que día corresponde: ");
		    dia=diaSemana.nextInt();
		   
		    System.out.println("El día seleccionado es: ");
		    switch (dia) {
		    case 1:
		      System.out.println("LUNES");
		      break;
		    case 2:
		      System.out.println("MARTES");
		      break;
		    case 3:
		      System.out.println("MIÉRCOLES");
		      break;
		    case 4:
		      System.out.println("JUEVES");
		      break;
		    case 5:
		      System.out.println("VIERNES");
		      break;
		    case 6:
		      System.out.println("SÁBADO");
		      break;
		    case 7:
		      System.out.println("DOMINGO");
		      break;
		    default:
		      System.out.println("ERROR: número incorrecto.");
		    }	
		 
	}

}
