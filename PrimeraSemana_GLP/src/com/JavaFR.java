package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		//uSO DE LAS CLASES fILE, FileReader y BufferReader
		//para poder leer nuestro archivo de prueba
		
		//Declaramos un String vacio en el que posteriormente guardaremos
		//la info a leer
		
		String linea;
		
		//Vamos a utilizar una estructura try and cath para intentar
		//encontrar y leer el archivo y si exciste alguna excepcion
		//atraparla y ejecutar algun otro bloque de codigo
		
		try {//Intenta ejecutar el siguente bloque de codigo
			
			//Vamos a traer a la clase File para pasarle la ruita de nuestro archivo
			File archivo = new File("C:\\Users\\Gerardo\\Desktop\\Pruea.txt");
			
			//Necesitamos ahora la clase FileReades para que pueda abrir el archivo
			//en modo lectura
			FileReader fr = new FileReader(archivo);
			
			//Traemos ahora a la clase BufferReader para poder leer el contenido
			//del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Lo que esta leyendo el objeto buffer lo asignamos a la varibale linea
			//linea = buffer.readLine();
			
			//System.out.println(linea);
			
			//Para leer mas de una linea en un archivo, incluimos buffer.readLine
			//en un ciclo while
			while((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) {//si existe una excepcion atrapala aqui y ejecuta
			//este otro bloque
			//Si queremos ver la traza del error o excepcion
			//la imprimimos ateaves de e.printStackTrace()
			e.printStackTrace();
			//get message nos ayuda a guardar el error del msj
			String excepcion = e.getMessage();
			System.out.println(excepcion);
			
			System.out.println("No se encontro el archivo o hubo un error");
		}

	}

}
