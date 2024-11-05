package com;

public class ArrayBidimencional {

	public static void main(String[] args) {

		//Esta estructura pasa del concepto de almacenar datos de forma lineal a lamacenarlos 
		//en una estructura como de una tabla al agregar otra dimencion 
		//a esta se le puedeconocer tambien como matriz
		
		//declarar un array de dos dimenciones iniciandolo con su tamaño
		
		int [][] matriz = new int[3][3];// hace reprecentacion a un plano carteciano 
		//para llenar cada uno de los espacios de la matriz
		//tenemos que llamar a ambas dimenciones
		
		matriz [0][0] = 10;
		matriz [0][1] = 11;
		matriz [0][2] = 12;
		
		matriz [1][0] = 13;
		matriz [1][1] = 14;
		matriz [1][2] = 15;
		
		matriz [2][0] = 16;
		matriz [2][1] = 17;
		matriz [2][2] = 18;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println("----- segunda ejecucion -----");
		
		//ejemplo de una de dos dimenciones ya con susu valores indicados desde un inicio
		
		int [][] matriz2 = {{11,12,13}, {14,15,16}, {17,18,19}};
		
		//ej. de como recorrer un array de 2 dimenciones con ciclos for anidados
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}

}
