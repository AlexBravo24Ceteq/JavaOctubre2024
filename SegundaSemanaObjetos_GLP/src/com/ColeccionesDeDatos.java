package com;

public class ColeccionesDeDatos {
	//Es un conjunto de elememtps som im prdem em concreto
	//En java no es una clase sino un interface
	//Por debajo de Collection esta
	//el interface List que hace referencia a un grupo de elementos
	//accesibles por posicion.
	//Este interface incluye el metodo get para acceder a cualquier posicion de lista
	
	//Las colecciones de datos si pueden crear nuevos espacios en tiempo de ejecucion
	
	
	//Tipos de colecciones
	//1. SET
	//La interfaz Set define una coleccion que no puede contener elementos duplicaods.
	//Esta interfaz contiene, unicamente, los metodos heredados de Collection añadiendo la restriccion de que los
	//elementos duplicados estan prohibidos
	
	//Dentro de la interfaz Set existen varios tipos de implementaciones realizadas dentro de la plataforma Java. Vmos a analizar cada una de ellas:
	
	//.Hashset
	//Esta implementacion almacena los elementos en una tabla hash. Es la implementacion con mejor rendimiento de todas, pero no garantiza ningun orden
	//a la hora de realizar iteraciones
	
	//.TreeSet
	//Esta implementacion almacena los elementos ordenadolos en funcion de sus valores
	
	//.LinkedHasSet
	//Esta implementacion almacena los elementos en funcion del orden de insercion
	
	//2-List
	//La Interfaz List define una sucesion de elementos. la interfaz List si admite elementos duplicados
	//A parte de los metodos heredados de Collection, añade metodos que permiten mejorar los siguentes putnso:
	//Dentro de la interdaz List existen varios tipos de implementaciones realizadas dentro de la plataforma Java
	
	//.ArrayList: Se bada en un array redimensionable que aumenta su tamaño segun crece la coleccion de elementos
	
	//.LinkedList
	//Permite que mejore el rendimiento en ciertas ocasiones, Esta implementacion
	//se bada en una lista doblemente enlazada de los elementos
	//teniendo cada uno de los elementos un puntero al anterior y al siguiente elemento
	
	//metodos utilizados 
	//.add - Agregar elementos 
	//.remove - eliminar elementos
	
	//3- MAP
	//La interfaz Map asoca claves a valores. Estas interfaz no puede contener claves duplicadas y;
	//cada uina de dichas claes, solo puede tener asociado un valor como maximo
	//Dentro de la interfaz Map existen varios tipos de implementaciones realizadas dentro de la plataforma Java
	
	//.HashMap
	//Esta implementacion almacena las claves en una tabla hash. proporciona tiempos constantes en las operaciones basicas siempre 
	//y cuando la funcion hash disperse de forma correcta los elementos dentro de la tabla
	
	//.TreeMap 
	//Almacena las claves ordenandolas en funcion de sus valores
	//Es bastante mas lento que HashMap
	
	//.LinkedHashMap
	//Almacena las claves en funcion del orden de insercion
	//Nnguna de estas implementaciones son sincronizadas, es decior, nmose garantiza el estado del Map si dos o mas hilos
	//accede de forma concurrente al mismo
	//Esto se puede solucionar empleando una serie de metodos que actuan de wrapper para dotar a estas colecciones de esta falta de
	//sincronizacion

	//Stream
	
	
	
}