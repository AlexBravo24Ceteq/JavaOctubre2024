package com;

public class Almacenes {
	
	//PILAR ABSTACCION
	/*
	 * La idea de que atributos componen y necesito de ese
	 * objeto plasmar aqui
	 */
	
	//Atributos
	//Para proteger la info de manipulacion no autorizadas se 
	//Utiliza el pilar del encapsulamiento  con los sig. 
	//modificadores de acceso: private, public, protected,
	//default
	
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	//Modificador static - crear variables o metodos
	//de clase. Es decir, todos los objetos creados con este modificador
	//en este atributo tendrán un valor de 100
	//Mopdificador final- se utiliza para crear constantes
	//y si va de la mano con static, creamos constantentes de clase o valores inmutables
	private final static int capacidad = 100;
	private boolean perecederos;
	
	
	//Necesitamos por lo menos, algun método constructor
	//Para poder crear nuestros objetos
	
	//Método Constructor vacio - nos permite crear nuestro objeto
	//sin necesidad de agregarle valor a sus atributos
	
	public Almacenes() {
		
	}
	
	//Método constructo con todos los argumentos
	public Almacenes(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		this.perecederos = perecederos;
	}
	
	//Metodo contructor con solo dos argumentos
	// Me va a permitir crear un Almacen con todos los argumentos
	public Almacenes(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
	}
	
	//Metodos Getters y setters
	//Metodos Get, devuelven el valor de determinado atributo
	//Metodo Set nos permiten establecer un valor a nuestros atributos privados
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
//		Almacenes.capacidad = capacidad;
//	}

	public boolean isPerecederos() {
		return perecederos;
	}

	public void setPerecederos(boolean perecederos) {
		this.perecederos = perecederos;
	}

	@Override //anotacion que significa sobreescritura
	//Es decir, este metodo se sobreescribe o se modifica para mostrar la info de
	// este objeto en especifico
	//Ej. si creamos una clase pastel, en realidad se utiliza este mismo metodo
	//pero se sobreescribe para mostrar los atributos de los objetos pastel
	
	
	//Metodo toString()
		//Nos va a permitir convertir a valores String todos los atributos de 
		//nuestro objeto para poder verlos en consola
	public String toString() {
		return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
	}
	
	
	
	
	

	
	
	

}
