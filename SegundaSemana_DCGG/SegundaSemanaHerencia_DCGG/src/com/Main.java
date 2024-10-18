package com;

public class Main {

	public static void main(String[] args) {
		
		// Ejemplo crear una nueva persona
		Persona juan = new Empleado();
		
		// Ejemplo crear un nuevo empleado con todos sus argumentos
		Empleado jorge = new Empleado("Jorge", true, 30, "jorge156t80", 20000.00, true);
		
		// Ejemplo de crear un nuevo empleado vacio y luego agregarle valores
		Empleado jesus = new Empleado();
		jesus.setNombre("Jesús");
		jesus.setSalario(30000);
		jesus.setEdad(25);
		
		System.out.println(juan);
		System.out.println();
		System.out.println(jorge);
		System.out.println();
		System.out.println(jesus);
		System.out.println();
		
		juan.respirar();
		jorge.respirar();
		System.out.println(jesus.saludar());
		
		// Ej. probando el metodo sumar de un empleado
		System.out.println("resultado del metodo sumar: "+jesus.sumar(2, 5));
		
		jesus.saludar(" buenos días");
		jorge.saludar("Juan", 9);
		
	}

}
