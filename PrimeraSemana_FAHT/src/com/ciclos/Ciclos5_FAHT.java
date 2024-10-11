package com.ciclos;

public class Ciclos5_FAHT {

	public static void main(String[] args) {
		double capital=1000;
		double tasainteres=2;
		int meses =12;
		
		 for (int i = 1; i <=meses; i++) {
				double result= capital* Math.pow(1+(tasainteres/100), i);
				System.out.println(" Mes: "+i+" Ganancia = "+result);
		 }
	}

}
