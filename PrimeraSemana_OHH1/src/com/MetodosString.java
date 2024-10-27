package com;

public class MetodosString {

	public static void main(String[] args) {
		//Métodos o funcionalidades de la clase String
		
		//Vamos a declarar una frase para posteriormente utilizar algunos métodos
		
		String frase = "Hoy es martes 8 de octubre de 2024";
		
		//.length - nos devuelve el valor entero
		//la longitud o total de caracteres de un String
		
		System.out.println("Probando el método .length () ");
		System.out.println(frase.length());
		
		//Como el valor que devuelve este método es de tipo entero
		//lo puedo guardar en una variable para su uso posterior
		
		int longitud = frase.length();
		
		//.charAt() - nos devuelve el caracter que se encuentra en un 
		//índice determinado
		
		System.out.println("Probando el método .charAt() ");
		System.out.println(frase.charAt(0));
		//Ej. podemos combinar métodos para expresar operaciones y así obtener 
		//el último caracter
		
		System.out.println(frase.charAt(frase.length()-1));
		
		//.substring() - nos devuelve una cadena a partir del índice especificado
		System.out.println("Probando el método .substring() ");
		System.out.println(frase.substring(2));
		System.out.println(frase.substring(2,30));
				
		//.toLowerCase()/ .toUpperCase()
		//El primero comvierte la cadena de texto a minúsculas y el segundo
		//a mayúsculas
		System.out.println("Probando el método .toLowerCase() ");
		System.out.println(frase.toLowerCase());

		System.out.println("Probando el método .toUpperCase() ");
		System.out.println(frase.toUpperCase());
		
		//.equals - devuelve un valor booleano true si los objetos o cadenas
		//comparadas son iguales. Este método es sensible a mayúsculas y minúsculas
		
		
		
		//.iqualsIgnoreCase() - devuelve true comparando el contenido, ignorando el uso 
		//de mayúsculas y minúsculas
		System.out.println("Probando el método .equals() ");
		System.out.println(frase.equalsIgnoreCase("hOy Es MaRtEs 8 De OcTuBrE dE 2024"));
		
		//.replace - reemplaza un caracter viejo con uno nuevo, una secuencia de ellos con otra secuencia

//		System.out.println("Probando el método .replace() ");
//		System.out.println(frase.replace("2024", "2030"));
//		System.out.println(frase.replace("r", "$"));
//		System.out.println(frase.replace(" ", "_"));
//		System.out.println(frase.replace("m", "#"));
//		
		//POOL DE STRINGS
		//Cuando tenemos un mismo contenido de cadena de texto en lugar 
		//de crearse un nuevo String, se apunta hacia un mismo espacio en 
		//memoria y se puede utilizar entonces el comparador u operador lógico ==
		
		String hola1 = "Hola";
		String hola2 = "Hola";
		
			
		System.out.println("Comprobando el POOL de Strings");
		if (hola1==hola2) {
			System.out.println("Cierto");
			}
		else {
			System.out.println("Falso");
		}
		
		
		//Ahora veamos qué pasa si tenemos un String pero iniciado como 
				//un nuevo objeto
				
				String hola3 = new String ("Hola");
		
				if (hola1.equals(hola3)) {  // iquals compara el contenido, no la ubicación
					System.out.println("Cierto");
					}
				else {
					System.out.println("Falso");
				}
				
				String hola4 = "H" + "o" + "l" + "a";
				if (hola1==hola4) {  // iquals compara el contenido, no la ubicación
					System.out.println("Cierto");
					}
				else {
					System.out.println("Falso");
				}
	}

}
