package com;

public class Almacen {
	
	// PILAR DE ABSTRACCION
	// La idea de qué atributos componen y necesito de ese objeto
	// plasmar aquí
	
	//Para proteger la informacion de manipulaciones no autorizadas
	// se utiliza el pilar del encapsulamiento con los siguientes modificadores:
	// private, public, protected, default
	
	// Atributos
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	private final static int capacidad = 100;
	private boolean perecederos;
	
	
	// Necesitamos por lo menos, algún método constructor
	// para poder crear nuestros objetos
	
	// Metodo constructor vacio - crea un objeto sin necesidad de agregarle valor a sus atributos
//	public Almacen(){
//		
//	}
	
	public Almacen(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		this.perecederos = perecederos;
	}


	public Almacen(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
	}


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


	public boolean isPerecederos() {
		return perecederos;
	}


	public void setPerecederos(boolean perecederos) {
		this.perecederos = perecederos;
	}


	@Override
	public String toString() {
		return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
	}
	
	
	
	
	
}
