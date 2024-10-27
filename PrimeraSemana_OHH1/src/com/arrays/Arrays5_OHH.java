package com.arrays;

public class Arrays5_OHH {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos 
		// y otro para mostrar sus respectivos precios. 
		// Muestra en consola la lista de productos y sus precios. 
		// Por lo menos 5 productos o artículos.
		
		String [] produto = {"Arroz", "Leche", "Sopa", "Gelatina", "Pan"};
					
		int [] precio = {100, 200, 300, 400, 500};

		System.out.println("Producto   --   Precio");
		for(int i=0; i<precio.length; i++) {
			System.out.println(produto[i]+" --S "+precio[i]);	
		}
			
			
			
			
			
			
		
	}

}
