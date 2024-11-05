package com;

public class EstructuraCondicionalesJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 12;
		
		if(x<12) {
			System.out.println("cierto");
		}else {
			System.out.println("Falso");
		}
		
		//Condiciones compuestas con operadores logicos
		//AND, OR, NOT, IGUALDAD Y DIFERENTE DE
		
		//AND - && - dEVUELVE EL PRIUMER BLOQUE (TRUE) CUANDO SE CUMPLAN
		//Todas las condiciones
		System.out.println("Operador AND &&");
		
		if(x<=21 && x>14) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//OR - || - dEVUELVE TRUE cuando se cumpla al menos una condicion
		System.out.println("Operador OR ||");
		
		if(x<=21 || x>14) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//NOT - ! - Niega una condicion o cambia su valor de true a false y viceversa
		System.out.println("Operador NOT  !");
		
		if(!(x>1)) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//Igualdad - == - Compara un valor contra otro y revisa si son igfuales
		//Este operadoir se recomienda para valores numericos
		
		System.out.println("Operador Igualdad  ==");
		
		if(x==12) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//Diferente de - != - Compara un valor contra otro y si son diferentes
		//Manda true
		
		System.out.println("Operador Igualdad  ==");
		
		if(x != 12) {
			System.out.println("Cierto");
		}else {
			System.out.println("Falso");
		}
		
		//Estructura if else anidado
		
		int d = 2;
		
		if(d == 1 ) {
			System.out.println("Lunes");
		}else if (d==2) {
			System.out.println("Martes");
		}else if (d==3) {
			System.out.println("Miercoles");
		}else if (d==4) {
			System.out.println("Jueves");
		}else if (d==5) {
			System.out.println("Viernes");
		}else {
			System.out.println("No es ninguno");
		}
		
		switch(d) {
		case 1 :
			System.out.println("Enero");
			break;
		case 2 :
			System.out.println("Febrero");
			break;
		case 3 :
			System.out.println("Marzo");
			break;
		case 4 :
			System.out.println("Abril");
			break;
		default :
			System.out.println("Error de mes");
			break;
		}
		
	}

}
