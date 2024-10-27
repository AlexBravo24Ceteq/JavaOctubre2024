package com;

public class Almacen {
	//Abstracción que atributos componen este objeto
	//modificaciones de acceso private, public , protected y default
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	private final static int capacidad = 100;
	private boolean perecederos;
	
	//Constructor vacio no se agrega valor a los atributos
	public Almacen() {
		
	}
	
	//constructor con argumentos
	public Almacen(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		this.perecederos = perecederos;
	}

//	métodos getters y setter
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

	public Almacen(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
	}

	@Override
	//Sirve para ver el contenido(atributos) del objeto
	public String toString() {
		return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
	}
}
