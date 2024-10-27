package com.ciclos;

import java.util.Scanner;

public class Ciclos6_SJP {
		public static void main(String[] args) {
		//EJERCICIO 6:
		//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8 
		
	 int tamaño;
	 System.out.println("Ingrese el tamaño del cuadrado: ");
	 Scanner entrada= new Scanner(System.in);
	 tamaño = entrada.nextInt();
	 System.out.println("Cuadrado: " + tamaño + "x" + tamaño);
	 if(tamaño >=2 && tamaño <=20) {
	     for(int l1=0; l1 < tamaño; l1++) {
	    	 for(int l2 = 0; l2 < tamaño ; l2++) {
	    	 System.out.print(" * "); 	   }
	    System.out.println(" "); }	//Salto de linea
	 }
	
	}
}
