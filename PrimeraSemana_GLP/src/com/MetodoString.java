package com;

public class MetodoString {

	public static void main(String[] args) {
		String frase = "Hola";
		
		System.out.println("Probando .charAt");
		
		System.out.println(frase.charAt(frase.length()-1));
		
		System.out.println("probando el metodo .substring");
		System.out.println(frase.substring(2));
		System.out.println(frase.substring(2,4));

		//.toLowerCase/.toUpperCase
		//El primero conviertte la cadea de texto minusculas
		
		System.out.println("Probando el metodo .tolowerCase");
		System.out.println(frase.toLowerCase());
		
		
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(frase.toUpperCase());
		
		//.equals - devuelve un valor booleano true si los objetos o cadenas
		//son iguales
		//es sensible a mayusculas y minusculas
		System.out.println("Probando el metodo . equals");
		System.out.println(frase.equals("Hola"));
		
		//.equalsIgnoreCase devuelve comparando el conteniudo
		//ignorando el uso de mayuscu,las y minuscuklas
		System.out.println("Probando el metodo . equals");
		System.out.println(frase.equalsIgnoreCase("HOLA"));
		
		//remplaza un caracter viejo con uno nuevo o varios
		System.out.println("Probando el metodo . equals");
		System.out.println(frase.replace("Hola","adios"));
		
		
		//POOL DE STRINGS, se crean espacios en memoria
		//para optimizar la memoria si tienen el mismo valor
		//se apunta al mismo espacio de memoria en vez de crear uno nuevo
		//==
		
		String hola1 = "Hola";
		String hola2 = "Hola";
		
		//Ahora tenemos un String iniciado como un nuevo objeto
		//En este caso ya no es el mismo espacio de memoria
		//por eso se recomienda usar .equals
		String hola3 = new String("Hola");
		
		System.out.println("Comprobando el pool de Strings");
		
		if(hola1 == hola3) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}

	}

}
