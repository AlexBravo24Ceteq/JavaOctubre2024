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
			return edad; //devuelve un tipo de dato (int)
		}

		public void setEdad(int edad) {
			this.edad = edad; //ejecuta la accion de establecer o asignar una edad a un objeto
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
		}
			
		//METODOS O FUNCIONES
		//Conocidos como comportamientos: Son acciones que nuestros objetos
		//van a poder realizar
		
		//METODOS PROPIOS
		//Metodo sin retorno: palabra reservada "void"
		//Ejecutan algo, pero no estan obligados a devolver algun tipo de dato
		//Ej. metodo  respirar
		
		public void respirar() {
			//cuerpo del metodo
			System.out.println(nombre + " Respirando...");
		}
		
		//Metodos con retorno: devuelven un tipo de dato, dato que se declara
		//y tambien pueden ejecutar alguna logica
		
		//Ej. metodo Saludar
		
		public String saludar() {
			String saludo = "Hola Mundo! Mi nombre es " + nombre;
			
			return saludo;
		}
		
		//POLIMORFISMO
		//Habilidad de una funcion o metodo de poseer varias formas en un identificador
		//Ej. Metodo polimorfico (segunda forma de un metodo)
		public void saludar(String saludo) {
			System.out.println("Hola mundo " + saludo);
		}
		
		//Ej. metodo polimorfico (tercera forma de un metodo)
		public void saludar(String saludo, int hora) {
			System.out.println("Hola Mundo!!" + saludo + "son las " + hora);  //sobrecarga de argmts nos permite tener diferentes
																			//variables (formas) en un mismo identificador.
		}
		
		//METODO ABSTRACTO
		//Un metodo abstracto es squel que nos dice QUÉ hacer
		//Pero no CÓMO  hacerse. Este metodo quedara vacío y las clases
		//hijas serán las que tendrán que encargarse de definirlo.
		//la clase tambien debe volverse abstracta
		
		public abstract void capacitarse(); //Si marca error hacer abstracta la clase "make ..."
		
}
