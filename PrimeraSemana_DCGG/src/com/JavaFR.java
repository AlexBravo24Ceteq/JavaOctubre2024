package com;

import java.io.*;

public class JavaFR {

	public static void main(String[] args) {
		
//		Uso de las clases File, File Reader y Buffered Reader
//		Para poder leer nuestro archivo de prueba
		
		// Declaramos un String vacio en el que posteriorimente guardaremos la informaci�n
		// a leer
		String linea;
		// declaramos un String para la ruta donde se encuentra el archivo que vamos a trabajar
		String file = "C:\\Users\\DAVID-PC\\Desktop\\archivo.txt";
		
		// Vamos a utilizar una estructura try and catch para intentar 
		// encontrar y leer el archivo y si existe alguna excepci�n atraparla
		// y ejecutar algun otro bloque de c�digo.
		
		try {// intetna ejecutar un c�digo el cual puede o no generar un excepci�n
			// traemos la clase File para pasarle la tura de nuestro archivo
			// el constructor nos pide algo de tipo String que usualmente es la ruta de nuestro archivo
			File archivo = new File(file);
			// ahora necesitamos a la clase File Reader para que pueda abrir el archivo en modo lectura
			// el constructor nos pide una variable de tipo String o un objeto de tipo File
			FileReader fr = new FileReader(archivo);
			// ahora traemos a la clase BufferedReader para poder leer el contenido del archivo
			// lo que espera el constructor es una variable de tipo FileReader o Reader
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
			
			// lo que puede leer el objeto br (BufferedReader) lo asignamos a nuestra variable linea
//			linea = br.readLine();
			
			// ahora puedo mandarlo a imprimir en consola
//			System.out.println(linea);
			
			// con un ciclo para poder leer todo el documento
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			br.close();
			fr.close();
		} catch (Exception e) {// si ocurre un error o una excepci�n entonces entra en funcion este bloque 
			// si queremos ver la traza del error o excepcion
			// la imprimimos a trav�s de e.printStackTrace();
			e.printStackTrace(); // este m�todo manda la excepcion en consola
			// si queremos tener un string de la e excepcion podriamos declarar una variable String
			String excepcion = e.getMessage(); // este metodo getMesssage(); te da el mensaje de la excepcion
			System.out.println("Archivo no encontrado-> ["+excepcion+"]");
		}

	}

}
