package com;

abstract public class Persona {
	
	private String nombre;
	private boolean isMen;
	private int edad;
	
	public Persona(){}

	public Persona(String nombre, boolean isMen, int edad) {
		super();
		this.nombre = nombre;
		this.isMen = isMen;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMen() {
		return isMen;
	}

	public void setMen(boolean isMen) {
		this.isMen = isMen;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", isMen=" + isMen + ", edad=" + edad + "]";
	}
	
	// Métodos o Funciones
	// comportamientos:
	// son acciones que nuestro objetos van a poder realizar
	
	// Métodos propios
	
	// Método sin retorno
	// llevan la palabra reservada void
	// Ejecutan algo, pero no deben devolver
	// o no estan obligados a devolver algun tipo de dato
	
	// EJ. declarar un método que se llame respirar
	
	public void respirar() {
		System.out.println(this.nombre + " Respirando...");
	}
	
	// Métodos con retorno
	// deben devolver el tipo de dato con el que se declaran
	// y pueden ejecutar algún tipo de lógica
	
	// Ejemplo: método saludar y devuelva un saludo
	
	public String saludar() {
		return "Hola Compañeros de CETEQ, mi nombre es: "+ nombre;
	}
	// Ej. el médtodo polimorfico - (segunda forma de un método)
	// Polimorfismo - habilidad de una funcion o método de poseer varias
	// formas con un mismo identificador
	// se logra gracias a la sobrecarga de argumentos
	public void saludar(String saludo) {
		System.out.println("Hola mundo"+saludo);
	}
	
	public void saludar(String saludo, int hora) {
		System.out.println("Hola mundo "+saludo+" son las "+hora);
	}
	
	// DECLARAR UN MÉTODO ABSTRACTO
	// un método abstracto es aquel que nos dice que se va a hacer
	// pero no cómo va a hacerse
	// este método quedará vacío y las clases hijas 
	// que tendran que encargarse de definirlo
	// al tener un método abstracto dentro de una clase
	// la clase también tendrá que ser abstracta
	abstract public void capacitarse(String dato);
	
}
