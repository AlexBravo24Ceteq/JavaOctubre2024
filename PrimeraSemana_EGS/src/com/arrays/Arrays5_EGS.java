package com.arrays;

public class Arrays5_EGS {
	public static void main(String[] args) {
		String [] productos = {"Juego","Leche","Agua","Sabritas","Soda","Pan"};
		double [] precios = {23.5,25.1,10,15,17.5,31.5};
		
		for (int i = 0; i<productos.length; i++)
			System.out.println(" El producto: \"" + productos[i] + "\" tiene un precio de: $" + precios[i]);
	
	}
	
}
