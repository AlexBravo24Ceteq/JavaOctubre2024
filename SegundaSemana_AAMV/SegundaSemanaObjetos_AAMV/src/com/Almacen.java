package com;

public class Almacen {

	//PILAR DE ABSTRACCION
	//La idea de que atributos componen y necesito de 
	//ese objeto plasmar aqui
	
	//Atributos
	//Para proteger la info de manipuaciones no autorizadas se
	//se utiliza el pilar de ENCAPSULAMIENTO con los sig. modificadores
	//de acceso: private, protected, default
	
	private String tipodeAlmacen;
	private String tipodeproductos;
	private String direccion;
	//private int capacidad;
	//Modificador static - crear variables o metodos
	//de clase. Es decir todos los objetos creados con este modificador
	//en este atributo tendran valor de 100	
	
	//Modificador final se usa para crar constantes y si va de la mano con static
	//creamos constantes de clase o valores inmutables
	private final static int capacidad = 100;
	//private static int capacidad = 100; //este es tun modificador estatico
	private boolean perecederos;
	
		
	
	
	//Necesitamos por lo menos, algun metodo constructor
	//para poder crear nuestro objetos
	
	//Metodo constructor vacio = nos permite creear nuestro objeto
	//sin necesidad de agregarle valor a sus atributos
	public Almacen() {
	
		
	}
	
	//Metodo constructor con todos los argumentos
	public Almacen(String tipodeAlmacen, String tipodeproductos, String direccion, boolean perecederos) {
	
    //Metodo constructor se genera con click derecho/source/generate constructor using fields y elegimos lo que necesitemos dar valor
	super();
	this.tipodeAlmacen = tipodeAlmacen;
	this.tipodeproductos = tipodeproductos;  
	this.direccion = direccion;
	//this.capacidad = capacidad;
	this.perecederos = perecederos;
	}
	
	

	//Metodo constructor  con solo 2 argumentos, tipode productos y
		//boolean perecederos.
	
	public Almacen(String tipodeproductos, boolean perecederos) {
		super();
		this.tipodeproductos = tipodeproductos;
		this.perecederos = perecederos;
	}

	    //Metodos Getters y Setters
		//Metodos Get, devuelven el valor de determinado atributo
		//Metodo Set, nos permiten establecerle un valor a nuestros atributos privados
	
	public String getTipodeAlmacen() {
		return tipodeAlmacen;
	}
	

	public void setTipodeAlmacen(String tipodeAlmacen) {
		this.tipodeAlmacen = tipodeAlmacen;
	}

	public String getTipodeproductos() {
		return tipodeproductos;
	}

	public void setTipodeproductos(String tipodeproductos) {
		this.tipodeproductos = tipodeproductos;
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
//		//this.capacidad = capacidad;
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
    //Metodo toString() click derecho/source/generate toString
	//Nos va a permitir convertir a valores String todos los atributos de nuestro objeto
	//para poder verlos en consola. (Sirve como radiografia para ver como esta compuesto
	//nuestro objeto
	
	@Override //anotacion que significa sobreescritura
	//Es ecir, este metodo se sobreescribe o modifica para mostrar la info de
	//este objeto en especifico
	//Ej. si creamos una clase pastel, en realidad de utiliza este mismo metodo
	//pero se sobreescribe para mostrar los atributos de los objetos pastel
	public String toString() {
		return "Almacen [tipodeAlmacen=" + tipodeAlmacen + ", tipodeproductos=" + tipodeproductos + ", direccion="
				+ direccion + ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
	}
	
	
	
	
	
	
	}


