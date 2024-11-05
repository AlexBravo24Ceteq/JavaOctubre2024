package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		
		/*Tipos de datos primitivos
		 * Booleanos
		 * Caracter
		 */
		
		boolean valida = false;//solo admite verdadero o falso
		//y estas variables y tipos de dato son utiles para evaluar expresiones
		//o condiciones, 2 bytes en memoria
		
		char simbolo = '#';//solo admite 1 caracter por variable y utiliza
		//2 bytes en memoria
		
		/*Tipos de dato no primitivos, empiezan con mayusculas
		 * TIPOS DE DATO OBJETO
		 * tipo de dato estructurado
		 * tambien conocidas como clases
		 * 
		 */
		
		//Tipo de dato String //cadenas de texto
		
		String nombre = "Gerardo Lopez";
		
		//Los tipos de dato Wrapper o Envoltorio son tipos de dato objeto
		//o estructurados que pueden otorgarle funciones o propiedades
		//a los tipos primitivos
		
		Byte numero1;
		Short numero2;
		Integer numero3;
		Long numero4;
		Character letra;
		//Boolean
		//Float
		//Double
		
		//No puede haber nombre de variables repetidas aunque tengas
		//distinto tipo de dato
		
		//imprime lo que esta dentro de los parentesis, pero en esa misma linea
		System.out.print("Hola");
		
		//System.out.println imprime lo que hay dentro y da un salto de linea
		//sysp + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println("Holaaa");
		
		int x = 4;
		int y = 5;
		
		//Aqui en la siguente linea entramos en concatenacion
		//todo se reconoce como texto para mandarlo a imprimir
		System.out.println("El resultrado de la suma es: " + x+y);
		
		//Si queremops que la operacion se reconozxca hay que encerrarla en parentesis
		System.out.println("El resultrado de la suma es: " + (x+y));
	}
}
