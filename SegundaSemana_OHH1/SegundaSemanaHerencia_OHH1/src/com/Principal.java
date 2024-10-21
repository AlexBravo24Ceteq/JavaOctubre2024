package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo. Crear una nueva persona
		
		// cuando una clase es abstracta
		// no podemos crear instancias de esa clase
		// podemos utilizar para solucionar esto el polimorfismo de
		// asignación
//		Persona juan = new Persona("Juan", "Masculino", 18);
		
		Persona juan = new Empleado("Juan", "Masculino", 18, "RFC", 10000, "V");
		
		// Ejemplo. Crear un nuevo empleado
		
		Empleado jorge = new Empleado("Jorge", "Masculino", 300, "RACJ941297", 20000, "Matutino");
		
		//Ej. Crear un empleado vacío y posteriormente asignarle valores

		Empleado jesus = new Empleado();
		
		jesus.setNombre("Jesús");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		// Crear nuevo proyecto llamado EjercicioHerencia_OHH1
		// Crear una clase Padre que le herede sus atributos y métodos
		// a una clase Hija
		// Ej. Electrodoméstico (Clase Padre)
		// Licuadora (Clase Hija)
		
		// Ej. de uso de métodos
		// Utilizando el método respirar a través de una Persona
		
		juan.respirar();
		
		// Utilizando el método respirar a través de un Empleado
		// porque estamos aplicando la herencia
		
		jorge.respirar();
		
		// Ej. probando un método con retorno (saludar)
		// Aquí vemos que el método saludar devuelve el saludo en String
		// y lo podemos guardar en otra variable String aquí
		// para su uso posterior
		
		String saludoDejuan = juan.saludar();
		
		// o podemos mandarla a imprimir
		// Porque recuerden
		// juan.saludar() == "Hola Mundo, mi nombre es Juan"
		
		System.out.println(juan.saludar());
		
		System.out.println(jorge.saludar());
		
		// Ej. probando el método sumar a través de un empleado
		
		System.out.println(jesus.sumar(10, 15));
		 
		
		// Probando el método saludar en su segunda forma
		
		jesus.saludar("Buenos días");  
		
		// Probando el método saludar en su tercera forma
		jesus.saludar("Buenos días",9 );  
	
		// Probando el método abstracto que empleado definió
		
		jesus.capacitarse();
		
		// Crear un nuevo estudiante y utilizar el método
		// capacitarse
		
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
		
		
		
	
	
	}
		
	
}
