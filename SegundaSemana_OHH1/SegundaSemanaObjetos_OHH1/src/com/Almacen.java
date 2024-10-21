package com;

public class Almacen { 

	// PILAR DE ABSTRACCION	
	// La idea de qu� atributos componen y necesito de ese objeto
	// plasmar aqu�
	
	// Atributos
	// Para proteger la info de manipulaciones no autorizadas
	// se utiliza el pilar del ENCAPSULAMIENTO con los siguientes modificadores
	// de acceso: private, public, protected y default
	
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	// Modificador static - crear variables o m�todos de clase.
	// Es decir, todos los objetos creados con este modificador
	// en este atributo tendr�n valor de 100
	// Modificador final - se utiliza para crear constantes
	// y si va de la mano con static, creamos constantes de clase o valores inmutables
	private final static int capacidad = 100;
	private boolean perecederos;
	
	// Necesitamos por lo menos, alg�n m�todo constructor para poder
	// crear nuestros objetos
	
	// M�todo constructor vac�o - nos permite crear nuestro objeto
	// sin necesidad de agregarle valor a sus atributos
	
	public Almacen() {
		
	}
	// M�todo Constructor con todos los argumentos
	public Almacen(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		this.perecederos = perecederos;
	}
		// M�todo constructor con solo dos argumentos
		// me va a permitir crear un Almac�n solo con dos argumentos, tipo de productos y 
	    // boolean perecederos
		public Almacen(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
		}
	
		// M�todos Getters y Setters
		// M�todos Get, devuelven el valor de determinado atributo
		// M�todos Set nos permiten establecerle un valor a nuestros atributos privados
	
	
	public String getTipoAlmacen() {
		return tipoAlmacen;
	}
	public void setTipoAlmacen(String tipoAlmacen) {
		this.tipoAlmacen = tipoAlmacen;
	}
	public String getTipoProductos() {
		return tipoProductos;
	}
	public void setTipoProductos(String tipoProductos) {
		this.tipoProductos = tipoProductos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCapacidad() {
		return capacidad;
	}
//	public void setCapacidad(int capacidad) {
//		this.capacidad = capacidad;
//	}
	
	//	public static void setCapacidad(int capacidad) {
//		Almacen.capacidad = capacidad;
//	}
	
	public boolean getPerecederos() {
		return perecederos;
	}
	
	public void setPerecederos(boolean perecederos) {
		this.perecederos = perecederos;
	}
	
	// M�todo toString()
	// nos va a permitir conver a valores string todos los atributos de nuestro objeto
	//para poder verlos en consola. (Sirve como radiograf�a para ver c�mo est� compuesto
	// nuestro objeto
	
	@Override  // Anotaci�n que significa sobreescritura
	// Es decir, este m�todo se sobreescribe o modifica para mostrar la info de
	// este objeto en espec�fico
	// Ej. si creamos una clase Pastel, en realidad se utiliza este mismo m�todo
	// pero se sobreescribe para mostrar los atributos de los objetos Pastel
	public String toString() {
		return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + "]";
	}
	
	
	
}


