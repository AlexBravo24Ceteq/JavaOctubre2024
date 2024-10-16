package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFr {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		// para poder leer nuestro archivo de prueba
		
		// Declaramos un String vac�o en el que posteriormente guardaremos
		// la info a leer
		
		String linea;
		
		// Vamos a utilizar una estructura try and catch para intentar
		// encontrar y leer el archivo y si existe alguna excepci�n atraparla
		// y ejecutar alg�n otro bloque de c�digo
		
		try { // intenta ejecutar el siguiente bloque de c�digo y si existe una
			// vamos a traer a la clase File para pasarle la ruta de nuestro archivo 
			
			File archivo = new File("C:\\Users\\H2O-PC\\Desktop\\Archivo.txt"); //Encontrar archivo
			// necesitamos ahora a la clase FileReader para que pueda abrir el archivo
			// en modo lectura 
			
			FileReader fr = new FileReader (archivo); // Abrir el archivo // le pasamos el valor de File
			
			// Traemos ahora a la clase BufferedReader para poder leer el contenido 
			// del archivo
			
			BufferedReader buffer = new BufferedReader(fr); // Leer el archivo
			
			// Lo que est� leyendo el objeto buffer lo asignamos a la variable linea
			
//			linea = buffer.readLine(); // aqu� se lee la l�nea del archivo y se guarda
			// en el string linea
			
			// Le doy salida en consola al contenido que ya almacenamos aqu�
//			System.out.println(linea);
			
			// Para leer m�s de una l�nea en un archivo, incluimos buffer.readLine(); en
			// un ciclo while
			
			while ((linea=buffer.readLine()) !=null) {
				System.out.println(linea);	
			}
			

		} catch (Exception e) {   // excepci�n atr�pala aqu� y ejecuta 
			// este otro bloque
			// Si queremos ver la traza del error o excepci�n
			// la imprimirmos a trav�s de e.printStackTrace();
//			e.printStackTrace();  // manda a imprimir la excepci�n en consola
			
			String excepcion = e.getMessage(); // este m�todo recupera el msj en String 
			// y lo podemos guardar en alguna variable para su uso posterior 
			System.out.println(excepcion);
			
			System.out.println("No se encontr� el archivo o hubo un error");			
		} 
		
		

	}

}
