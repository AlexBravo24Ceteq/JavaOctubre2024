package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		//Uso de las clases File, FileReader y BufferedReader
		//para poder leer nuestro archivo de prueba
		
		//Declaramos un String vacio en el que posteriormente guardamos
		//la info a leer
		String linea;
		
		//Vamos a utilizar una structura try and catch para intentar
		//encontrar y leer el archivo y si existe alguna excepcion atraparla
		//y ejecutar algun otro bloque de codigo
		
		try {//Intenta ejecutar el siguiente bloque de codigo
			//Vamos a traer a la clase File para pasarle la ruta de nestro archivo
			File archivo = new File("C:\\Users\\Juan\\Desktop\\Archivo.txt");
			//Necesitamos ahora a la clase filereader para que pueda abrir el arcchivo
			//en modo lectura
			FileReader fr = new FileReader(archivo); //Le pasamos el valor de File
			//Traemos a la clase BufferedReader para poder leer el contenido
			//del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Lo que esta leyendo el objeto buffer lo asignamos a la variable linea
			//linea = buffer.readLine();//Aque se lee la linea del archivo y se guarda
			//en el destino linea
			
			//le doy salida en consola al contenido que ya almacenamos aqui
			//System.out.println(linea);
			
			//Para leeer mas de una linea en eun archivo, incluimos buffer.readLine();en
			//un cucli while
			while ((linea = buffer.readLine()) != null) {
				System.out.println(linea);
				
			}
			
		} catch (Exception e) {//Si existe una excepcion atrapartla aqui y ejecuta
			// TODO: handle exception
			//Si queremos ver la traza del error o exceocion
			//la inprimimos a travez de e.printStackTrace();
			System.out.println("No se encontro el archivo o hubo un error");
		}

	}

}
