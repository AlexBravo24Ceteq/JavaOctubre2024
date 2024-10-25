package com;

public class Principal {

	public static void main(String[] args) {
		// EJ: crear una nueva persona
		
		//cuando una clase es abstracta no podemos crear instancias
		//de esa clase
		//podemos utilizar para solucionar esto 
		//el polimorfismo de asignacion
		//Persona juan = new Persona("Juan", "Masculino", 18);
		Persona juan = new Empleado("Juan", "Masculino", 18, "RFC", 10000, "V");
				
				//EJ: Crear un nuevo empleado con todos sus argumentos
				Empleado jorge = new Empleado("Jorge", "Masculino", 30, "RACJ9441297", 20000, "Matutino");
		//Crear un empleado vacio y posteriromente asignarle valores
				
				//Ej:Crear un empleado vacio y posteriromente asignarle valores
				Empleado jesus = new Empleado ();
		jesus.setNombre("Jesus");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		
// Crear un nuevo proyecto llamado EjercicioHerencia_INICIALES
		//Crear una clase Padre que le herede sus atributos y metodos
		//a una clase Hija
		//Ej: Electrodomestico (Clse Padre)
		//Licuadora (Clase Hija)
		
		//EJ. de uso de metodos
		//Utilizando el metodo respirar a traves de una Persona
		juan.respirar();
		
		//Utilizando el metodo respirar a traves de un empleado
		//por que estamos haciendo herencia
		jorge.respirar();
		
		//Ej. Probando un metodo con retorno (saludar)
		//Aqui vemos que el metodo saludar devuelve el saludo en String
		//Y lo podemos guardar en otra variable String aqui
		//para su uso posterior
		String saludodejuan = juan.saludar();
		
		//O podemos mandarla a imprimir
		//porque recuerden
		//Juan.saludar() == "Hola mundo mi nombre es Juan"
		System.out.println(juan.saludar());
		
		System.out.println(jorge.saludar());
		
		//Ej.Probando el metodo sumar a traves de un empleado
		System.out.println(jesus.sumar(10, 15));
		
		//Probando el metodo saludar en su segunda forma
		jesus.saludar("Buenos dias");
		
		//Prob
		jesus.saludar("Buenos dias", 9);
		
		//Probando elm metodo abstracto que empleado definio
		
		jesus.capacitarse();
		
		//Crear un nuevo estudiante y utlizar el metodo
		//Capacitarse
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
		
		
	}


}
