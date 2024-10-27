package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		int x = 12;
		
		if (x <= 12) {
			System.out.println("verdadero");
		}else {
			System.out.println("Falso");
		}
		
		// &&
		if (x < 12 || x == 12) {
			System.out.println("verdadero");
		}else {
			System.out.println("Falso");
		}
	}

}
