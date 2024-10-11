package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {
	public static void main(String[] args) {
//		Uso de la clase fileWriter, escribir texto
		
		String saludo = "\nHola a todos";
		
		try {
			File archivo = new File("C:\\Users\\Lenovo\\Desktop\\archiv.txt");
			FileWriter writer = new FileWriter(archivo, true);
			writer.write(saludo);
			writer.close();
			System.out.println("Saludo guardado con éxito");
		} catch (Exception e) {
			System.out.println("No se encontro el archivo");
		}
	}
}
