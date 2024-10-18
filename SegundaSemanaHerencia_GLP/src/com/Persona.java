package com;

public abstract class Persona {
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona(){}

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
		return "Persona [nombre=" 
				+ nombre + ", genero=" 
				+ genero + ", edad=" 
				+ edad + "]";
	}
	
	//Metodos o funciones
	//Comportamientos
	//Son acciones que nuestros objetos van a poder realizar
	
	//Metodos propios
	
	//Metodos sin retorno
	//Llevan la palabra reservada void
	//Ejecutan algo, pero no deben devolver
	//o no estan obligaods a devolver algun tipo de dato
	
	//Ej, declarar un metodo que se llame respirar
	public void respirar() {
		System.out.println(nombre + " Respirando....");
	}
	
	//Metodos con retorno
	//Deben devolver un tipo de dato, el tipo de dato que declaran
	//Y pueden ejecutar tambien alguna logica
	
	//Ej. un metodo que se llame saludar y devuelva un Saludo
	
	//Sobrecarega de metodos cuando son varios metodos con el mismo nombre
	//Sobre carga de argumentos es cuando usamos el mismo metodo y diferentes argumentso 
	//con n cantidad
	public String saludar() {
		String saludo = "Hola Mundo mi nombre es " + nombre;
		return saludo;
	}
	
	//Ej. polimorfico (segunda forma de un metodo)
	//POLIMORFISMO - Habilidad de una funcion o metodo de poseer varias
	//fomras con un mismo identificador
	//Se logra gracias a la sobrecarga de argumentos
	public void saludar(String saludo) {
		System.out.println("Hola mundo "+saludo);
	}

	//Ej. de metodo polimorfico - (tercera forma de un metodo)
	public void saludar(String saludo, int hora) {
				System.out.println("Hola mundo "+saludo+" son las "+ hora);
	}
	
	//Declarar un metodo abstracto
	//Un metodo abstracto es aquel que nos dice que se va hacer
	//pero no como va hacerse
	//Este metodo quedara vacio y las clases
	//hijas quedaran vavias y las clases hijas
	//seran las que tendran que encargarse
	//Al existir un metodo abstracto en una clase
	//La clase tambien debe volverse abstracta
	
	public abstract void capacitarse();
	
	
}
