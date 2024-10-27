package com.condicionales;

import java.util.Scanner;

public class Condicionales3_OHH {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

		Scanner entrada = new Scanner(System.in); 

        int numero1, numero2;              
        float div;
        
        System.out.println("Introduzca un número: "); 
        numero1 = entrada.nextInt(); 

        System.out.println("Introduzca otro número: "); 
        numero2 = entrada.nextInt(); 

        if (numero2!=0) {
        	div=(float)numero1/numero2;
        	System.out.print("El resultado de la división de " +numero1+"/"+numero2+" es: ");
        	System.out.printf("%.2f ",div);
                }
        else  {
        	System.out.println("El segundo número debe ser diferente de 0\nVuelva a intentarlo");
        }
		
	}

}
