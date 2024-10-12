package com;

import java.util.Scanner;//Clases importadas de otros paquetes en los casos que se requieran
						//.util.* (importar unicamente las clases necesarias) 

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Existen varias maneras de introducir datos por teclado
		//Recuadros JOPtionPane
		//La forma más práctica y utilizada es con la clase Scanner
		
		/*
		int edad; //Declaro una variable tipo entero
		
		//Necesitamos una variable u objeto de la clase Scanner para introducir el valor
		Scanner entrada= new Scanner(System.in);
		
		//Asignamos valor que se guarde en entrada hacia edad
		//Primero enviamos una impresion de consola para solicitar datos
		System.out.println("Introduce tu edad: ");
		edad = entrada.nextInt();

		System.out.println("El siguiente año tendrás: " + (edad+1) + " años");
		
		System.out.println("Introduce un nombre: ");
		//String nombre = entrada.next();
		//Para almacenar más de una palabra podemos utilizar
		entrada.nextLine(); //Consume el espacio generado por println (salto de linea)
							//y que no lo interprete como ingreso de dato
		String nombre = entrada.nextLine(); //Almacena más de una palabra
		
		//Para ya no seguir introduciendo valores a scanner se puede cerrar con:
		entrada.close();
		System.out.println("Hola Bienvenido " + nombre);
		*/
		
		/*
		int numero = 19;
		//Clase Math para utilizar funciones matematicas
		System.out.println("La raiz de " + numero + " es: ");
		System.out.println(Math.sqrt(numero)); //con la clase math solicito la raíz de número
		//Imprimir en pantalla con cierto formato
		System.out.printf("%.4f",Math.sqrt(numero)); //%.xf (aquí elegimos la cantidad de decimales)
		//Se pueden buscar los diferentes formatos para mostrar la info según convenga
		*/
	
		//Operador de modulo
		int x=10;
	
		int resultado= x%3; // Operador modulo % nos arroja el residuo 
							//de una operación o división de números enteros
	
		System.out.println(resultado);

	}

}
