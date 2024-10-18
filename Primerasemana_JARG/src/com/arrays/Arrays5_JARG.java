package com.arrays;

public class Arrays5_JARG {

	public static void main(String[] args) {
		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.
		
		String [] productos = {"Pollo", "Huevo", "Tortillas", "Aceite", "Papel"};
		int[] precio = {40,50,17,35,40};
		System.out.println("Productos & Precios; ");
		System.out.println(" ");
		for (int i = 0; i < precio.length; i++) {
			System.out.println(productos [i]+"----> $"+ precio[i]);
			}
	}

}
