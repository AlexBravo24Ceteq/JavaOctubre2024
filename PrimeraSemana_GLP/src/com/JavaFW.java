package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de la clase FileWriter para escribir lineas o texto
		//en nuestro archivo de prueba
		
		//Declaramos un String con algun texto a escribir en el archivo
		
		String saludo = "\nHola Mundo";
		
		try {
			File archivo = new File("x:\\Users\\Gerardo\\Desktop\\Prueba.txt");
			//Traemos a la clase FileWriter para escribir contenido en nuestro archivo
			//Para que se conserve el contenido original del archivo ademas
			//de lo que vamos a escribir en el, necesita un valor booleano true
			//Si no lo ponemos, se borra el contenido original y solo escribe lo del
			//String de aqui
			FileWriter writer = new FileWriter(archivo, true);
			
			//Llamamos al objeto writer y un metodo .write
			writer.write(saludo);
			
			//Para guardar o confirmar el contenido en el archivo utilizamos
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
