package com;

public abstract class Persona {

	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {} //constructor vacio

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
	
	
	//METODOS O FUNCIONES
	//COMPORTAMIENTOS
	//Son acciones que nuestos objetos van a poder realizar
	
	//Metodos propios 
	
	//Metodo sin retorno
	//LLevan la palabra reservada void
	//Ejecutan algo, pero no deben devolver o no estan obligados a devolver algun tipo de dato
	//Ej: declarar un metodo que se llame respirar
	
	public void respirar () {
		System.out.println(nombre + " - Respirando...");
	}
	
	//Metodos con retorno
	//Deben devolver un tipo de dato, el tipo de dato que declaran
	//Y pueden ejecutar tambien alguna logica
	
	//Ej. Un metodo que se llame saludar y devuelva un saludo
	
	
	public String saludar() {
		String saludo = "Hola Mundo mi nombre es" + nombre;
		//return null; Provicionalmente se coloca en lo que pensamos que valor darle
		return saludo;
	}
	
	//Ej. de metodo polimorfico - ( segunda forma de un metodo)
	//POLIMOTFICO - habilidad de una funcion o metodo de poseer varias formas con un mismo identificador
	//Se logra gracias a la sobrecarga de argumentos
	
	public void saludar (String saludo) {
		System.out.println("Hola mundo" + saludo);
		
		
	}
	
	//Ej. de metodo polimorfico - ( tercera forma de un metodo)
	
	public void saludar (String saludo, int hora) {
		System.out.println("Hola mundo" + saludo + " son las " + hora); 
 
	} 
	
	//Declarar un metodo abstracto
	//Un metodo abstracto es quel que nos dice que se va a hacer pero no como va  a hacerse
	//Este metodo quedara vacio y las clases hijas seran las que
	//tendran que encargarse de definirlo
	// al existir un metodo abstracto en una clase
	//La clase tambien debe volverse abstracta
	
	public abstract void capacitarse();

}

