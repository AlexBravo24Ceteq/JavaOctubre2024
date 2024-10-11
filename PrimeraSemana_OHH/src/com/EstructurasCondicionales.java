package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
//		int x = 12;
		
//		if(x <= 12) {
//			System.out.println("Con >, <, <=, >=: Cierto");
//		}else {
//			System.out.println("Con >, <, <=, >=: Falso");
//		}
//		
//		if(x <= 2 && x > 14 ) {
//			System.out.println("Con AND: Cierto");
//		}else {
//			System.out.println( "Con AND: Falso");
//		}
//		
//		if(x <= 2 || x > 14 ) {
//			System.out.println("Con OR: Cierto");
//		}else {
//			System.out.println("Con OR: Falso");
//		}
//		
//		if(!(x > 1)) {
//			System.out.println("Con NOT: Cierto");
//		}else {
//			System.out.println("Con NOT: Falso");
//		}
//		
//		if(x == 12) {
//			System.out.println("Con Igualdad: Cierto");
//		}else {
//			System.out.println("Con Igualdad: Falso");
//		}
//		
//		if(x == 12) {
//			System.out.println("Con Igualdad: Cierto");
//		}else {
//			System.out.println("Con Igualdad: Falso");
//		}
//		
//		if(x != 12) {
//			System.out.println("Con Diferente: Cierto");
//		}else {
//			System.out.println("Con Diferente: Falso");
//		}
//		int d = 2;
//		
//		if(d == 1) {
//			System.out.println("Lunes");
//		}else if(d == 2){
//			System.out.println("Martes");
//		}else if(d == 3) {
//			System.out.println("Miércoles");
//		}
		
		int d = 2;
		
		switch(d) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		default:
			System.out.println("Mes no valido");
			break;
		}
		
	}

}
