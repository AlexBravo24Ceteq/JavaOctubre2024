package com;

public class TryCathTarea {

	public static void main(String[] args) {
		/*
		 * 
		La estructura try y catch en Java se utiliza para manejar excepciones, 
		que son eventos anómalos que pueden ocurrir durante la ejecución de un programa, 
		como un archivo que no se encuentra o una división por cero.
		
		 
		 try: Bloque de código donde puede ocurrir una excepción. 
		 Si ocurre una excepción dentro de este bloque, el control se transfiere al bloque catch.

		catch: Bloque de código que maneja la excepción. 
		Se especifica el tipo de excepción que quieres manejar (por ejemplo, ArithmeticException) 
		y se define cómo quieres manejarla. En el ejemplo, se captura la excepción de división por cero 
		y se imprime un mensaje de error.

		Este mecanismo es esencial para crear programas robustos que puedan manejar errores de manera controlada 
		y evitar que el programa se detenga inesperadamente.
		Aquí tienes un ejemplo y una breve explicación:
		 * */
		
		try {
		    // Código que puede lanzar una excepción
		    int resultado = 10 / 0;
		} catch (ArithmeticException e) {
		    // Código que maneja la excepción
		    System.out.println("Error: No se puede dividir por cero.");
		}

		
		
		

	}

}
