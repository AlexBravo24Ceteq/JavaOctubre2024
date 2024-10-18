package com;

public class Almacen {

	//PILAR ABSTRACCION
	//la idea de que atributos componen y necesito
	//de ese objeto plasmar aqui
	
	//Atributos
	//Para proteger la info de manipulaciones no autorizadas
	//Se utiliza el pilar de ENCAPSULAMIENTO
	//con los siguentes modificadores de acceso
	//private, public, protected y default
	
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	
	//Modificador/Especificador de acceso static- crear variables o metodos
	//de clase. es decir, todos los objetos creados con este modificador
	//en este atributo tendra valor de 100
	
	//Modificador/Especificador final - se utiliza para crear constantes
	//y si va de la mano con static, creamos constantes de clase o valores inmutables
	//ya no se podra modificar y por eso no se podra crear el set, ya que no se podra modificar
	private final static int capacidad = 100;
	private boolean percederos;
	
	
	
	//Necesitamos por lo menos, algun metodo constructor
	//para poder crear nuestros objetos
	
	//Metodo Constructor vacio - nos permite crear nuestro objeto
	//sin necesidad de agregarle valor a sus atributos
	
	public Almacen() {
		
	}
	
	//Metodo Constructor con todos los argumentos
	public Almacen(String tipoAlmacen, String tipoProductos, String direccion, boolean percederos) {
		super();
		this.tipoAlmacen = tipoAlmacen;
		this.tipoProductos = tipoProductos;
		this.direccion = direccion;
		
		this.percederos = percederos;
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
	
	//Con esto todos los objetos que se creen apartir de este se cambiaran para todos
//	public static void setCapacidad(int capacidad) {
//		Almacen.capacidad = capacidad;
//	}

	public boolean isPercederos() {
		return percederos;
	}


	public void setPercederos(boolean percederos) {
		this.percederos = percederos;
	}

	//Metodo toString
	//Nos va a permitir convertir valores String todos los ateributos de nuestro objeto
	//para poder verlos en consola(sirve como raidografia)
	//para poder ver sis atributos
	
	@Override//Anotacion que significa sobreescritura
	//es decir, este metodo se sobeescribe o modifica para mostrar la info de este objeto
	//
	public String toString() {
		return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
				+ ", capacidad=" + capacidad + ", percederos=" + percederos + "]";
	}
	
	
}
