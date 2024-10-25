package com;

public abstract class Persona {
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		
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
	
	//Metodos o Funciones 
	//Comportamientos 
	//Son acciones que nuestros objetos se van a poder realizar5
	
	//Metodos propios 
	
	//Metodo sin retorno
	//Llevan la palabra reservada void
	//Ejecutan algo, pero no deben devolver 
	//o no estan obligados a devolver algun tipo de dato
	
	//Ej. declarar un metodo que se llame respirar
	
	public void respirar () {
		
		System.out.println(this.nombre + " Respirando....");
		
	}
	
	//Metodos con retorno deben devolver un tipo de dato que declaramos
	//Y pueden ejecutar tambien alguna logica
	
	//Ej. Un metodo que se llame saludar y devuelva un saludo
	
	public String saludar () {
		String saludo = "Hola mundo mi nombre es " + nombre;
		return saludo;
	}
	
	//Ej. de metodo polimorfico -(segunda forma de un metodo)
	//Polimorfismo - habilidad de una funcion o metodo de poseer varias
	//formas con un mismo identificador
	//Se logra gracias a la sobrecarga de argumentos
	
	public void saludar (String saludo) {
		System.out.println("Hola mundo " + saludo);
	}
	
	//Ej. de metodo polimorfico -(tercera forma de un metodo)
	
	public void saludar (String saludo, int hora) {
		System.out.println("Hola mundo " + saludo + " son las " + hora);
	
	}
	
	
	//Declarar un metodo abstracto
	//Es aquel que nos dice que se va hacer pero no como hacerse
	//Este metodo quedara vacio y las clases hijas seran las que 
	//tendran que encargarse de definirlo
	//Al existir un metodo abstracto en una clase
	//La clase tambien debe volverse abstracta
	
	public abstract void capacitarse();
	
	
	
	
	
	
	
	
	
	
	

}
