package com;

@FunctionalInterface // decorador
public interface IFuncional {
	
	// una interface funcional es aquella que tiene
	// declarada un solo m�todo abstracto, puede llevar
	// la notaci�n FunctionalInterface
	
	public void operacion();
	
	// una vez puesto el decorador @FunctionalInterface
	// obliga a la interface a tener un solo metodo declarado
}
