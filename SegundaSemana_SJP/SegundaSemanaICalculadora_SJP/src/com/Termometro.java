package com;

public abstract class Termometro {
	
	public abstract void tomarTemperatura();
	
	//De esta manera no es posible heredar la informacion de Termometro.
	//No es posible utilizar extends. Por lo que hacemos uso de 
	//INTERFACES con implements
}
