package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFr {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		// para poder leer nuestro archivo de prueba
		
		// Declaramos un String vacío en el que posteriormente guardaremos
		// la info a leer
		
		String linea;
		
		// Vamos a utilizar una estructura try and catch para intentar
		// encontrar y leer el archivo y si existe alguna excepción atraparla
		// y ejecutar algún otro bloque de código
		
		try { // intenta ejecutar el siguiente bloque de código y si existe una
			// vamos a traer a la clase File para pasarle la ruta de nuestro archivo 
			
			File archivo = new File("C:\\Users\\H2O-PC\\Desktop\\Archivo.txt"); //Encontrar archivo
			// necesitamos ahora a la clase FileReader para que pueda abrir el archivo
			// en modo lectura 
			
			FileReader fr = new FileReader (archivo); // Abrir el archivo // le pasamos el valor de File
			
			// Traemos ahora a la clase BufferedReader para poder leer el contenido 
			// del archivo
			
			BufferedReader buffer = new BufferedReader(fr); // Leer el archivo
			
			// Lo que está leyendo el objeto buffer lo asignamos a la variable linea
			
//			linea = buffer.readLine(); // aquí se lee la línea del archivo y se guarda
			// en el string linea
			
			// Le doy salida en consola al contenido que ya almacenamos aquí
//			System.out.println(linea);
			
			// Para leer más de una línea en un archivo, incluimos buffer.readLine(); en
			// un ciclo while
			
			while ((linea=buffer.readLine()) !=null) {
				System.out.println(linea);	
			}
			

		} catch (Exception e) {   // excepción atrápala aquí y ejecuta 
			// este otro bloque
			// Si queremos ver la traza del error o excepción
			// la imprimirmos a través de e.printStackTrace();
//			e.printStackTrace();  // manda a imprimir la excepción en consola
			
			String excepcion = e.getMessage(); // este método recupera el msj en String 
			// y lo podemos guardar en alguna variable para su uso posterior 
			System.out.println(excepcion);
			
			System.out.println("No se encontró el archivo o hubo un error");			
		} 
		
		

	}

}
