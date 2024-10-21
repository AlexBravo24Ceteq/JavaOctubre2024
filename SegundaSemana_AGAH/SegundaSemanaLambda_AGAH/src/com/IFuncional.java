package com;

@FunctionalInterface
//Esta funcion obliga a la interface a tener solo 
//un metodo declarado

public interface IFuncional {
	
	//Una interface funcional es aquella que tiene declarada un
	//solo metodo abstracto
	//Puede llevar la anotacion @FunctionalInterface
	
	public void operacion(int a, int b);
//	public void saludo (String hola);
//	

}
