package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
	
		//Uso de las clases File FileReader y BuferdReader
		//Para poder leer nuestro archivo de prueba
		
		//Declaramos un String vacio en el que posteriormente guardaremos la info a leer
		
		String linea;
		
		//Vamos a utilizar una estructura Try and Catch para intentar
		//encontrar y leer el archivo y si existe alguna excepcion atraparla
		//y ejecutar algun otro bloque de codigo
		
		try {//Intenta ejecutar el siguiente bloque de codigo
			//Vamos a traer a la clase File para pasarle la ruta de nuestro archivo
			
			File archivo = new File("C:\\Users\\Alexandro\\OneDrive\\Escritorio\\archivo.txt");
			//Asi se crea la ruta del archivo que etaremos ocupando y se guarda en el archivo
			//Necesitamos ahora a la clase FileReader para que pueda abrir el archivo
			//en modo lectura
			
			FileReader fr = new FileReader(archivo);//le pasamos el valor que contien File
			//Traemos ahora a la clase BufferedReader para poder leer el contenido
			//del archivo
			
			BufferedReader buffer = new BufferedReader(fr);
			
			//Lo que esta leyendo el objeto Buffer lo asignamos a la variable linea
			
//			linea = buffer.readLine(); //aqui se lee la linea del archivo y se guarda en el
//			//String linea
//			
//			//Le damos salida en consola al contenido que ya almacenamos aqui
//			
//			System.out.println(linea);
			
			//Para poder leer mas de una linea en un archivo, incluimos buffer.readLine(); en 
			//un ciclo while
			
			while ((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}			
			
			
			
		}catch(Exception e) {//si existe una excepcion atrapala aqui y ejecuta
			//este otro bloque
			//Si queremos ver la traza del error o excepcion
			//la imprimomos atraves de e.printStrackTrace();
			e.printStackTrace();
			//Este metodo recupera el mensaje en string y guardarla en una variable para un
			//uso posterior
			String excepcion = e.getMessage();
			System.out.println(excepcion);
			
			System.out.println("No se encontro el archivo o hubo un error");
			
		}
		
		
	}

}
