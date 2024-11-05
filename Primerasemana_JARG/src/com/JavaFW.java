package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		//Uso d ela classe FileWriter para escibir lineas o texto
		//en nuestro archivo de prueba
		
		//Declaramos un String con algun texto o escribir en el archivo
		
		String saludo = "\nHola Mundo";
		
		try {
			File archivo = new File("C:\\Users\\Juan\\Desktop\\Archivo.txt");
			//Traemos a la clase FileWriter para escribir cotenido en nuestro archivo
			//para conservar el contenido del archivo original del archivo
			//ademas de lo que vamos a escrbir en el, necesita un valor booleano true
			//si no lo ponemos, se borra el contenido original y solo escribe lo del
			//string de aqui
			FileWriter writer = new FileWriter(archivo, true);
			
			//Llamamos al objeto writer y un metidi kkanadi .write
			writer.write(saludo);
			//para guardar o confirmar el contenido en el archivo utilizamos
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se puede encontrar el archivo");
		}

	}

}
