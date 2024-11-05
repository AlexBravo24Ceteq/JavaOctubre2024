package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConceptosTarea {

	//Se requiere agregar un throw por si existe algun error
	public static void main(String[] args) throws IOException {
		
		//File: Representa un archivo o directorio en el sistema de archivos. 
		//Puedes usar la clase File para obtener información sobre el archivo o directorio 
		//(como su tamaño, si existe, si es legible, etc.).
		
		
			//Ejemplo File
			File archivo = new File("ruta/al/archivo.txt");
			if (archivo.exists()) {
				   System.out.println("El archivo existe.");
		    
		//FileReader: Permite leer datos de un archivo. 
		//Es útil para leer archivos de texto de manera sencilla.
		    
		    FileReader fileReader = new FileReader("ruta/al/archivo.txt");
		    
		    
		 //BufferedReader: Envuelve un FileReader (u otros Reader) para proporcionar una lectura más 
		 //eficiente de caracteres, arrays y líneas. 
		 //Permite leer líneas completas de texto de manera más eficiente.
		    
		    BufferedReader bufferedReader = new BufferedReader(new FileReader("ruta/al/archivo.txt"));
		    String linea;
		    while ((linea = bufferedReader.readLine()) != null) {
		        System.out.println(linea);
		    }
		    bufferedReader.close();
		    
		 //FileWriter: Permite escribir datos en un archivo. 
		 //Puedes usarlo para escribir caracteres o arrays de caracteres en un archivo.
		    FileWriter fileWriter = new FileWriter("ruta/al/archivo.txt");
		    fileWriter.write("Hola, mundo!");
		    fileWriter.close();

		    

		}
	}

}
