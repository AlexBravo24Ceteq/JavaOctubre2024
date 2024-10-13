package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de la clase FileWriter para escribir lineas o texto en nuestro
		//archivo de prueba
		
		//Declaramos un String con algun texto a escribir en el archivo
		
		String saludo = "\nHola Mundo";//Se da el salto de linea para que se almacene debajo 
		//del ultimo texto que tenga el archivo
		
		try {
			File archivo = new File("C:\\Users\\Alexandro\\OneDrive\\Escritorio\\archi.txt");
			//Traemos a la clase filewriter para escribir contenido en nuestro archivo
			//Para que conserve el archivo original del archivo ademas
			//de lo que vamos a escribur en el, necesita un valor booleano true
			//Si no lo ponemos, se borra el contenido original y solo escribe
			//lo del String en el archivo
			
			//Este metodo si ni existe el archivo lo crea
			FileWriter writer = new FileWriter(archivo, true);//el valor true sirve para conservar
			//el contenido que existe en el archivo
			//si se va a querer que se boree todo se le quita el true
			
			//Lamamos al objeto write y un metodo llamado .write();
			writer.write(saludo);//Escribe el saludo hola mundo almacenado en String saludo
			//Para guardar o confirmar el contenido en el archivo utilizamos
			writer.close();
			
		} catch (Exception e) {
			System.out.println("no se puede encontrar el archivo");
		}

	}

}
