package com;

public class Arraybidimensional {

	public static void main(String[] args) {
		// Esta estructura pasa del concepto de almacenar datos en forma lineal
		//a almacenarlos en una estructura como d euna tabla al agregar otra dimension
		//a esta se le puede conocer tambien como matriz
		
		//Declarar un array de dos dimensiones iniciando con su tamaño
		
		int [] [] matriz = new int [3] [3];
		
		//Para llenar cada uno de los espacios de la matriz
		//tenemos que lla,ar a ambas dimensiones
		
		matriz[0][0]=10;
		matriz[0][1]=11;
		matriz[0][2]=12;
		
		matriz[1][0]=13;
		matriz[1][1]=14;
		matriz[1][2]=15;
		
		matriz[2][0]=16;
		matriz[2][1]=17;
		matriz[2][2]=18;
		
		//Ej. de una matriz o array de dos dimensiones va con sus valores
		//asignados desde un incio
		
		int [] [] matriz2 = {{11,12,13},{14,15,16},{17,18,19}};
		
		//Ej. como recorrer un array de dos dimensiones con ciclos for anidados
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j]+" ");
				
			}
			
		}
	}

}
