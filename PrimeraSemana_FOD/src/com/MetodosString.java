package com;

public class MetodosString {

	public static void main(String[] args) {
		// metodos o funcionalidades de la clase String
		//va,os a declarar un afrase para posteriormente utilizar algunos metodos 
		String frace = "Hoy es martes 8 de Octubre de 2024";
		// primero veremos el metodo .leng() -> que nos devielve la longitud o el total de los caracteres de un String
		System.out.println("provando los metos .length()");
		System.out.println(frace.length());
		// como el valor que devuelve este metodo es de tipo entero 
		// se puede guardar como variable 
		int longitud = frace.length();
		
		//.charAt() -> nos permite devolver un caracter que se encuentra en un indice determinado
		
		System.out.println("provando el metodo .charAt()");
		System.out.println(frace.charAt(0));
		//podemos combinar metodos para expresar conbinaciones y asi obtener el ultimo caracter
		System.out.println(frace.charAt(frace.length()-1));
		//-subSting() -> nos devuelve una subcadena a partir del indice especificado
		System.out.println("provando el metodo .substring()");
		System.out.println(frace.substring(2));
		System.out.println(frace.substring(frace.length()-4));
		
		//.toLowerCase() permite convertir todos los caracteres en minusculas 
		// .toUperCase() permite convertir todos los caracteres en mayusculas
		System.out.println("provando el metodo .toLowerCase()"); 
		System.out.println(frace.toLowerCase());
		System.out.println("provando el metodo .toUpperCase()"); 
		System.out.println(frace.toUpperCase());
		
		//. equals -> devuelve un valor booleano si los objetos o cadenas compaaradas son iguales 
		// este metodo es sensible a mayusculas y minusculas 
		System.out.println("Provando el metodo .equals()");
		System.out.println(frace.equals("Hoy es martes 8 de OctubrE de 2024"));
		
		// .equalsIgnoreCase() duveuelve el mismo contenido ignorando mayusculas y minusculas
		System.out.println("Provando el metodo .equalsIgnoreCase()");
		System.out.println(frace.equalsIgnoreCase("Hoy es martes 8 de OctubrE de 2024"));
		
		//.replace -> reemplaza un carcater viejo con uno nuevo o una secuencia de ellos con otras secuencias 
		System.out.println("Provando el metodo .replace()");
		System.out.println(frace.replace("2024", "2030"));
		System.out.println(frace.replace("r", "R"));
		System.out.println(frace.replace(" ", "_"));

		// pool de strings 
		// cuando tenenmos un mismo contenido de cadena de texto en lugar de crear un nuevo String
		//se apunta al mismo espacio de memoria y se puede utilizar entonces al comparador u operador logico
		
		String hola1 = "Hola";
		String hola2 = "Hola";
		//ahora veamos que paasa si tenemos un String pero inicia como un nuevo objeto
		String hola3 = new String("Hola");
		String hola4 = "H"+"o"+"l"+"a";
		System.out.println("comprobando el POOL de String");
		if (hola1.equals(hola3) && hola2.equals(hola4)) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
	}

}
