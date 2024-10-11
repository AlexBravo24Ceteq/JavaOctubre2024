package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Esta estructura pasandel concepto de almacenar datos en forma lineal 
		//a almacenarlos en una estructura como de una tabla al agregar
		// otra dimension
		// a esta se le puede conocer como matriz
		
		//declarar un array de dos dimensiones iniciandolo con su tamaño
		
		int [] [] matriz = new int [3]  [3]; // [filas]  [columnas]
		
		//para llenar cada espacio de la matriz 
		//tenemos que llenar ambas dimensiones
		
		matriz [0] [0]=10;
		matriz [0] [1]=11;
		matriz [0] [2]=12;  //[10]  [11]  [12]
		
		matriz [1] [0]=13;
		matriz [1] [1]=14;
		matriz [1] [2]=15;  //[13]  [14]  [15]
		
		matriz [2] [0]=16;
		matriz [2] [1]=17;
		matriz [2] [2]=18;  //[16]  [17]  [18]
		
		// ej. de una matriz o array de dos dimensiones ya con sus valores
		//asignados dede un inicio
		int [][] matriz2 = {{11,12,13},{14,15,16},{17,18,19}};
		
		//ej. de como recorrer un array de dos dimensiones con ciclos for anidados
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();
		}
		
	}//end
}
