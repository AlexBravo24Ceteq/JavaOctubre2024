package com_actividad1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor repsol = new Motor(190, 1, "2T");
		Llanta michelin = new Llanta("Michelin", true, 3500);
		Frenos brenta = new Frenos(true, true, true);
		
		Moto honda = new Moto("Honda", "CB repsol", "Naranja", repsol, michelin, brenta);
		System.out.println(honda);
		
	}//end

}
