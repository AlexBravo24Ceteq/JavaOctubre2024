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
	
	//MÉTODOS O FUNCIONES
	//COMPORTAMIENTOS
	//Son acciones que nuestros objetos van a poder
	//realizar
	
	//Métodos propios
	
	//Método sin retorno
	//Llevan la palabra reservada void
	//Ejecutan algo, pero no deben devolver
	//o no estan obligados a devolver algún tipo de dato
	
	//Ej. declarar un método que se llame respirar
	
	public void respirar () {
		System.out.println(nombre + " - Respirando....");
	}
	
	//Métodos con retorno
	//Deben devolver un tipo de dato, el tipo de dato que declaran
	//Y pueden ejecutar también alguna lógica
	
	//Ej. Un método que se llame saludar y devuelva un Saludo
	
	public String saludar() {
		String saludo = "Hola Mundo mi nombre es " + nombre;
		
		return saludo;
	}
	
	//Ej. de método polimorfico - (segunda forma de un método)
	//POLIMORFISMO - habilidad de una función o método de poseer varias
	//formas con un mismo identificador
	//Se logra gracias a la sobrecarga de argumentos
	public void saludar(String saludo) {
		System.out.println("Hola mundo " + saludo);
	}
	
	//Ej. de método polimorfico - (tercera forma de un método)
	public void saludar(String saludo, int hora) {
		System.out.println("Hola mundo " + saludo + " son las " + hora );
	}
	
	//Declarar un método abstracto
	//Un método abstracto es aquel que nos dice QUÉ se va a hacer
	//pero no cómo va a hacerse
	//Esté método quedará vacío y las clases hijas serán las que
	//tendrán que encargarse de definirlo
	//Al exisitir un método abstracto en una clase
	//La clase también debe volverse abstracta
	
	public abstract void capacitarse();
	
	
	
	
	
	

}
