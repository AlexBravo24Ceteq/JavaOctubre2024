package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de la clase FileWriter para escribir lineas o texto en nuestro entorno de bruebas 
		//declaramos un String con agun texto a escribirn en el texto
		
		String saludo = "\nHola Mundo";
		String linea;
		
		try {
			File archivo = new File("C:\\Users\\ingor\\OneDrive\\Escritorio\\archivo.txt");
			//Traemos a la clse fileWriter para escribir contenido a nuestro archivo 
			//para que se conserve el contenido original del archivo ademas de lo que bamos a escribir en el 
			//necesitamos un valor booleano true
			//si no lo ponemos se borra el valor original y solo escribe lo del estring asignado
			FileWriter escribir = new FileWriter(archivo, true);
			//llamamos al objeto escribir y un mretodo llamado write
			escribir.write(saludo);
			//para guardar y afirmar el contenido en el archivo utilizamos 
			escribir.close();
		//  intenta ejecutar el siguente bloque de codigo y 
					//si existe alguna otra exepsion atrapala aqui y ejecuta este otro bloque
					//vamos a traer a la clase file para pasarle la ruta de nuestro archivo 
					
					//File archivo = new File("C:\\Users\\ingor\\OneDrive\\Escritorio\\archivo.txt");// dentro de las comillas devemos ingresar la ruta de nuestro archivo 
					// necesitamos ahora la clase FileReader para que pueda leer el archivo
					//en modo lectura
					FileReader fr = new FileReader(archivo);//le pasamos el valor de File
					//tremos ahora a la clase BufferedReader para poder leer el contenido del archivo
					BufferedReader buffer = new BufferedReader(fr);
					//lo que esta leyendo el objeto fuffer lo asignamos a la variable linea 
					//linea = buffer.readLine(); 
					//le damos salida en consola el contenido que ya se almaceno en la variable linea
					
					
					//para leer mas de una linea en un archivo incluimos buffer.readLine en un ciclo wile
					
					while ((linea = buffer.readLine())!= null) {
						System.out.println(linea);
					}
		} catch (Exception e) {
			System.out.println("No se puede encontrar el archivo");
		}

	}

}
