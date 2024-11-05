package com;

import java.util.Scanner; //en linea 3 se ve reflejada
//las clases que importamosde otros paquetes 

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Existen varias maneras de introducir datos por teclado
		/*Existen los recuadros como JOPtionPane
		 * Pero la forma más practica y utilizada es clase Scanner
		 */

		//Ej. vamos a introduccir un valor numérico entero, por ejemplo
		// nuestra edad atravez del teclado
		
		//Necesitaremos una variable de tipo entero para almacenar dicho valor
		
//		int edad;
//		
//		//Necesitamos una variable u objeto de la clase Scanner
//		//para poder introducir el valor de la edad
//		Scanner entrada = new Scanner (System.in);
//		
//		//Como vamos a guardar o teclear un num entero, vamos a asignar
//		//lo que se guarde en entrada a edad
//		//antes de que se ejecute el Scanner para recibir la edad
//		//podemos enviar yba imoresion que nos diga que esta solicitando
//		System.out.println("Introduce tu edad");
//		edad = entrada.nextInt();
//		
//		//una vez almacenada la edad podemos desidir que hacer con el valor
//		//ejemplo; mandar un mensaje con la edad que tendras el proximo año
//		System.out.println("el siguiente año tendras "+(edad+1)+" años");
//		
//		//que ocurre si quiero un nombre para guardarlo en un String
//		//Podemos utilizar el mismo Scanner para seguir recibiendo valores
//		System.out.println("Hola, introduce un nombre");
//		//String nombre = entrada.next();
//		//Si queremos poner un nombre mas grande podemos usar lo siguiente
//		//debo consumir el espacio de liena que dejo la anterior accion
//		entrada.nextLine();
//		String nombre = entrada.nextLine();
//		// Si ya no quiero seguir introducciendo valores con mi Scanner
//		//puedo cerrarlo con el siguiente metodo
//		entrada.close();
//		
//		System.out.println("Hola, bienvenido " + nombre);
		
//		int numero = 19;
//		
//		//tambien contamos con una clase llamada Math que nos
//		// da funciones matemáticas
//		System.out.println("La raiz de  " + numero + " Es: ");
//		//System.out.println(Math.sqrt(numero));
//		//para imprimir con cierto formato se usa System.out.printf
//		// Se pueden ir buscando los diferentes formatos para mostrar
//		//la información segun nos convenga
//		System.out.printf("%.2f",Math.sqrt(numero));
		
		//Operador modulo %
		//Nos sirve para devolver el valor del residup de una división
		
		int x = 10;
		
		int resultado = x%3;
		
		System.out.println(resultado);	
				
		
	}

}
