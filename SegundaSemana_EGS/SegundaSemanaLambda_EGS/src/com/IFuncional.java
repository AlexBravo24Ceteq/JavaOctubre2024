package com;

@FunctionalInterface
//Esta notacion obliga a la interface a tener solo un metodo declarado
public interface IFuncional {

	// Una interface funcional es aquella que tiene declarado solo un metodo
	// abstracto. Puede llevar la anotacion @FunctionalInterface
	
	public void operacion(int a, int b);
	//public void saludo (String hola);

}
