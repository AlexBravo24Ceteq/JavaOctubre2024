package com.ciclos;

public class Ciclos5_SJP {

	public static void main(String[] args) {
		//EJERCICIO 6

		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		//todo el dinero lo reinvierte?

		float dinero = 1000; //El dinero a invertir
		int mes = 1; 
				 
		while (mes<=12) { //Es a un a�o, por eso se coloca 12 meses 
			dinero = (float)(dinero*1.02);//Operaci�n del dinero 
			mes++; }
			System.out.printf("El dinero ahorrado es: $" + dinero);
			}
	}

