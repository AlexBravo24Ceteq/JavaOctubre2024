package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adulto miguel = new Adulto("Miguel", "Masculino", 65);
		
		Pensionado beatriz = new Pensionado("Beatriz", "Femenino", 70, 258640, "CRDB780415HPLRRD00", 8000);
	
		System.out.println(miguel);
		System.out.println(beatriz);
		}
	
}
