package com.condicionales;

import java.util.Scanner;

public class Condicionales7_FAHT {

	public static void main(String[] args) {
		int x;
		Scanner caraon = new Scanner (System.in);
		 System.out.println("Dame el valor del dado");
   	 x = caraon.nextInt();
   	 
   	 if (x==1) {
   		 System.out.println("La cara opuesta es: "+ 6);
   	 } else if (x==2) {
   		System.out.println("La cara opuesta es: "+ 5);
   	 }else if (x==3) {
    		System.out.println("La cara opuesta es: "+ 4);
   	}else if (x==4) {
		System.out.println("La cara opuesta es: "+ 3);
   	}else if (x==5) {
		System.out.println("La cara opuesta es: "+ 2);
   	}else if (x==6) {
		System.out.println("La cara opuesta es: "+ 1);
   	}else  {
		System.out.println("Error: numero incorrecto");
   	}

	}//end

}
