package com.ciclos;

public class Ciclos5_JARG {

	public static void main(String[] args) {
//		Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//		de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
//		tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		
		double d = 1000;
		double res = d * .02;
		double td = 0;
		for (int i = 1; i <=12 ; i++) {
			td = (res + td);
		}
		td = td+d;
		System.out.println("El dinero que tendra con su inversion de: "+d+",sera de: "+td);
	}

}
