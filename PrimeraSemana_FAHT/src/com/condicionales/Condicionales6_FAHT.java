package com.condicionales;

import java.util.Scanner;

public class Condicionales6_FAHT {

	public static void main(String[] args) {
		int x;
		Scanner ALUMNOS = new Scanner (System.in);
		 System.out.println("Número de alimnos que iran de viaje: ");
    	 x = ALUMNOS.nextInt();
    	 
    	 double costoalumno;
    	 double totalpago;
    	 
    	 if (x >= 100) {
    		 costoalumno =65;
    		 totalpago= costoalumno * x;
    	 } else if (x >=50) {
    		 costoalumno =70;
    		 totalpago= costoalumno * x;
    	 } else{
    		 costoalumno =4000/x;
    		 totalpago= 4000;
    	 }
    	System.out.println("el costo por alumno es " + costoalumno);
    	System.out.println(" El total a pagar es "+ totalpago);
    	 
	}//end

}
