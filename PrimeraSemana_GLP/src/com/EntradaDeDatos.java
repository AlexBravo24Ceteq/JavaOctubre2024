package com;

import java.util.Scanner;//aqui en la linea 3 se ven reflejadas las clases de otros paquetes

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Existen varias maneras de introducir datos por teclado
		//Existen los recuadros como JOPtionPane
		//Pero la forma mas practica y utilizada es con la clase Scannes
		
		//Ej. Vamos a introducir un valor numerico entero, por ejemploi
		//nuetsra edad atraves del teclado
		
		//Necesitaremos una variable de tipo entero donde poder almacenar dicho
		//Valor
		
		int edad;
		
		//Necesitamos una varibale u objeto de la clase Scanner
		//para poder introducir el valor de la edad
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Intreoduce tu edad");
		
		edad = entrada.nextInt();
		
		System.out.println("El siguente a;o tendras "+ (edad+1));
		
		//Que ocurre si quiero ahora telcar un nombre para guardarlo
		//en String, pordemo utilizar Scanner
		
		System.out.println("Introduce un nombre");
		String nombre = entrada.nextLine();
		//entrada.close();//se cierra entrada(scanner)
		
		System.out.println("Binevenido "+nombre);

	}

}
