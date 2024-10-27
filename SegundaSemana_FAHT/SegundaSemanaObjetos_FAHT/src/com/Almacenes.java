package com;

public class Almacenes {

	//Pilar de abstracción
	//La idea de que atributos componen y necesito 
	// de ese objeto plasmar aqúi en la programación
	
	//Atributos
	
	// Para proteger la info de manipulacion no autorizads
	//se utiliza el pilar de ENCAPSULAMIENTO con losnsoguientes
	//modificadores de acceso: private, public, protected, default
	
	private String tipoAlmacen;
	private String tipoProductos;
	private String direccion;
	//Modificador static - crear variables o métodos
	//de clase. Es decir todos los objetos con este modificador
	//tendran valor de 100
	
	//modificador final - se utiliza para crear constantes
	//y si va de la mano con static, creamos constantes de clase o valores inmutables
	private final static int capacidad = 100;
	private boolean perecederos;
	
	
	
	//necesitamos por lo menos, algun metodo constructor
	//para poder crear nuestros objetos
	
	//método constructor vacio - nos permite crear nuestro objeto
	//sin necesidad de agregarle valor a sus atributos
	
	public Almacenes( ) {
	}
	
//		
//	}
public Almacenes(String tipoAlmacen, String tipoProductos, String direccion, boolean perecederos) {
	super();
	this.tipoAlmacen = tipoAlmacen;
	this.tipoProductos = tipoProductos;
	this.direccion = direccion;
	this.perecederos = perecederos;
}
	//Metodo constructor con solo dos argumentos
	// Me va a permitir crear un almacen solo con 2 argumentos, tipos de productos
	//y boolean perecederos
public Almacenes(String tipoProductos, boolean perecederos) {
	super();
	this.tipoProductos = tipoProductos;
	this.perecederos = perecederos;
	
	
}

//Métodos Getters y setters
//metodos get devuelven el valor de determinado atributo
//metodos set nos permietn establecer un valor a nuestros atributos privados

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

//public int getCapacidad() {
//	return capacidad;
//}

//public void setCapacidad(int capacidad) {
//	this.capacidad = capacidad;
//}



public boolean isPerecederos() {
	return perecederos;
}

public static int getCapacidad() {
	return capacidad;
}

//public static void setCapacidad(int capacidad) {
//	Almacenes.capacidad = capacidad;
//}

public void setPerecederos(boolean perecederos) {
	this.perecederos = perecederos;
}
//Metodo to string
//Nos va a permitir convertir a valores String todod los atributos de 
//nuestro objeto para verlos en consola
//nota:Sirve como radiografia para ver como esta compuesto nuestro objeto

@Override // anotacion que significa sobreescritura
// Es decir, este método se sobreescribe o modifica para mostrar la info de 
//este objeto en especifico
//ej. si creamos una clase pastel, en realidad se utiliza este mismo método 
public String toString() {
	return "Almacen [tipoAlmacen=" + tipoAlmacen + ", tipoProductos=" + tipoProductos + ", direccion=" + direccion
			+ ", capacidad=" + capacidad + ", perecederos=" + perecederos + "]";
}




}//end
