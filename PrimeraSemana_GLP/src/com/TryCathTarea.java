package com;

public class TryCathTarea {

	public static void main(String[] args) {
		/*
		 * 
		La estructura try y catch en Java se utiliza para manejar excepciones, 
		que son eventos an�malos que pueden ocurrir durante la ejecuci�n de un programa, 
		como un archivo que no se encuentra o una divisi�n por cero.
		
		 
		 try: Bloque de c�digo donde puede ocurrir una excepci�n. 
		 Si ocurre una excepci�n dentro de este bloque, el control se transfiere al bloque catch.

		catch: Bloque de c�digo que maneja la excepci�n. 
		Se especifica el tipo de excepci�n que quieres manejar (por ejemplo, ArithmeticException) 
		y se define c�mo quieres manejarla. En el ejemplo, se captura la excepci�n de divisi�n por cero 
		y se imprime un mensaje de error.

		Este mecanismo es esencial para crear programas robustos que puedan manejar errores de manera controlada 
		y evitar que el programa se detenga inesperadamente.
		Aqu� tienes un ejemplo y una breve explicaci�n:
		 * */
		
		try {
		    // C�digo que puede lanzar una excepci�n
		    int resultado = 10 / 0;
		} catch (ArithmeticException e) {
		    // C�digo que maneja la excepci�n
		    System.out.println("Error: No se puede dividir por cero.");
		}

		
		
		

	}

}
