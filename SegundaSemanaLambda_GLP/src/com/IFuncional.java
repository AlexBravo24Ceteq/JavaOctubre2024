package com;

@FunctionalInterface
//Si ponemos la anotacion/decorador obliga a la interface
	//a tener solo un metodo declarado

//no es necesaria la anotacion, pero se declara para que nos deje ocuparla con
//expresion lambda
public interface IFuncional {
	
	//Una Interface funcional es aquella que
	//tiene declarada un solo metodo abstracto
	//Puede llevar la anotacion @FunctionalIterface
	
	//no son metodos definidos
	//van cambiando con forme nosotros queramos
	public void operacion(int a, int b);


}
