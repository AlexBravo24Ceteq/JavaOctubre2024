package com;

public class MetodosString {

	public static void main(String[] args) {
		String frase = "Hoy es Martes 8 de Octubre de 2024";
		String fraseEquals = "HOY es MarTes 8 de Octubre DE 2024";
		int longitud;
		
		longitud =  frase.length();
		
		System.out.println("La longitud de la frase es de: " + longitud);
//		System.out.println("Extrayendo " + frase.charAt(10));
		System.out.println("�ltimo caracter " + frase.charAt(frase.length()-1));
		System.out.println("hasta el indice 2: " + frase.substring(2));
		System.out.println("un rango de 2 a 30: " +frase.substring(2, 30));
		System.out.println("cambiando a min�sculas: " + frase.toLowerCase());
		System.out.println("cambiando a may�sculas: " + frase.toUpperCase());
		
		System.out.println("M�tod equals: " + frase.contentEquals(fraseEquals));
		System.out.println("M�todo replace n�meros: " + frase.replace("2024", "2030s"));
		System.out.println("Metodo replace car�cteres:" + frase.replace("s", "$"));
	}

}
