package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
//		Esta estructura pasa del concepto de almacenar datos en forma lineal
//		a almacenarlos en una estructura como de una tabla al agregar otra dimension
//		a esta se le puede conocer también como matriz
		
		int [][] matriz = new int [2][2];
		matriz[0][0] = '*';
		matriz[0][1] = '*';
		matriz[1][0] = '*';
		matriz[1][1] = '*';
		
		for(int i = 0; i< matriz.length; i++) {
			for( int j = 0; j< matriz.length; j ++) {
				System.out.printf("[%c] ", matriz[i][j]);
			}
			System.out.println();
		}

	}

}
