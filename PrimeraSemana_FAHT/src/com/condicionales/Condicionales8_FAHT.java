package com.condicionales;

import java.util.Scanner;

public class Condicionales8_FAHT {

	public static void main(String[] args) {
		System.out.println("Elige un numero del 1 al 7 segun la semana");
		int x;
		Scanner numero = new Scanner (System.in);
		 System.out.println("Dame el valor de tu dia:");
    	 x = numero.nextInt();
    	 
    	 if (x==1) {
    		 System.out.println("Lunes");
    	 } else if (x==2) {
    		 System.out.println("martes");
    	 } else if (x==3) {
    		 System.out.println("miercoles");
    	 } else if (x==4) {
    		 System.out.println("jueves");
    	 } else if (x==5) {
    		 System.out.println("viernes");
    	 } else if (x==6) {
    		 System.out.println("sabado");
    	 } else if (x==7) {
    		 System.out.println("domingo");
    	 } else {
    		 System.out.println("error");
    	 }
	}//end

}
