package com.ciclos;

import java.util.Scanner;

public class Ciclos2_FAHT {

	public static void main(String[] args) {
		int x;
		Scanner num = new Scanner (System.in);
		 System.out.println("Dame el numero que quieras multiplicar:");
   	 x = num.nextInt();

   	int y;
	Scanner ite = new Scanner (System.in);
	 System.out.println("Dame el numero de iteraciones que necesitas:");
	 y =ite.nextInt();
	 
	 for (int i = 1; i <=y; i++) {
			int w = x * i;
			System.out.println(x+" x "+i+" = "+w);
		}
	 
	}//end

}
