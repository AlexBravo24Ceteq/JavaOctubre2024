package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona(){
		
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
	// MÉTODOS O FUNCIONES
	// COMPORTAMIENTOS
	// Son acciones que nuestros objetos van a poder realizar
	
	// Métodos propios
	
	// Método sin retorno 
	// Llevan la palabra reservada void
	// Ejecutan algo, pero no deben devolver
	// o no están obligados a devolver algún tipo de dato
	
	// Ej. declarar un método que se llame respirar
	
	public void respirar () {
		System.out.println(nombre+" Respirando...");	
	}
		// Método con retorno 
		// pueden devolver un tipo de dato, el tipo de dato que declaran
		// pueden ejecutar también alguna lógica, pero su principal función
		// es devolver algún tipo de dato
		
		// o no están obligados a devolv
		
		public String saludar() {
			String saludo= "Hola Mundo, mi nombre es: "+nombre ;
			return saludo;	
	}
	
		// Ej. método polimórfico - (segunda forma de un método)
		// POLIFORMISMO - habilidad de una función o método de poseer varias 
		// formas con un mismo identificador
		// se logra gracias a la sobrecarga de argumentos
		public void saludar(String saludo) {
			System.out.println ("Hola mundo "+ saludo);
		}
		// Ej. de método polimórfico - (tercera forma de un método)
		public void saludar(String saludo, int hora) {
			System.out.println ("Hola mundo "+ saludo+ " Son las "+ hora);			
		}
		
		// Declarar un método abstracto
		// un método abstracto es aquel que nos dice qué se va a hacer
		// pero no cómo va a hacerse
		// Este método quedará vacío y las clases hijas serán las que
		// tendrán que encargarse de definirlo
		// Al existir un método abstracto en una clase
		// La clase también debe volverse abstracta
		
		public abstract void capacitarse (); 
		
		
}