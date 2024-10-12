package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de la clase FileWriter para escribir lineas o texto en un archivo
		
		String saludo = "\nHola Mundo";
		try {
			File archivo = new File("C:\\Users\\Carolina Hernández\\Documents\\ARCHIVOS SAUL JZ\\archivo.txt");
			//Usamos la clase FileWriter para escribir contenido
			//Para conservar el contenido original, se necesita un valor booleano true
			//Si no se coloca, se borra el contenido y mantiene string
			FileWriter writer = new FileWriter(archivo, true); //true para conservar el contenido
			
			//llamamos al objeto writer y metodo .write();
			writer.write(saludo);
			//Para guardar y confirmar el contenido en el archivo
			writer.close();
		} catch (Exception e) {
				System.out.println("No se puede encontrar el archivo");
		}

	}

}
