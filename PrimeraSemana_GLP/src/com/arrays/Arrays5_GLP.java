package com.arrays;

public class Arrays5_GLP {

	public static void main(String[] args) {
		//5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.

		String[] productos = {"Coca","Galletas","Cafe","Cereal","Avena"};
		int[] precios = {15,18,20,80,20};
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Producto: "+productos[i]+" --- Precio: "+precios[i]);
		}
	}

}
