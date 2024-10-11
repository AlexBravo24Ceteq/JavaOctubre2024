package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {
		// Comentarios de una linea
		
		/*
		 * Comentarios Multilinea
		 */
		
		/*
		 * Tenemos dos formas de declarar nuestras variables
		 * La primera de ellas es declarando el tipo de dato, el nombre
		 * de la variable y dejarlo así vacío
		 * para posteriormente asignarle un valor
		 */
		
		byte numeroByte; // ejemplo de declaracion de variable sin valor asignado
		// denotar notacion CamelCase lowercase
		
		// Posteriormente asignamos valor
		numeroByte = 127;
		
		//Otra forma de declarar variables es con su valor asignado desde un inicio
		
		/* 
		 * TIPOS DE DATOS PRIMITIVOS
		 * TIPOS DE DATOS NTEROS 
		 */
		
		byte numeroB = -128; // 1 byte de memoria puede almacenar del -128 al 127
		short numeroShort = 32767; // Va del -32768 al 32767, emplea 2 bytes de memoria
		int numeroInt = 2147483647; /* va del -2147483648 al 2147483647, 4 bytes de memoria
									* Casi siempre este es el más utilizado
									*/
		long numeroLong = 2147483649L; /*
										*8 bytes de memoria
										*necesita sufijo letra "L" para admitir valores
										*más alla de los Int
										*/
		// el comodin más utilizado es el tipo de dato "int"
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS DE PUNTO O COMA FLOTANTE
		 * AQUELLOS QUE ACEPTAN VALORES DECIMALES 
		 */
		
		float numeroFloat = 3.1416F; // 4 bytes de memoria necesitan sufijo letra "F"
		double numeroDouble = 3.1416; // 8 bytes de memoria y no necesitan sufijo
		
		// el comodin m'as utilizado para decimales es el tipo double
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * DATOS BOOLEANOS
		 * CARACTER
		 */
		
		boolean valida = false; /* Solo admiten los valores (true / false)
								* Estos tipos de datos son utiles para evaluar expresiones
								* y o condiciones
								*/
		char simbolo = '#'; // Admiten un solo caractyer por variable
		// Utiliza 2 bytes de memoria
		
		// TIPOS DE DATOS NO PRIMITIVOS
		/* TIPOS DE DATO OBJETO
		 * TAMBIEN CONOCIDAS COMO CLASES
		 */
		
		// Tipo de dato String // cadenas de texto
		
		String nombre = "Erick";
		
		/*Los tipos de datos Wrapper o Envoltorio son tipos de datos objeto
		 * o estructurales que pueden otorgarle funciones o propiedades
		 * a los tipos primitivos
		 */
		
		Byte numero1;
		Short numero2;
		Integer numero3;
		Long numero4;
		Character letra;
		// Boolean
		// Float
		// Double
		
		/* NO PUEDE HABER NOMBRES DE VARIABLES REPETIDAS AUNQUE TENGAN
		 * DISTINTO TIPO DE DATO
		 */
		
		//String numero1 = "1"; con los comentarios puedo dejar sin uso 
		//algunas lineas de codigo para que no sean leidas
		
		// DAR SALIDA A NUESTROS DATOS EN CONSOLA
		// IMPRESIONES EN CONSOLA / IMPRESIONES DE LINEAS
		
		//System.out.print Impri,e lo que esta dentro () pero en una misma linea
		System.out.print("Hola Mundo");
		
		//System.out.println imprime lo que hay dentro y da un salto de linea
		System.out.println(nombre);
		
		/* ATAJOS PARA IMPRESIONES DE LINEA
		 * syso + ctrl + espacio
		 * sout + ctrl + espacio
		 */
		
		int x = 4;
		int y = 5;
		System.out.println(x+y);
		// Aqui en la siguiente linea entramos en conctenacion 
		// todo se reconoce como texto para mandarlo a imprimir
		System.out.println("El resultado de la suma es: "+ x+y);
		
	}
}
