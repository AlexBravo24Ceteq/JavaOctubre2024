package com.ciclos;

import java.util.Scanner;

public class Ciclos6_SJP {
		public static void main(String[] args) {
		//EJERCICIO 6:
		//Dibuja un cuadrado, como en la imagen que acompa�a, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8 
		
	 int tama�o;
	 System.out.println("Ingrese el tama�o del cuadrado: ");
	 Scanner entrada= new Scanner(System.in);
	 tama�o = entrada.nextInt();
	 System.out.println("Cuadrado: " + tama�o + "x" + tama�o);
	 if(tama�o >=2 && tama�o <=20) {
	     for(int l1=0; l1 < tama�o; l1++) {
	    	 for(int l2 = 0; l2 < tama�o ; l2++) {
	    	 System.out.print(" * "); 	   }
	    System.out.println(" "); }	//Salto de linea
	 }
	
	}
}
