package com;

public class Principal {

	public static void main(String[] args) {
		// ejpl. crear una nueva persona 
		//cuando una clase es abstracta no podemos crear instancias de esa clase
		//podemos utilizar paara solucionar esto el polimorfismo de asignacion
		Persona juan = new Empleado("Juan", "Masculino", 18, "OIDF0000H", 2500, "Vespertino");
		// crear un nuevo empleado
		Empleado jorge = new Empleado("Ferrer", "Masculino", 30, "OIDF0000H", 2500, "Matutino");
		//crear un empleado vavio y asignarle sus valores
		Empleado jesus = new Empleado();
		jesus.setNombre("Jesus");
		jesus.setSalario(3000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		// ejplo de ussu de metodos utilizando el metodo respirar a traves de una persona	
		juan.respirar();
		//tamnien podemos utilizar el metodo respirar a traves de un empleado porque estamos 
		//aplicando la herencia
		jorge.respirar();
		//provando un metodo con retorno
		//String saludo = jesus.saludar(); llama el metodo declarado en saludar
		System.out.println(jesus.saludar());
		// ejemplo provando el metodo sumar a traves de un empleado
		jorge.sumar(15, 12);
		System.out.println(jorge.sumar(15, 12));
		//Investigar conceptos de ¿Qué es una clase abstracta? ¿Qué es una interface? y para qué nos sirven?
		
		//provando el metodo saludar en su segunda forma 
		jesus.saludar("Buenos dias");
		
		jesus.saludar("Buenos dias", 9);
		
		jesus.capacitarse();
		
		//crear un nuevo estudiante y utilizar el metodo capacitarse
		
		Estudiante pedro = new Estudiante();
		pedro.setNombre("Pedro");
		System.out.println(pedro);
		
	}

}
