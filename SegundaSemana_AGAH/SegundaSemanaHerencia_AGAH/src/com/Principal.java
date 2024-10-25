package com;

public class Principal {

	public static void main(String[] args) {
		// EJ. Crear una nueva persona
		
		/*
		 * cuando una clase es abstracta
		 * No podemos crear instancias de esa clase
		 * Podemos utilizar el polimorfismo de asignacion
		 * no puede ser persona pero si empleado porque esta heredado con
		 * personas que ya es abstracta
		 * 
		 */
		Persona juan = new Empleado("Juan", "Masculino", 18, "SGEH45879854H", 2000, "Vespertino");
		
		Empleado jorge = new Empleado("jorge", "Masculino", 24, "JORS45214", 20000, "Matutino");
		
		//Crear un ejemplo vacio y asignar valores
		
		Empleado jesus = new Empleado();
		jesus.setNombre("Jesus");
		jesus.setSalario(30000);
		
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		//Crear nuevo proyecto llamado EjercicioHerencia_Iniciales
		//Crear una clase padre que le herede sus atributos y metodos
		//a una clase Hija

		//Ej. de uso de metodos 
		//Utilizando el metodo de respirar a traves de una Persona
		
		juan.respirar();
		
		//Utilizando el metodo respirar a traves de un Empleado
		//porque estamos haciendo herencia
		jorge.respirar();
		
		//Probando un metodo con retorno 
		//El metodo saludar devuelve el saluo en string y lo podemos
		//guardar en otra variable String aqui para su us posterior
		String saludeJuan = juan.saludar();
		
		//O podemos mandarla a imprimir 
		//porque recuerden que 
		//juan.saludar() == "Hola mundo mi nombre es juan"
		System.out.println(juan.saludar());
		
		//Ej. Probando el metodo sumar a traves de un empleado
		System.out.println(jesus.sumar(10, 15));
		
		//Probando el metodo saludar en polimorfismo o su segunda forma
		jesus.saludar("Buenos dias");
		
		//Probando el metodo saludar en su tercera forma
		jesus.saludar("Buenos dias", 9);
		
		//Probando el metodo abstracto que empleado definio
		
		jesus.capacitarse();
		
		//Crear un nuevo estudiante y utilizar el metodo capacitarse
		
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
		
		
		
		
		
		
		
		
		
		
	}

}
