package com;

public class Interfaces {
	//Supongamos que tenemos una calse padre calculadora
	//heredam,os a una clase hija calculadora cientifica, pero de esta misma
	//queremos implementar metodos de un termomentro, como medir temperatura
	//En java no se puede realizar la multiherencia
	//pero para simularlo ocupamos las interfaces, las cuales nos ayudan
	//a solucionarlo
	
	//diferencia entre clase abstracta y interfaz
	//la interface no puiede hacer nadfa por si sola, es practicamente un contrato
	//en donde las clases que la implementen deben
	//obligatoriamente, definir el comportamiento de todos los metodos abstractos, contestando a la pregunta
	//como se debe hacer?
	
	//una interfaz no puede heredar nada, no se toma como una clase padre
	//la interfaz no tiene atributos ni nada diferente, solo metodos vacios
	
	//para poder usarlo se usa implements, se puede implementar muchas veces interfaces pero solo de 1 clase padre
	
	//La multiherencia en java no existe
	//aqui en java se puede simular el tema de la multiherencia
	//con el uso de interfaces
	//La implementacion de una interface o mas de una
	//se hace con la palabra reservada implements
	//es decir, te deja implementar mas de 1 interfaz
	//Estructura para implementar
	//implements Interfaz1, Interfaz2
}
