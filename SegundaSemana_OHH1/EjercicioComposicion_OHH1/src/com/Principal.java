package com;

public class Principal {

	public static void main(String[] args) {
		
		Motor gasolina = new Motor("HONDA", 900, 3);
		Rines aluminio = new Rines("VENTO", "Rojo", 17);
		Frenos disco = new Frenos("HONDA", "Hidr�ulico", 356);
		
		Motocicleta hp = new Motocicleta("HONDA", "CBR 1000RR-R", "Rojo", gasolina, aluminio, disco);
		
		System.out.println(hp);

	}

}
