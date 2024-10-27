package com;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Existen varias maneras de introducir datos por teclado
		//Existen los recuadros como JOptionPane
		//Pero la forma más práctica y utilizada es con la clase Scanner

		//Ej. Vamos a introducir un valor numérico entero, por ejemplo
		//nuestra edad a través del teclado

		//Necesitaremos una variable de tipo entero donde poder almacenar dicho valor


		
		int edad;

		//Necesitamos una variable u objeto de la clase Scanner 
		//para poder introducir el valor de la edad

		Scanner entrada = new Scanner (System.in); //importar clase java.util

		//Como vamos a guardar o teclear un número entero, necesitamos  asignar lo que se 
		//guarde en entrada hacia edad
		//Antes de que se ejecute el Scanner para recibir la edad, podemos enviar una impresión
		//en consola que nos diga qué se está solicitando

		System.out.println(“Introduce tu edad”);
		edad = entrada.nexInt(); 

		//Una vez que se almacena la edad podemos decidir qué hacer con ese valor
		//Ej. Mando otra impresión en consola que muestre un msj con la edad que tendré
		//el siguiente año

		System.out.println(“El siguiente año tendrás ”+ (edad+1) +” años”);

		//Qué ocurre si quiero teclear un nombre para guardarlo en un String
		//Podemos utilizar el mismo Scanner para seguir recibiendo valores

		System.out.println(“Introduce un nombre”);

		//Si queremos recibir una frase completa o dos nombres, lo hacemos con 
		//.nextLine()
		//Primero, ahora debo consumir el espacio o salto de línea que dejó la anterior impresión 
		//en consola

		entrada.nextLine(); //se consume el espacio que permite que funcione la siguiente línea de código
		String nombre = entrada.nextLine();


		//Si ya no requiero seguir introduciendo valores con mi Scanner
		//puedo cerrarlo con el siguiente método
		entrada.close();


		System.out.println(“Hola, bienvenido ”+nombre);
		

		/*
		int numero = 19;

		//También contamos con una clase llamada Math que nos puede proporcionar 
		//funciones matemáticas

		System.out.println(“La raíz de ” +numero+ “ es: “);
		//System.out.println(Math.sqr(numero));
		//Para imprimir con cierto formato se utiliza System.out.printf
		//Se pueden ir buscando los diferentes formatos para mostrar la info según nos convenga

		System.out.printf(“%.4f ”, Math.sqr(numero));  //para determinar el número de 
		//decimales que aparecerán en el resultado
		*/


		//Operador módulo % - sirve para devolver el valor del residuo de una división

		/*
		int x = 10;

		//  int resultado = x/2;

		int resultado = x%3; //Arroja el valor del residuo de la división

		System.out.print(resultado); //imprime el valor del residuo
		*/


	}

}
