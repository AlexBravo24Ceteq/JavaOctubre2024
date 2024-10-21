package com;

public class Almacen {
	
	//PILAR ABSTRACCION
	//La idea de que atributos componen y necesito
	//de ese objeto plasmar aqui
	
	//Atributos
	//Para proteer la info de manipulaciones no autorizados
	//Se utiliza el pilar del ENCAPSULAMIENTO con los sig modificadores
	//de acceso: private, public, protected, default
	
	private String tipoProductos;
	private String direccion;
	private int capacidad;
	private boolean perecederos;
	
	//Necesitamos  por lo meos, algun metodo constructor
	//Para poder crear nuestros ojbjetos
	
	//Metodo Constructir vacio = permite crear nuestro onjeto
	//sin necesidad de agregar valor a sus atributos
	public Almacen() {
		
	}
	
	//Metodo Contructor con todos los argumentos
	
	private String tipoAlmacen;
	public Almacen(String tipoAlmacen, String tipoProductos, String direccion, int capacidad, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		this.capacidad = capacidad;
		this.perecederos = perecederos;
	}
	//Metodo contructor con solo dos argumentos
	//Me va a permitir crear un Almacen solo con 2 argumentos, tipo de productos y
	//boolean
	public Almacen(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
		
	//Metodos Getters y Setters
	//Meotods Get, devuelven el valor de determinado atributo
	//Metodos Set nos permiten establecerle un valor a nuestros atributos privados
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
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isPerecederos() {
		return perecederos;
	}
	public void setPerecederos(boolean perecederos) {
		this.perecederos = perecederos;
	}
	public String getTipoAlmacen() {
		return tipoAlmacen;
	}
	public void setTipoAlmacen(String tipoAlmacen) {
		this.tipoAlmacen = tipoAlmacen;
	}
	//Metodo toString()
	//Nos ba a permitir convertir a calores String todos los atributos de nuestro objeto
	//Para poder erlos en consols.
	@Override
	public String toString() {
		return "Almacen [tipoProductos=" + tipoProductos + ", direccion=" + direccion + ", capacidad=" + capacidad
				+ ", perecederos=" + perecederos + ", tipoAlmacen=" + tipoAlmacen + "]";
	}
	
	
	
	
	
	
}
