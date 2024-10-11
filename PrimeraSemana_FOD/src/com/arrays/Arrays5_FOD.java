package com.arrays;

public class Arrays5_FOD {

	public static void main(String[] args) {

		String[] productos = {"Laptop", "Mouse", "Teclado", "Pantalla", "MotherBoard"};
		double[] precio = {5000, 150, 400, 1500, 2000};
		
		System.out.println("Lista de productos y sus precios: ");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + " $" + precio[i]);
		}
		
	}

}
