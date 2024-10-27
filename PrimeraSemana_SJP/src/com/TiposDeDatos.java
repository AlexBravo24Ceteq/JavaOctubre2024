package com; //La primera línea nos indica el nombre del paquete al que pertenece la clase

public class TiposDeDatos { //Nombre de la clase y llave de apertura


		public static void main(String [] args) {// Método main, apertura main
			//El método main nos permite ejecutar sentencias o programas
			// Automaticamente: main --- Ctrl+ espacio
			//Con las dos diagonales podemos realizar comentarios de una sola línea
			/* Comentarios de multiples lineas 
			 * con una diagonal y un *
			 */
			//Guardar cambios: Ctrl+S
			
			
			/* TIPOS DE DATOS PRIMITIVOS
			 * NUMÉRICOS ENTEROS 
			 */
			
			//Dos formas de declarar variables:
			//Declarando el tipo de dato, el nombre de la variable y dejarlo vacio
			//Posteriormente asiganrle un valor.
			
			byte numeroByte; //Ej. Variable sin valor asignado.
			
			//Asiganmos valor:
			numeroByte = 127;
			
			//Variables con valor o inicializadas 
			byte numeroB = -128; 	// va desde el valor -128 a 127 
									// emplea 1byte de memoria
			
			//Cuando no puede almacenar valores, recurrimos a otro tipo de dato
			short numeroShort = 32767; //Va desde -32768 a 32767 y emplea 2 bytes de memoria
			int numeroInt = -2147483648; //Va desde -2147483648 hasta 2147483648 y emplea 4 bytes de memoria
								  //La variable comodín o más utilizada es la del tipo "int"
			//Después de abarcar el rango de los "int" utilizamos el sufijo "L" 
			long numeroLong = 2147483649L; //Emplea el doble de memoria de los int (8bytes)
			
			/*TIPOS DE DATOS PRIMITIVOS:
			 * NÚMERICOS EN PUNTO O COMA FLOTANTE 
			 * Aceptan valores decimales
			 */
			
	 		float numeroFloat = 3.1416F; //Nos solicita un sufijo "f" y utilizan 4 bytes de memoria
	 		double numeroDouble = 3.1416; //Emplea 8 bytes de memoria
	 		
	 		//La variable comodín más utilizada es la de tipo double 
	 		
			
			/*TIPOS DE DATOS PRIMITIVOS
			 * BOOLEANOS
			 * CARACTER
			 */
	 		
	 		boolean valida = false; // Facilitan el trabajo al evaluar expresiones o condiciones
	 		                     //Solo admiten valores verdadero(true) o falso(false)
	 		
	 		char caracter = 'a'; //Solo admiten un caracter por variable, emplean una memoria de 2 bytes
	 		                    // 1 caracter a la vez
	 							//Se le asigna su valor abriendo y cerrando comilla simple
	 		
	 		
	 		
	 		/* TIPOS DE DATOS NO PRIMITIVOS 
	 		 * TIPOS DE DATOS ESTRUCTURADOS
	 		 * También se les conoce como tipo de dato objeto o 
	 		 * tipo de dato estructurado (clases)
	 		 
	 		 */
	 		//Tipo de dato String (cadena de Texto) 
	 		
	 		String nombre = "Saul"; 
	 		
	 		//nombre. (tipo de dato más complejo, permite encontrar más funciones)
	 		//tipos de dato primitivos solo almacenan valores
	        //La cadena de texto admite caracteres, enunciados, números, letras, símbolos, etc.
	 		
	 		/* TIPOS DE DATOS NO PRIMITIVOS (U OBJETO)
	 		 * TIPO ENVOLTORIO O WRAPPER  
	 		 * Son tipos de dato objeto o estructurado que pueden otorgarle funciones 
	 		 * o propiedades a los de tipo primitivo
	 		 */
	 		Byte numero1;
	 		Byte numero2;
	 		Integer numero3;
	 		Long numero4;
	 		Character letra;
	 		//Boolean, Float, Double...
	 		
	 		//letra. (Podemos llamar la variable y utilizar más funciones con escribir ".")
	 		//Les brinda propiedades a los tipos de datos primitivos, envonviendólos
	 		//mediante métodos para otorgarles otros comportamientos o características
	 		
	 		//No puede haber nombres de variables repetidas aunque tengan distinto tipo de dato
	 		
	 		//Salida de datos o mostrarlos en consola
	 		//Para escribir el comando de system.out.println más rápido
	 		//syso + ctrl + espacio
	 		//sout + ctrl + espacio
	 		
	 		System.out.print("Hola mundo");
	 		
	 		//System.out.println(); imprime lo que hay dentro del parentesis y da un salto de linea
	 		System.out.println("Hola mundo");
	 		System.out.println(nombre);
	 		
	 		System.out.println(4+5);
	 		
	 		int x = 4;
	 		int y = 5;
	 		
	 		System.out.println(x+y);
	 		
	 		//CONCATENACION: Todo se reconoce como texto
	 		System.out.println("El resultado de la suma es: "+ x+y);
	 		
	 		//Si queremos que la operacion se reconozca se encierra entre parentesis
	 		System.out.println("El resultado de la suma es: " + (x+y));
	 		
	 		Integer z = x;
	 		System.out.println(z.doubleValue());
	 		
	 		System.out.println(z.intValue());
	 		
		} //cierre del main

}
