package com;

public class MetodosString {
	public static void main(String[] args) {
		//Metodos o funcionalidades de la clase String
		
		//vamos a dclarar una frase para posteriormente
		//utilizar algunos metodos
		String frase = "Hoy es Martes 8 de Octubre de 2024";
		
		//.length() -> Nos devuelve en valor entero
		// La longitud o total de caracteres en un String
		
		System.out.println("Probando metodo .length():");
		System.out.println(frase.length());
		/*
		como el valor que devuelve este metodo es de tipo entero puedo
		guardar una variable para su uso posterior
		*/
		int longitud = frase.length();
		
		//.charAt() - nos devuelve el caracter que se encuentra en 
		//un indice determinado
		System.out.println("Probando el metodo .charAt():");
		System.out.println(frase.charAt(0));
		
		//Ejemplo podemos convinar metodos para expresar operaciones y asi
		//obtener el ultimo caracter
		
		System.out.println(frase.charAt(frase.length()-1));
		
		//.substring() -> nos devuelve una subcadena a partir del indice especificado
		
		System.out.println("Probando el metodo .substring():");
		System.out.println(frase.substring(2));
		System.out.println(frase.substring(2,30));
		
		//.tolowerCase() / .toUpperCase()
		//El primero convierte la cadena de texto a minusculas y el segundo
		//a Mayusculas
		System.out.println("Probando el metodo .toLowerCase():");
		System.out.println(frase.toLowerCase());

		System.out.println("Probando el metodo .toLowerCase():");
		System.out.println(frase.toUpperCase());
		
		//.equals -> devuelve un valor booleano true si los objetos o cadenas
		//comparadas son iguales
		System.out.println("Probando el metodo .equals():");
		System.out.println(frase.equals("hOy Es MaRtEs 8 De OcTuBrE dE 2024"));
		
		//.equalsIgnoreCase() -> devuelve true comparando el contenido
		//ignorando el uso de mayusculas y minusculas
		System.out.println("Probando el metodo .equalsIgnoreCase():");
		System.out.println(frase.equalsIgnoreCase("hOy Es MaRtEs 8 De OcTuBrE dE 2024"));
		
		//.replace -> reemplaza un caracter viejo con uno nuevo
		// o una secuencia con otra secuencia
		System.out.println("Probando el metodo .replace():");
		System.out.println(frase.replace("2024","2030"));
		System.out.println(frase.replace("$","r"));
		System.out.println(frase.replace(" ","_"));
		System.out.println(frase.replace(" ","#"));
		
		//POOL DE STRINGS
		//Cuando tenemos un mismo contenido de cadena de texto en lugar
		//de crearse un nuevo String, se apunta hacia un mismo espacio en
		// memoria y se puede utilizar el comparador u operador lógico
		//==
		
		String hola1 = "hola";
		String hola2 = "hola";
		String hola3 = new String("hola");
		
		System.out.println("\nComprobando el pool de strings");
		
		if (hola1.equals(hola3)) 
			System.out.println("Cierto");
		else
			System.out.println("Falso");
			
		
	}

}
