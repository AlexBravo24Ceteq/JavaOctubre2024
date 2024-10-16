package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de la clase FileWriter para escribir l�neas o texto
		// en nuestro archivo de prueba
		
		// Declaramos un String con alg�n texto a escribir en el archivo
		
		String saludo = "\nHola Mundo";
		
		try {
			File archivo = new File("C:\\Users\\H2O-PC\\Desktop\\Archivo.txt");
			// Traemos a la clase FileWriter para escribir contenido en nuestro archivo
			// Para que se conserve el contenido original del archivo adem�s
			// de lo que vamos a escribir en el, necesita un valor booleano true
			// Si no lo ponemos, se borra el contenido original y solo escribe lo del
			// String de aqu�
			
			FileWriter writer = new FileWriter(archivo, true);
			
			// LLamamos al objeto writer y un m�todo llamado .write();
			writer.write(saludo);  // escribe pero no guarda
			
			// Para guardar o confirmar el contenido en el archivo utilizamos
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("No se puede encontrar el archivo");
		}

	}

}
