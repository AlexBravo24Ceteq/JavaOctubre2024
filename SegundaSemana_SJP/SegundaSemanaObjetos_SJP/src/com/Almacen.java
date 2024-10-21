package com;

public class Almacen {
	//PILAR ABSTRACCIÓN
	//Qué atributos componen y necesito del pbjeto?
	
	//Atrtibutos: 
	//Para proteger la info de manipulaciones de autorizadas
	//se utiliza el pilar de ENCAPSULAMIENTO.
	//Con los modificadores PRIVATE, PUBLIC, PROTECTED, DEFAULT.
	
	private String tipodeAlmacen;
	private String tipodeProductos;
	private String direccion;
	//private int capacidad = 100;
	//*Modificador estatic - crea variables o metodos de clase. Crea valores fijos para los objetos
	//creados con ese atributo.
	//**Modificador final - crea constantes, junto a static, crea constantes de clase o valores
	//inmutables
	//*private static int capacidad = 100;
	private final static int capacidad =100;
	private boolean perecederos;

	
	//Necesitamos por lo menos, un metodo constructor 
	//para poder crear nustros objetos
	
	//Metodo constructor vacio:
	//Crea nuestro objeto sin necesidad de agregarle valor a sus atributos
	
	public Almacen () {
		
	}
	
	//Método constructor con todos los argumentos
//	public Almacen(String tipodeAlmacen, String tipodeProductos, String direccion, int capacidad, boolean perecederos)
	public Almacen(String tipodeAlmacen, String tipodeProductos, String direccion, boolean perecederos) {
		super();
		this.tipodeAlmacen = tipodeAlmacen;
		this.tipodeProductos = tipodeProductos;
		this.direccion = direccion;
	//	this.capacidad = capacidad;
		this.perecederos = perecederos;
	}
	
	//Metodo constructor con dos argmts
	//Crear un almacen solo con 2 argmts: Productos y boolean perecederos
	public Almacen(String tipodeProductos, boolean perecederos) {
		super();
		this.tipodeProductos = tipodeProductos;
		this.perecederos = perecederos;
	}
	
	//Metodos Getters y Setters
	//Get: Devuelven el valor de determinado atributo
	//Set establece un valor a atributos privados
	
	public String getTipodeAlmacen() {
		return tipodeAlmacen;
	}

	public void setTipodeAlmacen(String tipodeAlmacen) {
		this.tipodeAlmacen = tipodeAlmacen;
	}

	public String getTipodeProductos() {
		return tipodeProductos;
	}

	public void setTipodeProductos(String tipodeProductos) {
		this.tipodeProductos = tipodeProductos;
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

//*	public void setCapacidad(int capacidad) {
//		this.capacidad = capacidad;
//	}
	
	public void setPerecederos(boolean perecederos) {
		this.perecederos = perecederos;
	}

	public boolean isPerecederos() {
		return perecederos;
	}

//**	public static void setCapacidad(int capacidad) {
//		Almacen.capacidad = capacidad;
//	}

	
	//Metodo toString()
	//Permite convertir a valores string todos los atributos del objeto para mostrar en consola.
	@Override //Sobreescritura Se sobreescribe o modifica para mostrar la inf. del objeto en especifico.
	//Ej, se utiliza este mismo metodo pero se sobrescribe para mostrar los atributos del objeto pastel
	public String toString() {
		return "Almacen [tipodeAlmacen=" + tipodeAlmacen + ", tipodeProductos=" + tipodeProductos + ", direccion="
				+ direccion + ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
	}


	
	
	
}
