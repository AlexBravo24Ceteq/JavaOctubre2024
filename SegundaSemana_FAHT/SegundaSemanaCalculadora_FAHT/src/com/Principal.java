package com;

public class Principal {

	public static void main(String[] args) {
		
		Cient�fica calculo1 = new Cient�fica("Casio", "Blanca", 1500, true, 10,10,10);
        System.out.println(calculo1);
        
        
		calculo1.sumar();
		System.out.println(" ");
		
		Cient�fica calculo2 = new Cient�fica("Casio", "Blanca", 1500, true, 10,10,10);
        System.out.println(calculo2);
        calculo1.restar();
        
        calculo1.tomarTemperatura();
	}//end

}
