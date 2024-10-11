package com;

public class MetodosString {

	public static void main(String[] args) {
		// Métodos o funcionalidades de la clase String
		
		//Vamos a declarar uan frase para posteriormente
		//utilizar algunos métodos
		String frase = "Hoy es Martes 8 de Octubre de 2024";
		
		//.leghth() - nos devuleve en valor entero
		// la longitud o total de caracteres de un String
		System.out.println("Probando el metodo .length() ");
		System.out.println(frase.length());
        //como el valor que devuelve este método es de tipo entero
        // lo puedo guardar en una variable para su uso posterior
		int longitud = frase.length(); //longitud (34)

		// .charAt() - nos devuelve el caracter que se encuentra en
		//un indice determinado
		System.out.println("Probando el metodo .charAt() ");
		System.out.println(frase.charAt(0));
		//ej. podemos conbimar métodos para expresar
		//operaciones y así obtener el ultimo caracter
		System.out.println(frase.charAt(frase.length()-1));
		
		//Método .substring() - nos devulve una subcadena
		// apartir de un indice especificado
		System.out.println("Probando el metodo .subtring() ");
		System.out.println(frase.substring(2));
		System.out.println(frase.substring(2,30));
		
		//Metodo .toLowerCase() 7 .toUpperCase
		//El primero convierte todo a minuscula y viceversa
		System.out.println("probando el metodo toLowerCase() ");
		System.out.println(frase.toLowerCase());
		
		System.out.println("probando el metodo toUpperCase() ");
		System.out.println(frase.toUpperCase());
		
		//.equals - devuelve un valor booleano true si los objetos
		// o cadenas comparadas son iguales
		//Este método es sensible a mayusculas y minusculas
		System.out.println("probando el metodo .equals() ");
		System.out.println(frase.contentEquals("hOy es MaRtEs 8 De OcTuBrE dE 2024"));
		
		//se puede evitar la sensibilidad a mayusculas con .equalsIgnoreCase
		System.out.println("probando el metodo .equalsIgnore Case() ");
		System.out.println(frase.equalsIgnoreCase("hOy es MaRtEs 8 De OcTuBrE dE 2024"));
		
		//.replace - sustituye caracter viejo con uno nuevo
		// o una sentencia de ellos con otra secuencia
		System.out.println("probando el metodo .replace() ");
		System.out.println(frase.replace("2024", "2030"));
		System.out.println(frase.replace("r", "$"));
		System.out.println(frase.replace(" ", "_"));
		
		//Pool de strings
		// cuando tenemos un mismo contenido en cadena de texto
		//enlugar de crearse un nuevo string, se apunta un mismo 
		//espacio en memoria y se puede utilizar entonces el comparador
		// u operador logico ==
		String hola1= "hola";
		String hola2= "hola";
		//Ahora veamos que pasa si tenemos un string pero iniciando como
		//nuevo objeto
		String hola3 = new String("hola");
		
		System.out.println("Comprobando el Pool Strings");
		
		if (hola1.equals(hola3) ) {
			System.out.println("cierto");
		}else {
			System.out.println("falso");
		}
				
	}// end

}
