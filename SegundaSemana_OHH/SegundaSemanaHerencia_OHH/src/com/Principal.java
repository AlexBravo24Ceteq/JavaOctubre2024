package com;

public class Principal {

	public static void main(String[] args) {
//		si una clase se vuelve abstracta no podemos instanciar objetos de esta
//		eje. juan, pero se puede usar polimorfismo de asignación
		Persona juan =  new Empleado("Juan", "Masculino", 18, "RFC", 10000, "V");
		
//		empleado con argumentos
		Empleado jorge = new Empleado("Jorge", "Masculino", 30, "RACJ941297", 20000, "matutino");
//		sin argumentos
		Empleado jesus = new Empleado();
		jesus.setNombre("Jesus");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
//		ejemplo de uso de métodos, usando Respirar con persona
		String saludoJuan = juan.saludar();
		juan.respirar();
		System.out.println(saludoJuan);
		System.out.println();
//      ejemplo con empleado
		jorge.respirar();
		System.out.println(jorge.saludar());
		System.out.println();
		jesus.respirar();
		System.out.println(jesus.saludar());
		
//		probando sumar atraves del empleado y guardando en variable
		System.out.println();
		int sumaDatos = jorge.sumar(10, 20);
		System.out.println("La suma de jorge es " + sumaDatos);
		
//		probando sumar atraves del empleado y guardando sout
		System.out.println();
		System.out.println("La suma de jesus es " + jesus.sumar(20, 20));
		
//		probando saludar con un argumento, segunda forma polimorfica
		System.out.println();
		String saludo = "Buenos días";
		juan.saludar(saludo);
		
//		probando saludar con  dos argumentos, tercera forma polimorfica
		System.out.println();
		String saludo2 = "buenos días";
		int hora = 9;
		juan.saludar(saludo2, hora);
		
//		probando el método abstracto de Persona
		System.out.println();
		jesus.capacitarse();
		
		System.out.println();
		Estudiante pedro = new Estudiante();
		pedro.capacitarse();
		
	}
	
}
