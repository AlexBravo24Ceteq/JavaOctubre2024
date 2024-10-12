package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Uso de Clases File, FileReader, BufferedReader
		
		//Declaramos un String vacio donde guardaremos info a leer
		String linea;
		
		//Estructura try-catch para encontrar y leer el archivo, 
		//si existe una excepción atraparla y ejecutar algun otro bloqueo de codigo.
		
		try {//Intenta ejecutar el siguiente bloque de codigo
			File archivo = new File("C:\\Users\\Carolina Hernández\\OneDrive\\Escritorio\\archivo.txt");
			//Necesita clase FileReader para abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo); //pasamos el valor de File
			//Clse BufferedReader para leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Lo que esta leyendo el objeto buffer se asigna a la variable linea
//			linea = buffer.readLine(); //aqui se lee la linea del archivo y se guarda en String linea
//			//Salida en consola del contenido
//			System.out.println(linea);

			//Para leer más de una linea en un archivo, incluimos buffer.readLine() en un ciclo while
			while ((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
		} catch(Exception e) {//si existe una excepción atrapala aqui y
							//ejecuta este otro bloque
			//si queremos ver traza del error o excepción
			//usamos e.printStackTrace();
			//e.printStackTrace();
			String excepcion = e.getMessage(); //recupera el mensaje en string y lo guardamos en alguna variable
			System.out.println(excepcion);
			System.out.println("No se encontro el archivo: ERROR!");
			
		}

	}

}
