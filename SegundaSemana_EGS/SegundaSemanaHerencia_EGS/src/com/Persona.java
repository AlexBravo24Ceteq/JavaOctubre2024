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
	
	//M�TODOS O FUNCIONES
	//COMPORTAMIENTOS
	//Son acciones que nuesdtros objetos van poder 
	//realizar
	
	//M�todos propios
	//Llevan la palabra reservada "void"
	//Ejecutan algo, pero no deben devolver
	//o no est�n obligados a devolver algun tipo de dato
	
	//Ej. declarar un metodo que se llame respirar
	
	public void respirar() {
		System.out.println(nombre + " Respirando....");
	}
	
	//Metodos con retorno
	//deben devolver un tipo de dato, el tipo de dato que declaran
	//Y pueden ejecutar alguna logica
	
	//Ej. un M�todo que se llame saludar y devuelva un Saludo
	
	public String saludar() {
		String saludo = "Hola Mundo mi nombre es " + nombre;
		
		return saludo;
	}
		
		//Ej. de m�todo polimorfismo - (segunda forma de un m�todo)
		//POLIMORFISMO - habilidad de una funcion o m�todo de poseer varias
	    //formas de un mismo identificador
	    //Se logra gracias a la sobrecarga de argumentos
		public void saludar(String saludo) {
			System.out.println("Hola mundos " + saludo);
		}
		
		//Ej. de metodo polimorfico - (tercera forma de un m�todo)
		public void saludar(String saludo, int hora) {
			System.out.println("Hola mundo " + saludo + " son las " + hora);
		}
		
		//Ejemplo de declarar un m�todo abstacto
		//Un m�todo abstracto es aquel que nos dice QUE se va hacer
		//pero no como va hacerse
		//�ste metodo quedar� vac�o y las clases hijas ser�n las que
		//tendr�n que encargarse de definirlo
		
		public abstract void capacitarse();
	

}
