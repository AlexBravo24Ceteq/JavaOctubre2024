package com;

public class Almacenes {
	
	//PILAR ABSTRACCION
	//La idea de qu� atributos componen y necesito
	//de ese objeto plasmar aqui 
	
	//Atributos
	//Para proteger la info de manipulaciones no autorizadas
	//Se utiliza el pilar del ENCAPSULAMIENTO con los sig modificadores
	//de acceso: private, public, protected, default
	
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	//Modificador static - crear variables o m�todos
	//de clase. Es decir, todos los objetos creados con este modificador
	//en este atributo tendr�n valor de 100
	//Modificador final -  se utiliza para crear constantes
	//y si va de la mano con static, creamos constantes de clase o valores inmutables
	private final static int capacidad = 100;
	private boolean perecederos;
	
	
	//Necesitamos por lo menos, algun m�todo constructor
	//para poder crear nuestros objetos
	
	//M�todo Constructor vacio - nos permite crear nuestro objeto
	//sin necesidad de agregarle valor a sus atributos
	public Almacenes() {
		
	}
	
	//M�todo Constructor con todos los argumentos
	public Almacenes(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		this.perecederos = perecederos;
	}

	//M�todo constructor con solo dos argumentos
	//Me va a permitir crear un Almacen solo con 2 argumentos, tipo de productos y
	//boolean perecederos
	public Almacenes(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
	}
	
	//M�todos Getters y Setters
	//M�todos Get, devuelven el valor de determinado atributo
	//M�todos Set nos permiten establecerle un valor a nuestros atributos privados

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

	//M�todo toString()
	//Nos va a permitir convertir a valores String todos los atributos de nuestro objeto
	//para poder verlos en consola. (Sirve como "radiografia" para ver
	//como esta compuesto nuestro objeto)
	
	@Override //anotacion que significa sobreescritura
	//Es decir, este metodo se sobreescribe o modifica para mostrar la info de
	//este objeto en especifico
	//Ej. si creamos una clase Pastel, en realidad se utiliza este mismo metodo
	//pero se sobreescribe para mostrar los atributos de los objetos Pastel
	public String toString() {
		return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
	}
	


}
