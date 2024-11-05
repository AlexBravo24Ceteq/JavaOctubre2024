package com;

public class Almacen {
	
	//PILAR DE ABSTRACCION
	//La idea de que atributos componen y necesito de ese objeto
	//para plasmar aqui
	
	//Atributos
	//Para proteger la info de manipulaciones no autorizadas
	//Utiliza el pilar de encapsulamiento con los sig modificadores
	//de acceso: private, public, protected, default
	
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	//Modificador static - crear variables o metodos de clase
	//Es decir, todos los objetos creados con este modificador en este atributo tendran el 
	//valor de 100;
	//Modificador final - se utiliza para crear constantes y si va de la mano con static, 
	//creamos constantes de clase - valores inmutables
	private final static int capacidad=100;//para declarar una cantidad a la variable cantidad
	private boolean perecederos;
	
	//Necesitamos por lo menos algun metodo constructor
	//para poder crear nuestros  objetos
	
	//Metodo constructor vacio - nos permite crear nuestro objeto 
	//sin necesidad de agregarle valor a sus atributos
	
	public Almacen() {
		
}
	
	//Metodo constructor con todos los argumentos
	public Almacen(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		this.perecederos = perecederos;
	}

	//Metodo constructor con solo dos elementos 
	//Me va a permitir crear un almacen solo con 2 argumentos, tipo
	//de productos y boolean perecederos
	public Almacen(String tipoProductos, boolean perecederos) {
		super();
		this.tipoProductos = tipoProductos;
		this.perecederos = perecederos;
	}
	
	//Metodos getters y setters
	//Metodos get - devuelven el calor determinado atributo
	//Metodos set - nos permiten establecerle un valor a nuestros atributos privados
	

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
	
//	public static void setCapacidad(int capacidad) {//Este set se creo despues de haber generado
//		//la clase static
//		Almacen.capacidad = capacidad;
//	}
	 
	//Cuando agregas final antes de estatic ya no aparece para crear el setters.

	
	public boolean isPerecederos() {
		return perecederos;
	}


	public void setPerecederos(boolean perecederos) {
		this.perecederos = perecederos;
	}
	//Metodo toString()
	//Nos va a permitir convertir a valores String todos los atributos
	//de nuestro objeto para poder verlos en consola (Sirve como radriografia para ver como
	//esta compuessto nuestro objeto)
	
	@Override
	public String toString() {
		return "Almcen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
	}
	
	
	

}
