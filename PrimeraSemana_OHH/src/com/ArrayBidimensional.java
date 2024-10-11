package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
//		Iniciando un array bidimensional
		
		int [][] matriz = new int[3][3];
//		int matriz2[][] = new int[3][3];
//		fila 1
		matriz[0][0] = 10;
		matriz[0][1] = 11;
		matriz[0][2] = 12;
//		fila 
		matriz[1][0] = 13;
		matriz[1][1] = 14;
		matriz[1][2] = 15;
//		fila 3
		matriz[2][0] = 16;
		matriz[2][1] = 17;
		matriz[2][2] = 18;
		
		int [][] matriz2 = {{10,11,12}, {13,14,15}, {16,17,18}};
		
//		recorriendo la matriz
		
		for(int i = 0; i< 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
