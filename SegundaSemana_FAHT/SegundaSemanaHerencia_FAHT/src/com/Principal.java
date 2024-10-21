package com;

public class Principal {

	public static void main(String[] args) {
		// ejemplo Crear una nueva persona
		
		//Cuando una clase es abstracta
		// no podemos crear insancias de esa clase
		//Podemos utilizar para solucionar esto el polimorfismo 
		// de asignacion
		
		Persona juan = new Empleado ("Juan", "Masculino", 18,"RFC",1000,"V");
		
		//ejemplo Crear un nuevo empleado con todos los argumentos

		Empleado jorge = new Empleado("Jorge", "masculino", 30, "hfhfhf", 3000, "uno");
		
		Empleado jesus = new Empleado ();
		jesus.setNombre ("jesus");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		//ej uso metodos
		//Utilizamos el metodo respirar a travez de una persona
		juan.respirar();
		//Utilizando el metodo respirar a traves de un empleado
		//porque estamos haciendo eherencia
		jorge.respirar();
		
		//ej un metodo que se llame saludar y devolver un saludo
		String saludodejuan = juan.saludar();
		
		System.out.println(juan.saludar());
		
		//ejemplo probando metofo suma atravez de un empleado
		System.out.println(jesus.sumar(10, 15));
		
		//Probando el metodo saludar en su segunda forma
		jesus.saludar("Buenos días ");
		
		//Probando el metodo saludar en su tercera forma forma
		jesus.saludar("Buenos dias", 9);
		
		//probando el metodo abstracto que empleado definio
		jesus.capacitarse();
		
		//crear un nuevo estudiante y utilizar el metodo
		//capacitarse
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
		
		Estudiante mora = new Estudiante();
		 mora.capacitarse();
		
	}//end

}
