package com.ciclos;

import java.util.Scanner;

public class Ciclos3_SJP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		String cadena;
		char [] palindromo; //Se define como char ya que es una cadena de caracteres
		int cadNor, cadInv;
		System.out.println("Ingresa la cadena a analizar: "); //Se pide al usuario ingresar la palabra 
		cadena = entrada.nextLine();
		cadena = cadena.toLowerCase();//De esta manera aunque se pongan mayusculas lo va a detectar 
		cadena = cadena.replace(" ",""); //Para quitar los espacios en blanco.
		palindromo= cadena.toCharArray(); //Separa letra por letra
		
	    cadNor = 0;
		cadInv = palindromo.length-1; //Nos indica el tamaño de la palabra se agrega -1 porque la númeración empieza en 0
				
		while (cadNor<cadInv) { //Realiza la comparación
			if(palindromo[cadNor]== palindromo[cadInv]) {
				cadInv--;
				cadNor++;
			} else {
				System.out.println("La cadena no es un palíndromo");
			break;
			}
		}
				
		
		if (cadNor==cadInv) {
			System.out.println("La cadena es palíndromo");
		}
	}

}
