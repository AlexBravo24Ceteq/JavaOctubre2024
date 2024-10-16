package com;

public class MetodosString {

	public static void main(String[] args) {
		//M�todos o funcionalidades de la clase String
		
		//Vamos a declarar una frase para posteriormente utilizar algunos m�todos
		
		String frase = "Hoy es martes 8 de octubre de 2024";
		
		//.length - nos devuelve el valor entero
		//la longitud o total de caracteres de un String
		
		System.out.println("Probando el m�todo .length () ");
		System.out.println(frase.length());
		
		//Como el valor que devuelve este m�todo es de tipo entero
		//lo puedo guardar en una variable para su uso posterior
		
		int longitud = frase.length();
		
		//.charAt() - nos devuelve el caracter que se encuentra en un 
		//�ndice determinado
		
		System.out.println("Probando el m�todo .charAt() ");
		System.out.println(frase.charAt(0));
		//Ej. podemos combinar m�todos para expresar operaciones y as� obtener 
		//el �ltimo caracter
		
		System.out.println(frase.charAt(frase.length()-1));
		
		//.substring() - nos devuelve una cadena a partir del �ndice especificado
		System.out.println("Probando el m�todo .substring() ");
		System.out.println(frase.substring(2));
		System.out.println(frase.substring(2,30));
				
		//.toLowerCase()/ .toUpperCase()
		//El primero comvierte la cadena de texto a min�sculas y el segundo
		//a may�sculas
		System.out.println("Probando el m�todo .toLowerCase() ");
		System.out.println(frase.toLowerCase());

		System.out.println("Probando el m�todo .toUpperCase() ");
		System.out.println(frase.toUpperCase());
		
		//.equals - devuelve un valor booleano true si los objetos o cadenas
		//comparadas son iguales. Este m�todo es sensible a may�sculas y min�sculas
		
		
		
		//.iqualsIgnoreCase() - devuelve true comparando el contenido, ignorando el uso 
		//de may�sculas y min�sculas
		System.out.println("Probando el m�todo .equals() ");
		System.out.println(frase.equalsIgnoreCase("hOy Es MaRtEs 8 De OcTuBrE dE 2024"));
		
		//.replace - reemplaza un caracter viejo con uno nuevo, una secuencia de ellos con otra secuencia

//		System.out.println("Probando el m�todo .replace() ");
//		System.out.println(frase.replace("2024", "2030"));
//		System.out.println(frase.replace("r", "$"));
//		System.out.println(frase.replace(" ", "_"));
//		System.out.println(frase.replace("m", "#"));
//		
		//POOL DE STRINGS
		//Cuando tenemos un mismo contenido de cadena de texto en lugar 
		//de crearse un nuevo String, se apunta hacia un mismo espacio en 
		//memoria y se puede utilizar entonces el comparador u operador l�gico ==
		
		String hola1 = "Hola";
		String hola2 = "Hola";
		
			
		System.out.println("Comprobando el POOL de Strings");
		if (hola1==hola2) {
			System.out.println("Cierto");
			}
		else {
			System.out.println("Falso");
		}
		
		
		//Ahora veamos qu� pasa si tenemos un String pero iniciado como 
				//un nuevo objeto
				
				String hola3 = new String ("Hola");
		
				if (hola1.equals(hola3)) {  // iquals compara el contenido, no la ubicaci�n
					System.out.println("Cierto");
					}
				else {
					System.out.println("Falso");
				}
				
				String hola4 = "H" + "o" + "l" + "a";
				if (hola1==hola4) {  // iquals compara el contenido, no la ubicaci�n
					System.out.println("Cierto");
					}
				else {
					System.out.println("Falso");
				}
	}

}
