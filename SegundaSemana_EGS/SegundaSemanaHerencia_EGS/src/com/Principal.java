package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo. crae una nueva Persona
		
		Persona juan = new Empleado("Juan", "Masculino", 18,"RFC", 10000, "V");
		
		//Ejemeplo. Crear un empleado con todos sus argumentos
		
		Empleado jorge = new Empleado("Jorge", "Masculino", 30, 
				"RACJ941297", 20000, "Matutino");
		
		Empleado jesus = new Empleado();
		
		jesus.setNombre("Jesus");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		//Ej. de uso de métodos
		//Utilizando el metodo respirar a traves de una Persona
		juan.respirar();
		
		//Utilizando el método respirar a traves de un empleado
		jorge.respirar();
		jesus.respirar();
		
		//Ej. Probando un método con retorno
		String saludoDeJuan = juan.saludar();
		
		System.out.println(juan.saludar());
		System.out.println(jorge.saludar());
		
		System.out.println(jesus.sumar(10, 15));
		
		//probando el método saludar en segunda forma
		jesus.saludar("Buenos días");
		
		//Probando el método saludar en su tercera forma
		jesus.saludar("Buenos días", 9);
		
		//Probando el método abstracto que empleado definio
		jesus.capacitarse();
		
		//Crear un nuevo estudiante y utilizar el método
		//capacitarse
		
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
		
		

	}

}
