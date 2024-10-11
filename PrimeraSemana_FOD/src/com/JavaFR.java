package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		//uso de las clases file filereader y fufferedRider
		//para poder leer nuestro archivo de prueva
		
		//declaramos un String vacio que posteriormente guardaremos la informacion a leer
		
		String linea;
		//vamos a utilizar una estructura try and catch
		//para poder encontrar y leer el archivo si existe una excepsion atrapada y ejecutar agun otro bloque de codigo 
		//como un mensaje de esepsion
		try {//  intenta ejecutar el siguente bloque de codigo y 
			//si existe alguna otra exepsion atrapala aqui y ejecuta este otro bloque
			//vamos a traer a la clase file para pasarle la ruta de nuestro archivo 
			
			File archivo = new File("C:\\Users\\ingor\\OneDrive\\Escritorio\\archivo.txt");// dentro de las comillas devemos ingresar la ruta de nuestro archivo 
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
			
		} catch (Exception e) {//si existe alguna otra exepsion atrapala aqui y 
			//ejecuta este otro bloque
			// si queremos ver o leer la trza del error o exepsion la imprimimos a traves de 
			//e.printStackTrace();
			//String excepcion = e.getMessage();este metodo recupera el mensaje en string 
			//y lo podemos guardar en una variable para su uso posterior
			e.printStackTrace();// -> importante recordad esta lina para las pruevas 
			System.out.println("No se encontro el archivo");
		}
		
		
	}

}
