package com;

@FunctionalInterface // decorador
public interface IFuncional {
	
	// una interface funcional es aquella que tiene
	// declarada un solo método abstracto, puede llevar
	// la notación FunctionalInterface
	
	public void operacion();
	
	// una vez puesto el decorador @FunctionalInterface
	// obliga a la interface a tener un solo metodo declarado
}
