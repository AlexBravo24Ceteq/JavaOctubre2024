package com;

public class MetodosString {

	public static void main(String[] args) {
		
		String frase = "Hoy es Martes 8 de Octubre del 2024";
		String frase2 = "hOy Es MaRtEs 8 de OcTuBrE dEl 2024";
		
		System.out.println("Probando el método .lenght()");
		System.out.println(frase.length());
		
		System.out.println("Probando el método .substring()");
		System.out.println(frase.substring(2));
		System.out.println("Probando el método .substring() con 2 indices: ");
		System.out.println(frase.substring(2,30));
		
		System.out.println("Probando el método .toLowerCase()");
		System.out.println(frase.toLowerCase());
		
		System.out.println("Probando el método .toUpperCase()");
		System.out.println(frase.toUpperCase());
		
		System.out.println("Probando el método .equals()");
		System.out.println(frase.equals(frase2));
		
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(frase.equalsIgnoreCase(frase2));
		
		System.out.println("Probando el método .replace()");
		System.out.println(frase.replace("2024", "3038"));
		
		System.out.println("Probando el método .replace()");
		System.out.println(frase.replace(" ", "_"));
		
		System.out.println("Probando el método .replace()");
		System.out.println(frase2.replace("e", "3"));

	}

}
