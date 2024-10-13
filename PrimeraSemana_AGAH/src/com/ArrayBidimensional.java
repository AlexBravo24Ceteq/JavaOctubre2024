package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Esta estructura pasa del concepto de almacenar datos en forma lineal
		//a almacenarlos en una estructura como de una tabla al agregar otra dimension
		//A esta se le puede conocer tambien como matriz
		
		
		//Como declarar un array de 2 dimensiones iniciando con su tamaño
		
		int [] [] matriz = new int [3] [3]; //[FILA] [COLUMNOAS]
		
		//Para llenar cada uno de los espacios de la matriz 
		//tenemos que llamar a ambas dimensiones
		
		matriz [0] [0] =10; //[10] [11] [12]
		matriz [0] [1] =11;
		matriz [0] [2] =12;	
		
		matriz [1] [0] =13; //[10] [11] [12]
		matriz [1] [1] =14; //[13] [14] [15]
		matriz [1] [2] =15; 
							
		
		matriz [2] [0] =16; //[10] [11] [12]
		matriz [2] [1] =17; //[13] [14] [15]
		matriz [2] [2] =18; //[16] [17] [18]
		
		//E. de una matriz o array de dos dimensiones ya con sus valores 
		//asignados desde el inicio
		
		int [] [] matriz2 = {{10,11,12},{13,14,15},{16,17,18}};
		
		//Ej. de como reecorrer un array de 2 dimensiones o ciclos for anidados 
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
