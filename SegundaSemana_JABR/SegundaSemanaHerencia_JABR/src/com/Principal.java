package com;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo. Crear una nueva Persona
		
		//Cuando una clase es abstracta
		//No podemos crear instancias de esa clase
		//Podemos utilizar para solucionar esto el polimorfismo de
		//asignacion
		Persona juan = new Empleado("Juan", "Masculino", 18, "RFC", 10000,"V");
		
		//Ejemplo. Crear un nuevo Empleado con todos sus argumentos
		Empleado jorge = new Empleado("Jorge", "Masculino", 30, 
				"RACJ941297", 20000, "Matutino");
		
		//Ej. Crear un empleado vacio y posteriormente asignarle valores
		Empleado jesus = new Empleado();
		
		jesus.setNombre("Jesus");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		//Crear un nuevo proyecto llamado EjercicioHerencia_INICIALES
		//Crean una clase Padre que le herede sus atributos y m�todos
		//a una clase Hija
		//Ej. Electrodomestico (Clase Padre)
		// Licuadora (Clase Hija)
		
		//Ej. de uso de m�todos
		//Utilizando el m�todo respirar a trav�s de una Persona
		juan.respirar();
		
		//Utilizando el m�todo respirar a trav�s de un Empleado
		//porque estamos haciendo herencia
		jorge.respirar();
		
		//Ej. Probando un m�todo con retorno (saludar)
		//Aqui vemos que el m�todo saludar devuelve el saludo en String
		//y lo podemos guardar en otra variable String aqui
		//para su uso posterior
		String saludoDeJuan = juan.saludar();
		
		//O podemos mandarla a imprimir
		//Porque recuerden
		//juan.saludar() == "Hola Mundo mi nombre es Juan"
		System.out.println(juan.saludar());
		
		System.out.println(jorge.saludar());
		
		//Ej. probando el m�todo sumar a trav�s de un empleado
		System.out.println(jesus.sumar(10, 15));
		
		//Probando el m�todo saludar en su segunda forma
		jesus.saludar("Buenos d�as");
		
		//Probando el m�todo saludar en su tercera forma
		jesus.saludar("Buenos d�as", 9);
		
		//Probando el m�todo abstracto que empleado definio
		
		jesus.capacitarse();
		
		//Crear un nuevo estudiante y utilizar el m�todo
		//capacitarse
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
		
		jesus.raizCuadrada(20);
		
		

	}

}
