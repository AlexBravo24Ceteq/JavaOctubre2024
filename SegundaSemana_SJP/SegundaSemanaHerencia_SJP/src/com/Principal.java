package com;

public class Principal {
	
	public static void main(String[] args) {
		
		//Crear nueva persona
		
		//Cuando una clase es abstracta 
		//No podemos crear instancias de esa clase
		//Podemos utilizar el polimorfismo de asignacion para solucionarlo
		//Persona juan = new Persona("Juan", "Masculino", 18);
		Persona juan = new Empleado("Juan", "Maculino", 18, "RFC", 10000, "V");
		//Forma de crear una persona a parti de empleado. No es posible crear personas desde la clase persona.
		
		//Ej, Empleado con todos los argmts.
		Empleado jorge = new Empleado("Jorge", "M", 30, "RACJ941297", 20000, "Matutino");
		
		//Ej. Empleado vacio
		Empleado jesus = new Empleado();
		
		jesus.setNombre("Jesus");
		jesus.setSalario(30000);
		
		System.out.println(juan);
		System.out.println(jorge);
		System.out.println(jesus);
		
		//EjercicioHerencia_SJP
		
		//Ej. uso de metodos
		//Usando metodo respirar a través de Persona (sin retorno)
		juan.respirar();
		
		//Metodo respirar a tráves de Empleado, por herencia (sin retorno)
		jorge.respirar();
		
		//Metodo saludar (con retorno)
		juan.saludar(); // "Hola Mundo mi nombre es " pero no se muestra en consola
		
		//Metodo saludar devuelve en String y lo podemos guardar en otra variable String para su uso posterior
		String saludoJuan = juan.saludar();
		
		System.out.println(juan.saludar());
		
		System.out.println(jorge.saludar());
		
		//Ej. probando el metodo sumar a través de empleado
		//jesus.sumar(10, 15);
		
		System.out.println(jesus.sumar(10,15));
		
		//Metodo saludar en su segunda forma
		jesus.saludar("Buenos días");
		
		//Metodo saludar en su tercera forma
		jesus.saludar(" Buenos Dias ", 9);
		
		//Metodo abstacto definido por empleado
		jesus.capacitarse();
		
		//Estudiante y utilizar el metodo
		Estudiante pedro = new Estudiante();
		pedro.capacitarse();
		
		
	}

}
