package com;

public class Principal {

	public static void main(String[] args) {
		
		Científica calculo1 = new Científica("Casio", "Blanca", 1500, true, 10,10,10);
        System.out.println(calculo1);
        
        
		calculo1.sumar();
		System.out.println(" ");
		
		Científica calculo2 = new Científica("Casio", "Blanca", 1500, true, 10,10,10);
        System.out.println(calculo2);
        calculo1.restar();
        
        calculo1.tomarTemperatura();
	}//end

}
