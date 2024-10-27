package com.arrays;

import java.util.Scanner;

public class Arrays5_DCGG {

	public static void main(String[] args) {
//		5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios.
//		Muestra en consola la lista de productos y sus precios.
//		Por lo menos 5 productos o artículos.
		try(Scanner entrada = new Scanner(System.in)){ // aquí creo mi objeto Scanner
		
		System.out.println("Programa para ingresar productos y precios");
		System.out.println("¿Cuantos productos desea ingresar?: ");
		int noProductos = entrada.nextInt();
		entrada.nextLine();
		
		String [] productos = new String[noProductos];
		float [] precios = new float[noProductos];
		int i = 0;
		
		for(i=0; i<noProductos; i++) {
			System.out.printf("Ingresa el Nombre del producto[%d]: \n",i+1);
			productos[i] = entrada.nextLine();
			System.out.printf("Ingresa el $precio del producto[%d]: \n",i+1);
			precios[i] = entrada.nextFloat();
			entrada.nextLine();
		}
		
		
		for(i = 0; i < noProductos; i++) {
			System.out.printf("El producto [%s] tiene el precio de: $%.2f \n",productos[i],precios[i]);
		}
		
//		entrada.close(); // <---- aqui cierro mi objeto Scanner
		}
	}

}
