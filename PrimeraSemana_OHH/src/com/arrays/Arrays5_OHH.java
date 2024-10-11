package com.arrays;

public class Arrays5_OHH {
	public static void main(String[] args) {
//		5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
//		respectivos precios. Muestra en consola la lista de productos y sus precios.
//		Por lo menos 5 productos o artículos.
		
		String []productos = {"taza", "plato", "cuchara", "vaso", "sarten"};
		int []precio = {20, 25, 10, 15, 120};
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Producto: "+ productos[i] + " precio $" + precio[i]);
		}
	}
}
