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
		
		//Ej. de uso de m�todos
		//Utilizando el metodo respirar a traves de una Persona
		juan.respirar();
		
		//Utilizando el m�todo respirar a traves de un empleado
		jorge.respirar();
		jesus.respirar();
		
		//Ej. Probando un m�todo con retorno
		String saludoDeJuan = juan.saludar();
		
		System.out.println(juan.saludar());
		System.out.println(jorge.saludar());
		
		System.out.println(jesus.sumar(10, 15));
		
		//probando el m�todo saludar en segunda forma
		jesus.saludar("Buenos d�as");
		
		//Probando el m�todo saludar en su tercera forma
		jesus.saludar("Buenos d�as", 9);
		
		//Probando el m�todo abstracto que empleado definio
		jesus.capacitarse();
		
		//Crear un nuevo estudiante y utilizar el m�todo
		//capacitarse
		
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
		
		

	}

}
