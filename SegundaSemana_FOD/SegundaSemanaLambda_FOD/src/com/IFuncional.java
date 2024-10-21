package com;

//esta anotacion obliga a la clase a tener solo un metodo declarado
@FunctionalInterface

public interface IFuncional {
	//una interface funcional es aquella que tienen declarada un solo metodo abstracto
	//puede llevar la anotacion @FuntionalInterface
	public void operacion(int a, int b);
	//public void saludo(String hola);
	

}
