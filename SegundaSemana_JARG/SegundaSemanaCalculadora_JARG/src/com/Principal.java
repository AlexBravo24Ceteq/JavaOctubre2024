package com;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int opcion;
		Scanner scan = new Scanner(System.in);
		cientifica calc = new cientifica();
		System.out.println("Esta es la calculadora" + "\n" +calc.toString());
		System.out.println("Que desea realizar?:"
				+ "\n1 para suma"
				+ "\n2 para resta"
				+ "\n3 para multiplicacion"
				+ "\n4 para division");
		opcion = scan.nextInt();
		switch (opcion){
		case 1:
			cientifica sum = new cientifica();
			sum.suma();
			break;
		case 2:
			cientifica res = new cientifica();
			res.rest();
			break;
		case 3:
			cientifica mul = new cientifica();
			mul.mult();
			break;
		case 4:
			cientifica div = new cientifica();
			div.divi();
			break;
		default:
			System.out.println("ERROR! Selecciona otra opcion");
			break;
	}
		scan.close();
	}

	
}
