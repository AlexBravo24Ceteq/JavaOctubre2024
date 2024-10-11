package com.arrays;

public class Arrays4_FOD {

	public static void main(String[] args) {

		int[] entrada = {1,2,3,4,5};
		int[] salida = new int[entrada.length];
		
		
		for (int i = 0; i < entrada.length; i++) {
			salida[i] = entrada[entrada.length - 1 - i];
			System.out.print(entrada[i]);
		}
		
		System.out.println("\nArreglo invertido");
		for (int j = 0; j < salida.length; j++) {
			System.out.println(salida[j] + " ");
		}
	}

}
