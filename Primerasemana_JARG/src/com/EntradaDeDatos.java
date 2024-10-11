package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Existen varias maneras de introducir datos por teclado
		//Existen los recuadros como JOPtionPnae
		//Pero la forma mas practica y utilizada es la clase Scanner
		
		//Ej. Vamos a introducir un valor numerico entero, por ejemplo
		//nuestra edad a traves del teclado
		
		//Necesitamos una variable de tipo entero donde poder almacenar
		//valor
		/*
		int edad;
		
		//Necesitamos una variable u objeto de la clase Scanner
		//para poder introducir el valor de la edad
		
		Scanner entrada = new Scanner(System.in);
		
		//Como vamos a guardar o teclear un numero entero
		//necesitamos asignar lo que se guaarde en entrada hacia edad
		//Antes de que se ejecute el Scanner para recibir la edad
		//podemos enviar una impresion en consola que nos diga que se esta 
		//solicitando
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		
		//Una vez que se almacena la edad podemos decidir que hacer con ese valor
		//Ej. mando otra impresion en consola qque muestre un msj con la edad
		//que tendre el sig. año
		System.out.println("El siguiente año tendras " + (edad+ 1) + " años");
		
		//Que ocurre si quiero ahora teclear un nombre para guardarlo en un String
		//Podemos utilizar el mismo Scanner para seguir recibiendo valores
		System.out.println("Introduce tu nombre");
		//String nombre = entrada.next();
		//Si queremos recibir una frase completa o dos nombres lo hacemos con
		//.nextLine()
		entrada.nextLine();
		String nombre = entrada.nextLine();
		//Si ya no requiero seguir introduciendo valores con mi Scanner
		//puedo cerrarlo con el sig metodo
		entrada.close();
		
		System.out.println("Hola Bienvenido " + nombre);
		*/
		/*
		int numero = 19;
		
		//Tambien contamos con una clase llamada Math que nos puede proporcionar
		//funciones matematicas
		
		System.out.println("La raiz de " + numero + " es: ");
		//System.out.println(Math.sqrt(numero));
		//Para imprimir con cierto formato se utiliza System.out.printf
		//Se pueden ir buscando los diferentes formatos para mostrar la info segun
		//nos convenga
		System.out.printf("%.2f", Math.sqrt(numero));
		*/
		
		//Operador modulo % - sirve para devolver el valor de residuo de una division
		
		int x = 10;
		
		int resultado = x%2;
		
		System.out.println(resultado);
	}

}
