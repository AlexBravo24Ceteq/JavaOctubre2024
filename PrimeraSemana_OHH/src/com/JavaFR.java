package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
//		Uso de la clase File, FileReader y BufferedReader
		String linea;
		
		//try-catch atrapa exepciones en tiempo de ejecucion
		try {
			File archivo = new File("C:\\Users\\Lenovo\\Desktop\\archivo.txt");
			FileReader fr =  new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);
			linea = buffer.readLine();
			System.out.println(linea);
//			buffer.close();
//			Para leer más de una linea en un archivo incluimos buffer.readline()
//			en un while
			while((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) {
			System.out.println("No se encontro el archivo o hubo un error");
			//si queremos ver el error imprimimos e.printStackTrace()
			e.printStackTrace();
		}
		
	}

}
