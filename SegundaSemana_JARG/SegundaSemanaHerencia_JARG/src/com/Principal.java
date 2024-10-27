package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo. Crear una nueva persona
		
		//Cuando una clase es abstracta 
		//No podemos crear instancia de esa clase
		//Podemos utilizar para solucionar esto el polimorfismo de 
		//asignacion
		
		//Persona juan = new Persona("Juan", "Maculino", 18);
		
		Empleado juan = new Empleado("Juan", "Masculino", 18, "RFC", 10000, "v");
		
		//Ejemplo. Crear un nuevo empleado con todos sus argumentos
		Empleado jorge = new Empleado("Jorge", "Maculino", 30, "RACJ941297", 20000, "Mañana");
		
		//Ejemplo. Crear un empleado vacio y posteriormente asignarle
		
		Empleado jesus = new Empleado();
		
		jesus.setNombre("Jesus");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		//Crear un nuevo proyecto llamado EjercicioHerencia_INICIALES
		//Crean una clase Padre que le herede sus tributos y metodos
		//auna clase hija
		//Ej.Electrodomesticos (Clase Padre)
		//Licuadira (Clase Hija)
		
		//Ej. de uso de metodos
		//Utilizando el metodo respirar a traves de una Persona
		juan.respirar();
		
		//Utilizando el metodo respirar a travez de un Empleado
		//porque estamos haciendo herencia
		
		jorge.respirar();
		
		//Ej. probando un metodo con retorno (saludar)
		//El  metodo saludar devuelve el saludo en String y se puede guardar
		//en otra variable String para su uso posterior
		String saludoDeJuan = juan.saludar();
		//O podemos mandarla a imprimir
		//Porque recuerden
		//juan.saludar() == "Hola Mundo mi nombre es juan"
		System.out.println(juan.saludar());
		
		System.out.println(jorge.saludar());
		
		System.out.println(jorge.sumar(10, 15));
		
		//Probando el metodo saludar en su segunda forma
		
		jesus.saludar("Buenos dias");
		
		//Probando el metodo saludar en su tercera forma
		jesus.saludar("Buenos dias", 9);
		
		//Probando el metodo abstracto que empleado definio
		
		jesus.capacitarse();
		
		//Crea un nuevo estudiante y utilizar el metodo
		//capacitarse
		
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
	}

}
