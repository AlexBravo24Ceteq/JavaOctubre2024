package com;

public abstract class Persona {

	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {	
	}

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
	
	// métodos o funciones 
	//comportamientos
	//Son acicones que nuestros objetos van a poder realizar
	
	// Metodos propios
	
	//Metodo sin retorno
	//Llevan la palabra reservada void
	//Ejecutan algo, pero no deben devolver
	// o no estan obligados a devolver algun tipo de dato
	
	//ej. declarar un metodo que se llame respirar
	
	public void respirar() {
		System.out.println(nombre+" Respirando...");
	}
	
	
	//metodos con retorno
	//debe devolver un tipo de dato, el tipo de dato que declaran
	//y pueden ejecutar tambien alguna logica
	
	//ej un metodo que se llame saludar y devolver un saludo
	
	public String saludar() {
		String saludo = "Hola mundo mi nombre es " + nombre;
		
		return saludo;
	}
	
	//ej de metodo poliformico - (segunda forma) 
	// Polimorfismo, habilidad de una funcion o metodo de poseer varias
	//formas con mismo identificadoir
	//se logra gracias a la sobrecarga de argumentos
	public void saludar (String saludo) {
		System.out.println("Hola mundo " + saludo);
	}
	
	//el. de metodo polimorfico - (tervera forma de un metodo)
	public void saludar(String saludo, int hora) {
		System.out.println("Hola mundo "+ saludo + " son las " + hora);
	}
	
	//Declarar un método abstracto
	//Un metodo abstracto es aquel que nos dice que se va hacer pero no 
	//como se va a hacerse
	//este método quedará vacio y las clases hijas
	//serán las que tendran que encargarse de definirlo
	//Al exitir un metodo abstracto en una clase, la clase tambien
	//debera ser abstracto
	
	public abstract void capacitarse();
	
	
}// end
	
	
