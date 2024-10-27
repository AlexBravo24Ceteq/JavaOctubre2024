package com;

public class Main {

	public static void main(String[] args) {
		Libro nuevoLibro = new Libro("Un mundo feliz", "Aldous Huxley" , 216);
		Editorial nuevaEditorial = new Editorial("Mirlo", "Av. Siempre viva, 10", 1000);
		Distribuidor nuevoDistribuidor = new Distribuidor("Arte y letras", "Obregon 5, Centro", true);
		
		Libreria nuevaLibreria = new Libreria("Sotano", "Centro 256", true, 25, nuevoLibro,nuevaEditorial, nuevoDistribuidor);
		System.out.println(nuevaLibreria);
	}

}
