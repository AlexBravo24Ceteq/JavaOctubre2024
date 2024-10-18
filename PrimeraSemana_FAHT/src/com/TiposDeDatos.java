package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		//anotaciones o comentarios
		// agregan anotaciónes a nuestro codico
		
		/*Comentario
		 * de
		 * multiples
		 * lineas
		 */
		
		/*tenemos dos formas de declarar nuestras variables
		 * la primera es declarando el tipo de dato, el nombre
		 * de la variable y dejarlo así vacío
		 * para posterior asignar un valor
		 */
		
		byte numeroByte;//ejemplo de declaración de variable sin valor
		//asignado
		
		//posteriormente asignamos valor
		numeroByte=127;
		
		//Otra forma de declarar variables es con su valor asignado
		// desde el inicio
		
		byte numeroB= -128;//1 byte de memoria y va del -128 a 127
		short numeroshort=-32768; //-32768 a 32767
		int numeroint=2147483647; // 4 bytes de memoria, más usado
		long numerolong=2147483649L; //8 bytes de memoria y need sufijo L
		// para poder admitir los valores más alla de int
		
		/******Tipos de datos primitivo**********
		 * numéricos en punto coma flotante
		 * aquellos que aceptan valores decimales
		 */
		
		float numerofloat=3.1416F;// 4 bytes de memoria y sufijo F
		double numerodouble=3.1416; // 8 bytes de memoria y NO sujijo
		// el comodín más usado para decimales es double
		
		/*Tipos de datos primitivos,
		 * Booleanos
		 * Caracter
		 */
		
		boolean valida=false; // solo admiten valores true o false
		// utiles para evaluar expresiones o condiciónes
		char simbolo='a'; //un solo caracter por variable usa 2 bytes de memoria
		
		/********Tipos de datos no primitivos*********
		 * Tipos de dato objeto
		 * tipos de dato estructurado
		 * tambien son conocidos como clases
		 */
		
		//Tipo de dato string cadenas de texto
		
		String nombre="Farid Hernandez"; 
		
		//los tipo de dato wrapper o envoltorio son tipos de dato objeto
		//o estructura que otorga funciones o propiedades a los primitivos
		
		Byte numero1;
		Short numero2;
		Integer numero3;
		Long numero4;
		Character letra;
		//Boolean
		//Float
		//Double
		
		/* No puede haber nombres de variables repetidas auque tengan distinto
		 * tipo de dato
		 * String numero =´'1'; con los comentariios tambien 
		 * puede dejar sin uso algunas lineas de codigo para no ser leida
		 */
		
		//Darle salida a nuestros datos en consola
		//impresiones de consola o linea
		
		// solo imprime lo de las comillas tal cual
		System.out.println("Hola mundo   ");
		// imprime variables seguido y da un salto de linea
		// atajo para impresiones d elinea
		// syso + cntl + espacio
		// sout + cntrol + espacio
		
		System.out.println(nombre);
		System.out.println("buenas tardes");
		System.out.println(4+5);
		
		int x=4;
		int y=5;
		
		System.out.println(x+y);
		
		System.out.println("El resultado de la suma es: " + (x+y));
				
	} //cierre de main
} //cierre de la clase
