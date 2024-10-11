package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class JavaFR {

	public static void main(String[] args) {
		/*
		 * Uso de las clases File, FileReader y BufferedReader
		 * para poder leer nuestroo archivo de prueba
		 */
		
		/*
		 * Declaramos un String vacio en el que posteriormente guardaremos 
		 * la info a leer
		 */
		
		String linea;
		
		/*
		 * Vamos a utilizar una estructura "try" and "catch" para intentar
		 * encontrar y leer el archivo y si existe alguna excepcion atraparla
		 * y ejecutar algun otro bloque de codigo
		 */
		
		try { // Intenta ejecutar el siguiente bloque de codigo
			// Vamos a traer a la clase "File" para pasarle la ruta de nuestro archivo
			
			File archivo =new File("C:\\Users\\Errai\\OneDrive\\Escritorio\\archivo.txt");
			//Necesitamos ahora a la clase file reader para que pueda abrir el archivo
			//en modo lectura
			
			FileReader fr = new FileReader(archivo);
			//Vamos a traer a la clase BufferdReader para poder leer el 
			//contenido del archivo
			
			BufferedReader buffer = new BufferedReader(fr);
			
			//Lo que esta leyendo el objeto buffer llo asignamos a la variable linea
//			linea = buffer.readLine();// aqui se lee la linea del archivo y se guarda
			//en el string linea
//			System.out.println(linea);
			
			//para leer mas de una linea en un archivo incluimos buffer.readLine();
			// en un ciclo while
			while((linea=buffer.readLine()) != null) 
				System.out.println(linea);
			
		} catch (Exception e) { //Si existe una excepcion atrapala aqui y ejecuta
			// este otro bloque de codigo
			//Si queremos ver la traza del error .printStackTrace();
			e.printStackTrace();// Este metodo manda la excepcion en consola
			String excepcion = e.getMessage();// Este metodo recupera el msj 
			//en estring y lo podemos guardar en algfuna variable para su uso posterior
			System.out.println(excepcion);
			System.out.println("ERROR: No se encontro el archivo o hubo un error");
			
		}
		

	}

}
