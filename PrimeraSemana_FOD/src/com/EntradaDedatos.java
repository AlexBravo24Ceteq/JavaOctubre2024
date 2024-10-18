package com;

import java.util.Scanner;// en estas lineas se ve reflejada los paquetes que se importan 

public class EntradaDedatos {

	public static void main(String[] args) {

		//Existen varias maneras de introducir datos por teclado 
		//JOptionPane
		//la forma mas utilizada es con la clase Scanner
		
		/*
		 * vamos a intruducir un valor numero entero 
		 * nuestra edad a traves del teclado 
		 * nesecitamos una variable para intrucducir el valor de la edad
		 */
		/*
		int edad;
		//necesitamos un objeto de tipo scanner
		//para poder introducir el valor de la edad
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		edad = entrada.nextInt();
		System.out.println("Tu edad es: " + edad + " años");
		System.out.println("El siguiente año tendras: " + (edad + 1) + " años");
		
		/*que ocurre si quiero ahora teclear un nombre
		 * de manera String 
		 * podemos utilizar el mismo scanner para seguir reciviendo valores 
		 * 
		 */
		/*
		System.out.println("introduce un nombre: ");
		/*la forma en la que se introduce un solo nombre es con .next();
		 * pero consume un espacion si dejarnoos segir con la
		 */
		/*
		entrada.nextLine();
		String nombre = entrada.nextLine();
		/*si ya no requiero utilizar 
		 * la variable entrada
		 * la terminamos con el siguiente methodo
		 *//*
		entrada.close();
		System.out.println("Hola bienvenido " + nombre);
		*/
		int numero = 19;
		//tambien contamos con una clse llamada math que nos puede proporcionar 
		//funciones matematicas
		System.out.println("La raiz cuadrada de " + numero + " es: ");
		System.out.println(Math.sqrt(numero));
		//se puede ir mostrando los siguienetes formatos para mostrar la info segun nos convenga 
		System.out.printf("%.2f",Math.sqrt(numero));// con formato de dos decimales utilizando printf
		System.out.println();
		//Operador modulo % -> sirve para devolver el valor del reciduo de una divicion
		int x = 10;
		int result = x/2;
		int resuido = x%2;// el porcentaje nos muestra el reciduo de la operacion
		System.out.println("resultado: " + result);
		System.out.println("resuido: " + resuido);
	
	}

}
