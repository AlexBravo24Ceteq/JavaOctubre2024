package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		//Esta estructura pasa del concepto de almacenar datos en forma lineal
		//a almacenarla en una estructura como de tabla al agregar otra dimension.
		//Se le puede conocer como matriz.
		
		//Array  de dos dimensiones:
		int [] [] matriz = new int [3] [3]; //[filas] [columnas]
		
		//Para llenar cada espacio de la matriz, se llaman ambas dimensiones
		
		matriz [0][0] = 10;
		matriz [0][1] = 11;
		matriz [0][2] = 12; //[10][11][12]
		
		matriz [1][0] = 13;
		matriz [1][1] = 14;
		matriz [1][2] = 15; //[13][14][15]
		
		matriz [2][0] = 16;
		matriz [2][1] = 17;
		matriz [2][2] = 18; //[16][17][18]
		
		//Ej. Matriz o array de dos dimensiones con valores asignados
		
		int [] [] matriz2 = {{11,12,13},{14,15,16},{17,18,19}};
		
		//Ej. Como recorrer una matriz con cliclos for anidados
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
