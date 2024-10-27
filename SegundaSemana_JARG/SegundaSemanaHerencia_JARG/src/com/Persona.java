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

//Metodos o funciones
//COMPORTAMIeNToS
//Son acciones que nuestros objetos van a poder
//realizar

//Metodos propios

//Metodo sin retorno
//Llevan la palabra reservada void
//Ejecutan algo, pero no deben devolver
//o no estan obligados a devolver algun tipo de dato

//Ej.declarar un metodo que se llame respirar

public void respirar() {
	
	System.out.println(nombre + " Respirando....");
}

//Metodos con retorno
//Dene devolver un tipo de dato, el tipo de dato que declaran
//Y pueden ejecutar tmabien alguna logica

//Eje. Un metodo que se llame salidar y devuelve un Saludo

public String saludar() {
	String saludo = "Hola mundo mi nombre es " + nombre ;
	return saludo;
}

//Ej. de metodo polimorfico - (segunda forma de un metodo)
//Polimorfismo - habilidad de una funcion o metodo de poseer varias
//formas con un mismo identificador
//se logra gracias a la sobrecarga de argumentos
public void saludar(String saludo) {
	
	
	System.out.println("Hola mundo " + saludo);
}

//Eje. de metodo de polimorfirmo - tercera forma

		public void saludar(String saludo, int hora) {
			
			System.out.println("Hola mundo "+saludo+" son las " + hora);
		}
//Declarar un metodo abstracto
//Un metodo abstracto es aquel que nos dice que se a hacer
		//pero no como va a hacerse
		//Este metodo quedara vacio y las clases hijas seran las que
		//tendran que encargagarse de definirlo
		//al existir un metodo abstracto en una clase
		//la clase tmabien debe volverse abstracta
		public abstract void capacitarse();
}
