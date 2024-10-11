package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras condicionales o de desición if
		// Evaluan valores booleanos
		
		/*Si (esto se cumple) {
		 * se ejecuta este bloque de codigo
		 * } si no {
		 * ejecuta este otro bloque}
		 */
         int x = 12;	
         System.out.println("Estructura If");
        //Evaluamos
         if (x<15) {
        	 System.out.println("cierto");
         }else { 
        	 System.out.println("falso");
         }
         //Condiciones compuestas con operadores logicos
         //AND, OR, NOT, IGUALDAD Y DIFERENTE DE
         
         //AND-&&- devuelve el primer bloque (true) cuando se 
         //cumplen tosas las condiciones
         System.out.println("Operador And &&");
         
         if (x<=21 && x>14) {
        	 System.out.println("cierto");
         }else { 
        	 System.out.println("falso"); 
         }
         
         //OR -||-Devuelve true cuando se cumpla almenos una condición
         System.out.println("Operador OR ||");
         
         if (x<=21 || x>14) {
        	 System.out.println("cierto");
         }else { 
        	 System.out.println("falso"); 
         }
         
         //Not- !- Niega una condición o cambia su 
         //valor de true a false & viceversa
         System.out.println("Operador NOT ! ");
         
         if (!(x>1)) {
        	 System.out.println("cierto");
         }else {
        	 System.out.println("falso");
         }
         //Igualdad- ==- compara un valor contra otro y revisa
         // si son iguales, este operador es mas recomendado
         //para valores numéricos
         System.out.println("Operador igualdad ==");
         
         if (x == 12) {
        	 System.out.println("cierto");
         }else {
        	 System.out.println("falso");
         }
         
         //Diferente de- !=- compara un valor contra otro y
         //si son diferentes manda true
 System.out.println("Operador diferente de !=");
         
         if (x != 12) {
        	 System.out.println("cierto");
         }else {
        	 System.out.println("falso");
         }
         //Escrutura IF ELSE anidado
         System.out.println("Estructura if else anidado");
         int d=2;
         
         if (d==1) {
        	 System.out.println("Lunes");
         } else if (d==2) {
        	 System.out.println("Martes");
         } else if (d==3) {
        	 System.out.println("Miercoles");
         } else if (d==4) {
        	 System.out.println("Jueves");
         } else if (d==5) {
        	 System.out.println("Viernes");
         } else {
        	 System.out.println("Error de dia");
         }
         // Switch Case- sirve para evaluar o ejecutar bloques
         // de codigo en funcion del cambio de valor de una variable
         System.out.println("Estructura switch:");
         switch (d) {
         case 1:
        	 System.out.println("Enero");
        	 break;
         case 2:
        	 System.out.println("febreo");
        	 break;
         case 3:
        	 System.out.println("marzo");
        	 break;
         case 4:
        	 System.out.println("abril");
        	 break;
         default:
        	 System.out.println("error de mes");
        	 break;
         }
         
	}//main
}//END
