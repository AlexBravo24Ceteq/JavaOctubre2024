package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {
		// los comentarios nos sirven para documentar o agregar comentarios al codigo 
		
		/*
		 *comentarios
		 * de 
		 * multiples 
		 * lineas  
		 */
		
		/*
		 * tipos de datos primitivos 
		 * numericos enteros 
		 */
		
		byte numeroByte;// ejemplo de declaracion de variable sin valos asignado
		numeroByte = 127; // valor asignado a la variable 
		//otra forma de asignar el valor a la variable es al inicio 
		byte numeroB = 127;
		short numeroShort = -32768; // valor que emplea de -32768 a 32767 emplea 2 bites
		int numeroInt = 2147483647;// utiliza 4 bites de memoria 
		long numeroLong = 2147483649L;// ocupa 8 bites de memoria y nesecita elsufijo de la letra L
		//para poder adminir los valores mas aya de los int 
		/*
		 * tipos de datos primitivos 
		 * numericos de tipo flotante 
		 * nos permite guardar numeros decimales 
		 */
		float numeroFloat = 3.1416f;//ocupa 4 bites de memoria
		double numeroDouble = 3.1416;//ocupa 8 bites de memoria y no necesita sufijo
		//el comodin mas utilizado para decimales el el tipo de dato double 
		
		/*
		 * tipos de datos primitivos booleanos
		 * caracter
		 */
		boolean valida = true; //admiten solo dos valores true o false 
		//estas variables de tipo de dato son utiles para evaluar expresiones o cundiciones 
		char caracter = 'A';//admite un solo caracter por variable y ocupa 2 bites de memoria 
		
		//tipos de datos no primitivos / tipos de datos objeto / clases / estructurado 
		
		//tipo de datos String la cual nos permite almacenar cadenas de texto 
		
		String nombre = "Francisco Ortiz Dionicio";
		
		/*los tipos de datos wraper
		 * o envoltorio son tipos de datos objeto
		 * que permiten otorgar funciones o propiedades a los tipos primitivos 
		 */
		
		Byte num1;
		Short num2;
		Integer num3;
		Long num4;
		Character letra;
		/*Boolean
		 * Float
		 * Double
		 */
		//no puede haber nombres de variables repetidas aunque tenga distinto tipo de dato 
		// darle salida a nuestros datos en consola
		//imprecion en consola / impreciones de linea
		
		
		System.out.println("Hola mundo");		
		System.out.println(nombre);
		System.out.println(numeroByte);
		System.out.println(numeroB);
		System.out.println(numeroShort);
		System.out.println(numeroInt);
		System.out.println(numeroLong);
		System.out.println(numeroFloat);
		System.out.println(numeroDouble);
		System.out.println(valida);
		System.out.println(caracter);

		
	}// cierre del metodo main

}// coerre de la clase 
