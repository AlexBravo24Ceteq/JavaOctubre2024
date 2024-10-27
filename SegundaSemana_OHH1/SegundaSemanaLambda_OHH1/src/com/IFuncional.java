package com;

@FunctionalInterface
// Esta anotación obliga a la interface a tener solo
// un método declarado
public interface IFuncional {

	// Una interface funcional es aquella que 
	// tiene declarado un solo método abstracto
	// Puede llevar la anotación @FunctionalInterface
	
	public void operacion (int a, int b);
	//public void saludo (String hola);
	
	
	
	
	
}
