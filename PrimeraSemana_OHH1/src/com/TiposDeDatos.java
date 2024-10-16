package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		//Comentarios de una sola línea
		//Los comentarios nos sirven para documentar o agregar anotaiones en nuestro código
		/*Comentarios de  
		 * multiples líneas, con cada enter el comentario va creciendo en líneas
		 */
		// CRTL + S para guardar los cambios
		
		/*Tipos de datos primitivos 
		 * Numéricos enteros
		 */
		
		//Tenemos dos formas de declarar nuestras variables 
		//La primera de ellas es declarando el tipo de dato, el nombre
		//de la variable y dejarlo así vacío
		//para posteriormente asignarle un valor
		
		byte numeroByte; //ejemplo de declaración de variable sin valor asignado
		
		//posteriormente asignamos valor
		
		numeroByte = 127;
		
		//otra forma de declarar variables es con su valor asignado desde un inicio
		
		byte numerob = -128; //1 byte de memoria y puede almacenar del -128 al 127 
		
		short numeroShort = -32768; // -32768 al 32767 y emplea 2 bytes de memoria para almacer estos datos
		
		int numeroInt = 2147483647; //4 bytes de memoria, casi siempre este es el más utilizado
		
		long numeroLong = 2147483649L; //8 bytes de memoria y necesita el sufijo de la letra L para poder admitir
		//los valores más allá de los int
		
		//El comodín más utilizado es el tipo de dato int
		
		/*Tipos de datos primitivos
		 * Numéricos en punto coma Flotante
		 * Aquellos que aceptan valores decimales
		 */
		
		float numeroFloat = 3.1416F; //4 bytes de memoria y necesitan el sufijo F
		double numeroDouble = 3.1416F; //4 bytes de memoria y necesitan el sufijo F
		
		//El comodín más utilizado para decimales, es el tipo de dato double
		
		/*Tipos de datos primitivos
		 * Booleanos
		 * Caracter
		 */
		
		boolean valida = true; //Solo admiten los valores true / false
		//y estas variables y tipos de datos son útiles para evaluar expresiones o condiciones
		
		char simbolo = '#'; //Admiten un solo caracter por variable y utiliza 2 bytes de memoria
		
		//Tipos de datos No Primitivos
		/*Tipos de datos objeto
		 * Tipos de dato estructurado
		 * También son conocidas como clase
		 */
		 
		 //Tipo de datos String //cadenas de texto
		
		String nombre = "Odilón Hernández"; //Este tipo de dato empieza su nombre con mayúscula (tipo de dato objeto)
		
		//Los timpo de dato Wrapper o envoltorio, son tipos de dato objeto
		//o estructurados que pueden otorgarle funciones o propiedades
		//a los tipos primitivos
		
		Byte numero1;
		Short numero2;
		Integer numero3;
		Long numero4;
		Character letra;
		//Boolean;
		//Float;
		//Double
		
		//No puede haber nombres de variables repetidas aunque tengan distinto tipo de dato
		
		//String numero1 = "1"; con los comentarios también puedo dejar sin 
		//unos algunas líneas de código para que no sean leídas
		
		//Darle salida a nuestros datos en consola
		//Impresiones en consola / Impresiones de líneas
		
		System.out.println("Hola mundo");
		
		//Atajo para impresiones de línea es
		//syso + crtl + espacio
		//sout + crtl + espacio
		System.out.println(nombre);//incluye un salto de línea
		
		System.out.println(4+5);
		
		int x = 4;
		int y = 5;
		
		System.out.println(x+y);
		
		System.out.println("El resultado de la suma es: "+ x+y);
		
		//Si queremos que la operación se reconozca hay que encerrarla entre paréntesis
			
		System.out.println("El resultado de la suma es: "+ (x+y));
				
		
	} //cierre del método main
	
	
}//cierre de la clase
