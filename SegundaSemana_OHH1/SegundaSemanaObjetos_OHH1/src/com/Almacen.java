package com;

public class Almacen { 

	// PILAR DE ABSTRACCION	
	// La idea de qué atributos componen y necesito de ese objeto
	// plasmar aquí
	
	// Atributos
	// Para proteger la info de manipulaciones no autorizadas
	// se utiliza el pilar del ENCAPSULAMIENTO con los siguientes modificadores
	// de acceso: private, public, protected y default
	
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	// Modificador static - crear variables o métodos de clase.
	// Es decir, todos los objetos creados con este modificador
	// en este atributo tendrán valor de 100
	// Modificador final - se utiliza para crear constantes
	// y si va de la mano con static, creamos constantes de clase o valores inmutables
	private final static int capacidad = 100;
	private boolean perecederos;
	
	// Necesitamos por lo menos, algún método constructor para poder
	// crear nuestros objetos
	
	// Método constructor vacío - nos permite crear nuestro objeto
	// sin necesidad de agregarle valor a sus atributos
	
	public Almacen() {
		
	}
	// Método Constructor con todos los argumentos
	public Almacen(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		this.perecederos = perecederos;
	}
		// Método constructor con solo dos argumentos
		// me va a permitir crear un Almacén solo con dos argumentos, tipo de productos y 
	    // boolean perecederos
		public Almacen(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
		}
	
		// Métodos Getters y Setters
		// Métodos Get, devuelven el valor de determinado atributo
		// Métodos Set nos permiten establecerle un valor a nuestros atributos privados
	
	
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
	
	// Método toString()
	// nos va a permitir conver a valores string todos los atributos de nuestro objeto
	//para poder verlos en consola. (Sirve como radiografía para ver cómo está compuesto
	// nuestro objeto
	
	@Override  // Anotación que significa sobreescritura
	// Es decir, este método se sobreescribe o modifica para mostrar la info de
	// este objeto en específico
	// Ej. si creamos una clase Pastel, en realidad se utiliza este mismo método
	// pero se sobreescribe para mostrar los atributos de los objetos Pastel
	public String toString() {
		return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + "]";
	}
	
	
	
}


