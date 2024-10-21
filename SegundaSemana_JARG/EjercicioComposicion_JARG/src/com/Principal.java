package com;

public class Principal {

	public static void main(String[] args) {
		BiscochoBase base = new BiscochoBase("Mantequilla", "Rosetones", "Chocolate");
		BiscochoMedio medio = new BiscochoMedio("Azucar", "Picos de merengue", "Vainilla");
		BiscochoFinal tercio = new BiscochoFinal("Crema Batida", "Chispitas", "Cajeta", "Feliz Cumpleaños", 4);
		
		Pastel pedido1 = new Pastel(12345, "Juan Antonio", 500, base, medio, tercio);
		
		System.out.print(pedido1);

	}

}
