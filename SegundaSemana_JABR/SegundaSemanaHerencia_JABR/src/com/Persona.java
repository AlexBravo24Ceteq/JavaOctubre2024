package com;

public abstract class Persona {
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//M�TODOS O FUNCIONES
	//COMPORTAMIENTOS
	//Son acciones que nuestros objetos van a poder
	//realizar
	
	//M�todos propios
	
	//M�todo sin retorno
	//Llevan la palabra reservada void
	//Ejecutan algo, pero no deben devolver
	//o no estan obligados a devolver alg�n tipo de dato
	
	//Ej. declarar un m�todo que se llame respirar
	
	public void respirar () {
		System.out.println(nombre + " - Respirando....");
	}
	
	//M�todos con retorno
	//Deben devolver un tipo de dato, el tipo de dato que declaran
	//Y pueden ejecutar tambi�n alguna l�gica
	
	//Ej. Un m�todo que se llame saludar y devuelva un Saludo
	
	public String saludar() {
		String saludo = "Hola Mundo mi nombre es " + nombre;
		
		return saludo;
	}
	
	//Ej. de m�todo polimorfico - (segunda forma de un m�todo)
	//POLIMORFISMO - habilidad de una funci�n o m�todo de poseer varias
	//formas con un mismo identificador
	//Se logra gracias a la sobrecarga de argumentos
	public void saludar(String saludo) {
		System.out.println("Hola mundo " + saludo);
	}
	
	//Ej. de m�todo polimorfico - (tercera forma de un m�todo)
	public void saludar(String saludo, int hora) {
		System.out.println("Hola mundo " + saludo + " son las " + hora );
	}
	
	//Declarar un m�todo abstracto
	//Un m�todo abstracto es aquel que nos dice QU� se va a hacer
	//pero no c�mo va a hacerse
	//Est� m�todo quedar� vac�o y las clases hijas ser�n las que
	//tendr�n que encargarse de definirlo
	//Al exisitir un m�todo abstracto en una clase
	//La clase tambi�n debe volverse abstracta
	
	public abstract void capacitarse();
	
	
	
	
	
	

}
