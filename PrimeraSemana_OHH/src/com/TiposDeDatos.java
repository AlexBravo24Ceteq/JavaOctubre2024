package com;

public class TiposDeDatos {
	public static void main(String[] args) {
		//datos primitivos de tipo entero
		
		byte numeroByte;
		numeroByte = 127;
		byte numeroB = -128;
		
		short numeroShort = 1000;
		int numeroInt = 99999;
		
		//valores decimales
		float numeroFloat = 3.1416F;
		double numeroDouble = 3.1416;
		
		//datos primitivos booleanos y caracter
		boolean validar = true;
		char caracter = 'a';
		
		//Tpos de datos no primitivos
		/* Objetos
		 * String
		 * Estructurado*/
		String nombre = "oscar";
		
		//datos Wrapper o envoltorio
		Byte envoltorio = 100;
		
		System.out.println("hola mundo");
		System.out.println(4+5);
		System.out.println("el resultado de la suma es: " + (4+5));
	}
}
