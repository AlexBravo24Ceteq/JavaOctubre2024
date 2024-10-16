package com;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Existen varias maneras de introducir datos por teclado
		//Existen los recuadros como JOptionPane
		//Pero la forma m�s pr�ctica y utilizada es con la clase Scanner

		//Ej. Vamos a introducir un valor num�rico entero, por ejemplo
		//nuestra edad a trav�s del teclado

		//Necesitaremos una variable de tipo entero donde poder almacenar dicho valor


		
		int edad;

		//Necesitamos una variable u objeto de la clase Scanner 
		//para poder introducir el valor de la edad

		Scanner entrada = new Scanner (System.in); //importar clase java.util

		//Como vamos a guardar o teclear un n�mero entero, necesitamos  asignar lo que se 
		//guarde en entrada hacia edad
		//Antes de que se ejecute el Scanner para recibir la edad, podemos enviar una impresi�n
		//en consola que nos diga qu� se est� solicitando

		System.out.println(�Introduce tu edad�);
		edad = entrada.nexInt(); 

		//Una vez que se almacena la edad podemos decidir qu� hacer con ese valor
		//Ej. Mando otra impresi�n en consola que muestre un msj con la edad que tendr�
		//el siguiente a�o

		System.out.println(�El siguiente a�o tendr�s �+ (edad+1) +� a�os�);

		//Qu� ocurre si quiero teclear un nombre para guardarlo en un String
		//Podemos utilizar el mismo Scanner para seguir recibiendo valores

		System.out.println(�Introduce un nombre�);

		//Si queremos recibir una frase completa o dos nombres, lo hacemos con 
		//.nextLine()
		//Primero, ahora debo consumir el espacio o salto de l�nea que dej� la anterior impresi�n 
		//en consola

		entrada.nextLine(); //se consume el espacio que permite que funcione la siguiente l�nea de c�digo
		String nombre = entrada.nextLine();


		//Si ya no requiero seguir introduciendo valores con mi Scanner
		//puedo cerrarlo con el siguiente m�todo
		entrada.close();


		System.out.println(�Hola, bienvenido �+nombre);
		

		/*
		int numero = 19;

		//Tambi�n contamos con una clase llamada Math que nos puede proporcionar 
		//funciones matem�ticas

		System.out.println(�La ra�z de � +numero+ � es: �);
		//System.out.println(Math.sqr(numero));
		//Para imprimir con cierto formato se utiliza System.out.printf
		//Se pueden ir buscando los diferentes formatos para mostrar la info seg�n nos convenga

		System.out.printf(�%.4f �, Math.sqr(numero));  //para determinar el n�mero de 
		//decimales que aparecer�n en el resultado
		*/


		//Operador m�dulo % - sirve para devolver el valor del residuo de una divisi�n

		/*
		int x = 10;

		//  int resultado = x/2;

		int resultado = x%3; //Arroja el valor del residuo de la divisi�n

		System.out.print(resultado); //imprime el valor del residuo
		*/


	}

}
