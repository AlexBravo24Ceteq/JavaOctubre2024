package com;

public abstract class Persona {
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		super();
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
	//metodos y funciones 
	//comportamientos
	//sonn acciones que nuestros objetos van a poder trealizar
	
	//metodos propios
	
	//metodos sin retormo
	//llevan la palabra reservada void ejecutan algo pero no deven devolver o no estan obligados a devolver 
	//algun tipo de dato 
	
	//ejem, ejecutar un metodo que se llame respirar
	
	public void respirar() {
		System.out.println(this.nombre + " Respirando -----");
	}
	
	// metodos con retorno deven devolver un tipo de datos que declaran
	//pueden ejecutar tambien alguna logica
	//pero su principal funcion es devolver algun tipo de dato
	//ejemplo metodo que se llame salufar y devuelva un saludo
	
	public String saludar() {//1
		String saludo = "Hola Mundo mi nombre es " + nombre;
		return saludo;
	}
	//polimirfismo habilidad de una fincion o metodo de poseer varias formas de un mismo identificador
	//se logra gracias a la sobre carga de argumentos
	//ej. de metodo polimorfico, sefunda forma de metodo
	public void saludar(String  saludo) {//2
		System.out.println("Hola mundo " + saludo);
		
	}
	//la sobre carga de argumentos nos permite tener varios cargos con nombres y nos permite tener sobrecarga de metodos 
	public void saludar(String saludo, int hora) {//3
		System.out.println("Hola mundo" + saludo + " son las " + hora);
	}
	
	//declarar un metodo abstracto
	//un metodo abstracto es aquel que nos dice que se va a hcer pero no como va  a hacerse
	//este metodo estara vacio las clases hijas seran las que tendran que encargarce de definirlo
	//al existir un metodo abastracto en una clase , la clase tambien deve volverse abstracta
	public abstract void capacitarse();
	
	
}
