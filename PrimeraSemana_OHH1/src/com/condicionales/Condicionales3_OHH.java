package com.condicionales;

import java.util.Scanner;

public class Condicionales3_OHH {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado
		//de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.

		Scanner entrada = new Scanner(System.in); 

        int numero1, numero2;              
        float div;
        
        System.out.println("Introduzca un n�mero: "); 
        numero1 = entrada.nextInt(); 

        System.out.println("Introduzca otro n�mero: "); 
        numero2 = entrada.nextInt(); 

        if (numero2!=0) {
        	div=(float)numero1/numero2;
        	System.out.print("El resultado de la divisi�n de " +numero1+"/"+numero2+" es: ");
        	System.out.printf("%.2f ",div);
                }
        else  {
        	System.out.println("El segundo n�mero debe ser diferente de 0\nVuelva a intentarlo");
        }
		
	}

}
