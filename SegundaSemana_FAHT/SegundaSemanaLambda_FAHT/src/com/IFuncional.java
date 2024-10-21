package com;

@FunctionalInterface
//Esta anotacion obliga a la interface a tener
//
public interface IFuncional {

	//Una interface funcional es aquella que
	//tiene declarada un solo metodo abstracto
	//puede llevar la anotación @FunctionalInterface
	
	//declaro el metodo abstracto
	public void operacion (int a,int b);
//	public void saludo (String hola);
}//end
