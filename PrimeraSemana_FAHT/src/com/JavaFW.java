package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// uSO DE LA CLASE FILEwRITER PARA ESCRIBIR LINEAS O TEXTO
		//EN NUETSRO ARCHIVO DE PRUEBA
		
		//dECLARAMOS UN sTRING CON ALGUN TEXTO A ESCRIBIR EN EL ARCHIVO
		
		String saludo = "\nHola mundo";
		
		try {
			File archivo = new File("D:\\msi\\Desktop\\archivol.txt");
			//Traemos a la clase FileWriter para escribir contenido en nuestro archivo
			//Para que conserve el contenido original del archivo además
			//de lo que vamos escribir en el, necesita un valor booleano true
			//si no lo ponemos, se borra el contenido original y solo escrine lo del String
			FileWriter Writer = new FileWriter(archivo,true);
			
			//Llamamos al objeto writer y un metodo lalmado.write();
			Writer.write(saludo);
			//Para guardar o confirmar el contenidop en el archivo utilizamos
			Writer.close();
			
		}catch (Exception e) {
			System.out.println("No se puede encontrar el archivo");
		}
		
	}//end
}
