package com;
import java.util.Scanner;

public class EntradaDeDatos {
	public static void main(String[] args) {
		
//		//Existen varias maneras de introducir datos por teclado
//		//Existen los recuadros como JOPtionPane
//		//Pero la dorma mas practica y utilizada es con la clase Scanner
//		
//		//Ej. Vamos a introducir un valor numérico
//		
//		int edad;
//		
//		//Necesitamos una variable u objeto de la clase Scanner
//		//para poder introducir el valor de la edad
//		Scanner entrada = new Scanner(System.in);
//		
//		//Como vamos a guardar o teclear un numero entero
//		//necesitamos asignar lo que se guarde en entrada hacia edad
//		//Antes de que se ejecute el escaner para recibir la edad
//		//Podemos enviar una impresion en consola que nos diga que se está
//		//solicitando
//		System.out.print("Introduce tu edad: ");
//		edad = entrada.nextInt();
//		
//		//Una vez que se almacena la edad podemos efinir que hacer con ese valor
//		//Ej. Mando otra impresion en consola que muestre un mnsj con la edad
//		// que tendra el sig. año
//		System.out.println("El siguiente año tendras: " + (edad+1) + " años");
//		
//		//Que ocurre si ahora quiero teclear un nombre para guardarlo en un String
//		//podemos utilizar el mismo scanner para seguir recibiendo valores
//		
//		System.out.print("Introduce un nombre: ");
//		//String nombre = entrada.next();
//		// Si queremos recibir una frase completa o dos nombres lo hacemos
//		//con .nextLine();
//		//Primero ahora tengo que consumir el escpacio o salto de linea que dejo
//		//la anterior impresion en consola
//		entrada.nextLine();
//		String nombre = entrada.nextLine();
//		
//		//Si ya no quiero seguir introduciendo valores en mi Scanner
//		//Puedo cerrarlo con el sig. metodo
//		entrada.close();
//		
//		System.out.println("Hola Bienvenido: " + nombre);
//		
//		int numero = 19;
//		
//		//Tambien contamos con una clase llamada Math que nos puede proporcionar
//		// funciones matematicas
//		System.out.print("La raiz de " + numero + " es: ");
//		//System.out.println(Math.sqrt(numero));
//		//Para imprimirlo con cierto formato se utiliza System.out.printf
//		System.out.printf("%.4f", Math.sqrt(numero));
		
		//Operador modulo % - sirve para devolver el valor del residuo de una division
		
		int x = 10;
		
		int resultado = x%3;
		
		System.out.println(resultado);
		
		
		
	}

}
