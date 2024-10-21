package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo. Crear una nueva persona
		
		// cuando una clase es abstracta
		// no podemos crear instancias de esa clase
		// podemos utilizar para solucionar esto el polimorfismo de
		// asignaci�n
//		Persona juan = new Persona("Juan", "Masculino", 18);
		
		Persona juan = new Empleado("Juan", "Masculino", 18, "RFC", 10000, "V");
		
		// Ejemplo. Crear un nuevo empleado
		
		Empleado jorge = new Empleado("Jorge", "Masculino", 300, "RACJ941297", 20000, "Matutino");
		
		//Ej. Crear un empleado vac�o y posteriormente asignarle valores

		Empleado jesus = new Empleado();
		
		jesus.setNombre("Jes�s");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		// Crear nuevo proyecto llamado EjercicioHerencia_OHH1
		// Crear una clase Padre que le herede sus atributos y m�todos
		// a una clase Hija
		// Ej. Electrodom�stico (Clase Padre)
		// Licuadora (Clase Hija)
		
		// Ej. de uso de m�todos
		// Utilizando el m�todo respirar a trav�s de una Persona
		
		juan.respirar();
		
		// Utilizando el m�todo respirar a trav�s de un Empleado
		// porque estamos aplicando la herencia
		
		jorge.respirar();
		
		// Ej. probando un m�todo con retorno (saludar)
		// Aqu� vemos que el m�todo saludar devuelve el saludo en String
		// y lo podemos guardar en otra variable String aqu�
		// para su uso posterior
		
		String saludoDejuan = juan.saludar();
		
		// o podemos mandarla a imprimir
		// Porque recuerden
		// juan.saludar() == "Hola Mundo, mi nombre es Juan"
		
		System.out.println(juan.saludar());
		
		System.out.println(jorge.saludar());
		
		// Ej. probando el m�todo sumar a trav�s de un empleado
		
		System.out.println(jesus.sumar(10, 15));
		 
		
		// Probando el m�todo saludar en su segunda forma
		
		jesus.saludar("Buenos d�as");  
		
		// Probando el m�todo saludar en su tercera forma
		jesus.saludar("Buenos d�as",9 );  
	
		// Probando el m�todo abstracto que empleado defini�
		
		jesus.capacitarse();
		
		// Crear un nuevo estudiante y utilizar el m�todo
		// capacitarse
		
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
		
		
		
	
	
	}
		
	
}
