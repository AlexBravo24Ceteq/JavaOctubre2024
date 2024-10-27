package com.arrays;

import java.util.Scanner;

public class Arrays5_AGAH {

	public static void main(String[] args) {
		/*
		 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
respectivos precios. Muestra en consola la lista de productos y sus precios. 
Por lo menos 5 productos o artículos.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cuantos productos va agregar:");
		int cuantos = sc.nextInt();
		sc.nextLine();
		String [] pro = new String [cuantos];
		Double [] pre = new Double [cuantos];	
        int i = 0;
		
		for ( i = 0; i < cuantos; i++) {
			
			System.out.println("Ingrese el nombre del producto " + (i+1) +" : ");
			pro[i] = sc.nextLine();
			System.out.println("Ingrese el costo del producto " + (i+1) );
			pre[i] = sc.nextDouble();
			sc.nextLine();
			}
		for (i = 0; i < cuantos; i++) {
			
			System.out.println("El producto "+ pro[i] + " tiene un costo de: " + pre[i]);
			
		}
		
	}

}
