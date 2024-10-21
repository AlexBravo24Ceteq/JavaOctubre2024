package com;

public class Almacen {
	
	//empezamos con el pilar de abstraccion que es la idea de que atributos componen 
	//y necesito de eso onjeto plasmar en la programacion
	// para protejer la info de manipulaciones no autorizadas de utiliza el pilar de encapsulmiento 
	//con los siguientes modificadores de acceso private, public, protected, defaul
	
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	//modificador static -> crear variables o metodos de clase es decir, todos los elementos creados con este modisficador
	//en este atributi tendra un valor de 100
	//modificador final que se utiliza para crear constantes de clases o valores inmutables
	private final static double capacidad = 100;
	private boolean perecederos;
	// necesitamos por lo menos un methodo constructor para poder crear nuestros objetos 
	//metodo contructor vacio - nos permite crear crear nuestro objeto
	//sin necesidad de agregar valores a sus atributos
	
	public Almacen() {
		
	}
	
	//metodo constructor con todos los argumentos
	public Almacen(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		//this.capacidad = capacidad;
		this.perecederos = perecederos;
	}
	
	//metodo constructor con solo dos argumentos 
	// ne va a permitir crear un almacen con solo 2 argumrntos String tipoProductos, boolean perecederos
	public Almacen(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
	}

	//metodos getters y setters
	//los metodos get tienen la propiedad de que devuelven el valor de determinado atributo
	//los metodos set nos permiten establecerle un valor a nuestros atributos privados 
	
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

	public double getCapacidad() {
		return capacidad;
	}

	//public void setCapacidad(double capacidad) {
		//this.capacidad = capacidad;
	//}
	//public static void setCapacidad(double capacidad) {
	//	Almacen.capacidad = capacidad;
	//}

	public boolean isPerecederos() {
		return perecederos;
	}

	public void setPerecederos(boolean perecederos) {
		this.perecederos = perecederos;
	}

	//metodo toString nos va a permitir convertir a valores String todos los valores de nuestros objetos 
	//para poderlos ver en consola
	//@Override -> anotacion que significa sobre escritura en este caso toString 
	@Override
	public String toString() {
		return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
	}
	
	
	

}
