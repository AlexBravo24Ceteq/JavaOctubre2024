package com;

public class Principal {

	public static void main(String[] args) {
		Cientifica casio = new Cientifica("Casio", "FX 82MS SC", "Gris", 450, true);
		System.out.println(casio);
		System.out.println("-CALCULADORA CIENTIFICA-");	
		System.out.print("Resultado de la suma= ");	
		System.out.println(casio.sumar(5, 11, 6));
		System.out.print("Resultado de la resta= ");
		System.out.println(casio.restar(11, 5));
		System.out.print("Resultado de la multiplicacion (3 numeros)= ");
		System.out.println(casio.multiplicar(11, 5, 8));
		System.out.print("Resultado de la division (3 numeros)= ");
		System.out.println(casio.dividir(10, 2, 3));
		System.out.println();
		casio.multiplicar(1, 4, 3);
		casio.dividir(5, 2, 2);
		casio.multiplicar();
		casio.dividir();
	}

}
