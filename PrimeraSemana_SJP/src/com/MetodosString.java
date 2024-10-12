package com;

import java.util.Scanner;

public class MetodosString {

	public static void main(String[] args) {
		// M�todos o funcionalidades de la clase String
		
		String frase = "Hoy es Martes 8 de Octubre de 2024";
		//.length() (Nos devuelve el tama�o o longitud de un String en valor num�rico)
		//Incluye los espacios que son detectados como caracteres
		System.out.println("Probando el m�todo .length() ");
		System.out.println(frase.length());
     
		//Valor tipo entero, se puede guardar en una variable.
		int longitud = frase.length();
		

		//.charAt (Nos devuelve el caracter que se encuentre en un �ndice determinado)
		System.out.println("Probando el m�todo .charAt() ");
		System.out.println(frase.charAt(31)); //�ltimo caracter una posici�n antes
		System.out.println(frase.charAt(frase.length() -1)); //en caso de que no sepamos la posici�n
		
		//.substring (int beginIndex)- Nos devuelve una subcadena a partir del �ndice indicado  
		System.out.println(frase.substring(4,30));
		
		//.toLoLowerCase convertir la cadena de texto en minusc�las
		System.out.println("Probando el m�todo .toLowerCase(): ");
		System.out.println(frase.toLowerCase());
		
		//toUpperCase Convertir la cadena de texto en may�sculas
		System.out.println("Probando el m�todo .toUpperCase(): ");
		System.out.println(frase.toUpperCase());
	
		//.equals (Object ob) Comparar Strings y devolver un valor booleano true o false
		//Sensible a mayusculas y minusculas
		System.out.println("Probando el m�todo .equals(): ");
		System.out.println(frase.equals("hOy eS MarteS 8 De OcTuBrE dE 2024"));
		
		//.equalsIgnoreCase Compara los Strings ignorando si tienen mayusculas o minusculas
		System.out.println("Probando el m�todo .equalsIgnoreCase(): ");
		System.out.println(frase.equalsIgnoreCase("hOy eS MarteS 8 De OcTuBrE dE 2024"));
		
		//.replace reemplaza un caracter viejo por uno nuevo o una secuencia de caracteres
		System.out.println("Probando el m�todo .replace(): ");
		System.out.println(frase.replace("2024", "2030"));
		System.out.println(frase.replace(" ", "_"));
		
		//POOL DE STRINGS
		//Cuando tenemos un mismo contenido de cadena de texto, en lugar de
		//crearse un nuevo String, se apunta hacia un mismo espacio en memoria y
		//se puede utilizar entonces el comparador u operador logico ( == )
		String hola1 = "Hola";
		String hola2 = "Hola";
		//Si tenemos un String iniciado como un nuevo objeto:
		
		String hola3 = new String("Hola");
		
		String hola4 = "H" + "o" + "l" + "a"; 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese Hola: ");
		String hola5 = entrada.next();
		
		System.out.println("Comprobando el Pool de strings: ");
		if (hola1 == hola5) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
//		if (hola1.equals(hola3)) {
//			System.out.println("Cierto");
//		} else {
//			System.out.println("Falso");
//		}
		
	}

}
