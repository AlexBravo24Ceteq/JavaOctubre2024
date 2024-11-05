package com;

public class MetodoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vamos a declarar una frase para posteriormente
		//utilizar algunos metodos
		String frase = "Hoy es Martes 8 de Octubre de 2024";
		
		//.length() - nos devuelve en valor entero
		//la longitud o total de caracteres de un String
		System.out.println("Probando el metodo .length()");
		System.out.println(frase.length());
		//Como el valor que devuelve este metodo es de tipo entero
		//lo puedo guardar en una variable para su uso posterior
		int longitud = frase.length();
		
		//.charAt() - nos devuelve el caracter que se encuentra en
		//un indice determinado
		System.out.println("Probando el metodo .charAt()");
		System.out.println(frase.charAt(0));
		//Ej. podemos combinar metodos para expresar operaciones y asi obtener
		//el ultimo caracter
		System.out.println(frase.charAt(frase.length()-1));
		//.substring() - nos devuelv una subcadena a partir del indice especificado
		System.out.println("Probando el metodo .substring");
		System.out.println(frase.substring(2));
		System.out.println(frase.substring(2, 30));
		
		//.toLowerCase() /.toUpperCase()
		//El primero convierte la cadena de texto a minusculas y el segundo
		//a mayusculas
		System.out.println("Probando el metodo .toLowerCase()");
		System.out.println(frase.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase()");
		System.out.println(frase.toUpperCase());
		
		//.equals - devuelve un valor booleano si los objetos o cadenas
		//comparadas son iguales. Este metodo es sensible a mayusculas y minusculas
		System.out.println("Probando el metodo .equals()");
		System.out.println(frase.equals("hOy Es MaRtEs 8 De OcTuBrE dE 2024"));
	
		//.equalsIgnoreCase() - devuelve true comparando el contenido
		//ignorando el uso de mayusculas y minusculas
		System.out.println("Probando el metodo .equals()");
		System.out.println(frase.equalsIgnoreCase("hOy Es MaRtEs 8 De OcTuBrE dE 2024"));
		
		//.replace - reemplaza un caracter viejo con uno nuevo
		//o una secuencia de ellos con otra secuencia
		System.out.println("Probando el metodo .replace()");
		System.out.println(frase.replace("2024", "2030"));
		System.out.println(frase.replace("r", "s"));
		System.out.println(frase.replace(" ", "_"));
		
	}

}
