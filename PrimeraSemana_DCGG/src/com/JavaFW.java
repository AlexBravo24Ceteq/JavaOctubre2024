package com;
import java.io.*;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de la clase File Writer para escribir lineas o un texto
		// en nuestro archivo de prueba
		
		// declaramos un String con algun texto a escribir en el archivo
		String ruta = "C:\\Users\\DAVID-PC\\Desktop\\archivo.txt";
		String saludo = "\nSaludos equipo de CETEQ";
		
		try {
			File archivo = new File(ruta);
			// Traemos a la clase FileWriter para escribir contenido en nuestro archivo
			FileWriter fw = new FileWriter(archivo, true);
			
			// llamamos al objeto writer y un método llamado .write();
			fw.write(saludo);
			// para guardar o confirmar el contenido en el archivo usamos
			fw.close();
		} catch (Exception e) {
			System.out.println("No se puede encontrar el archivo");
		}

	}

}
