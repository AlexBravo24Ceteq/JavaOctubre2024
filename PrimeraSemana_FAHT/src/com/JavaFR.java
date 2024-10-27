package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Uso de clases File, FileReader y BufferReader
		//para poder leer nuestro archivo de prueba
		
		//Declaramos un string vacio en el que posterior guardaremos
		//la información a leer
		
		String linea;
		
		//vamosa utilizar una estructura try and catch para intentar
		// encontrar y leer el archivo y si existe alguna excepcion
		// atraparla y ejecutar algun otro bloque de codigo
		
		try {//intenta ejecutar el siguiente bloque de codigo
		
			//Vamos a traer a la clase fiele para pasar la ruta de nuestro archivo
			File archivo = new File("D:\\msi\\Desktop\\archivol.txt");
			
			//Necesitamos ahora a la clase FileReader para abrir el
			// archivo en modo lectura
			FileReader fr = new FileReader(archivo);//le pasamos el valor de File
			
			//Traemos ahora a la clase BufferReader para poder leer el contenido
			BufferedReader buffer = new BufferedReader(fr);
			
			//Lo que esta leyendo el objeto buffer lo asignamos a la variable linea
			linea = buffer.readLine(); //aqui se lee la linea del archivo y se guarda
			// en el string linea
			
			//Damos salida en consola al contenido ya almacenado aquí:
			System.out.println(linea);
			
			//Para leer más de una linea en un archivo, incluimos 
			// buffer.readLine(); en un ciclo while
			while ((linea = buffer.readLine() ) !=null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) {// si existe una excepcion atrapala aquí
			// y ejecura este otro bloque
			//Si queremos ver las trazas del error o excepcion
			// la imprimimos a traves de e.printStackTrace();
			e.printStackTrace(); // este metodo manda la exception en consola
			String excepcion = e.getMessage();
			System.out.println(excepcion);
			System.out.println("No se enconto el archivp o hubo un error");
		}

	}//end
}
