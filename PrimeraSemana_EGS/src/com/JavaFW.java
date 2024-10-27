package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		//Uso de la clase File Writer para escribir lineas o texto
		//en nuestro archivo de prueba
		
		//Declaramos un String con algun texto a escribir en el archivo
		
		String saludo = "\nHola Mundo";
		
		try {
			File archivo = new File("C:\\Users\\Errai\\OneDrive\\Escritorio\\archivo.txt");
			
			//Traemos a la clase FileWritter para escribirt contenido en nuestro archivo
			//Para que se conserve el contenido original del archivo ademas
			//de lo que vamos a escribir en el, necesitamos un valor booleano true
			// y solo escribe lo del String de aqui
			FileWriter writer = new FileWriter(archivo, true);
			
			//We call to object "writer" and a method named "write"
			writer.write(saludo);
			
			//for save or confirm the content in the file, we use 
			writer.close();
			
		} catch (Exception e) {
			System.out.println("ERROR: No se encontro el archivo o hubo un error");
		}

	}

}
