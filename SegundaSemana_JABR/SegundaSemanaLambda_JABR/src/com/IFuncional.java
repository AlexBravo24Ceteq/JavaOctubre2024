package com;

@FunctionalInterface
//Esta anotacion obliga a la interface a tener solo
//un m�todo declarado
public interface IFuncional {
	
	//Una interface funcional es aquella que
	//tiene declarada un s�lo m�todo abstracto
	//Puede llevar la anotaci�n @FunctionalInterface
	
	public void operacion (int a, int b);
	//public void saludo (String hola);
	

}
