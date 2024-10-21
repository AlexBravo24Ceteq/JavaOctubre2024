package com;

//clase abstracta
public abstract class Persona {
	private String nombre;
	private String genero;
	private int edad;
	
//	constructor vacio y con argumentos
	public Persona() {
		
	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

//	getters y setters
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
	
//	métodos propios
//	método sin retorno
	
	public void respirar() {
		System.out.println(this.nombre + " esta respirando...");
	}
	
//	métodos con retorno, devuelven el tipo de dato declarado primera forma del método
	public String saludar() {
		String saludo = "Hola mundo, mi nombre es " + this.nombre;
		return saludo;
	}
	
//	sobrecarga de métodos
//	ejemplo polimorfico(segunda forma de un méptodo)
	public void saludar(String saludo) {
		System.out.println("Hola mundo " + saludo);
	}
	
//	sobrecarga de metodos
//	segundo ejemplo polimorfico(tercera forma de un método)
//						Sobrecarga de argumentos
	public void saludar(String saludo, int hora){
		System.out.println("Hola mundo, " + saludo + " son las " + hora);
	}
	
//	clase abstracta, declarando método abstracto
//	las clases hijas definen el trabajo
	public abstract void capacitarse();
}
