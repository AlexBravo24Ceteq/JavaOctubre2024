package com.arrays;

public class Array5_SJP {

	public static void main(String[] args) {
		//EJERCICIO 5
		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.
		
		String [] productos = {"Playera","Pantalon","Tenis","Gorra","Chamarra"};
		int [] precios = {500,800,1600,250,1850};
		 
		System.out.println("Lista de productos y sus precios: ");
		 
		for(int i=0; i < productos.length; i++) {
			System.out.println(productos[i] + ": $" + precios[i]);
		  } 
	}
}
