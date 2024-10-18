package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo Crear una nueva Persona
		
		//Cuando una clase es abstracta no podemos crear instancias
		//de esa clase
		//Podemos utiloizar para solucionar esto el polimorfismo
		//de asignacion
		//Persona juan = new Persona("Juan","Masculino",18);
		Persona juan = new Empleado("Juan","Masculino",18,"RFC",25000,"Vespertino");
		
		//Ejemplo Crear un nuevo empleado con todos los argumentos
		Empleado jorge = new Empleado("Jorge", "Masculino", 30, "RACF", 20000, "Matutino");
		
		//Ejemplo Crear un empelado vacio y posteriormente asignarle valores
		Empleado jesus = new Empleado();
		
		
		jesus.setNombre("Jesus");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		//Ej. uso de metodos
		//Utilizando el metodo respirar a traves de una Persona
		juan.respirar();
		
		//Utilizando el metodo respirar a traves de un Empleado
		//por que estamos haciendo herencia
		jorge.respirar();
		
		//Ej, Probando un metodo con retorno(saludar)
		//Aqui vemos que el metodo saludar devuelve el saluido en String
		//y lo podemos guardar en otra variable String aqui
		//para su uso posterior
		juan.saludar();
		String saludoJuan = juan.saludar();
		
		//O podemos mandarla a imprimir
		//por que recuerden
		//juan.saludar() == "Hola mundo mi nombre es juan"
		System.out.println(juan.saludar());
		System.out.println(saludoJuan);
		
		System.out.println(jorge.sumar(5, 6));
		
		//Probando el metodo saludar en su segunda forma
		jesus.saludar("que onda");
		
		//Probando el metodo saludar en su 3ra forma
		jesus.saludar("Buenos dias", 10);
		
		//Probando el metodo abstracto que empleado definio
		
		jesus.capacitarse();
		
		//Crear un nuevo estudiante y utilizar el metodo
		//capacitarse
		
		Estudiante pedro = new Estudiante();
		
		pedro.capacitarse();
				
	}

}
