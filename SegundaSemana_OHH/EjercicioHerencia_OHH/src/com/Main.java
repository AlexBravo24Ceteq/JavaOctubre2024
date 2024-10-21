package com;

public class Main {

	public static void main(String[] args) {
		Juguetes nuevoJuguetes = new Juguetes("Videojuego Mario Bros 3", 525.30, true);
		
		Rompecabezas nuevoRompecabezas =  new Rompecabezas("OP", 250, true, "1000 piezas", "Toei", true);
		FigurasDeAccion figuraAccion = new FigurasDeAccion("Broly", 600.00, false, true, "DBZ-AE-100", 2);
		
		System.out.println(nuevoJuguetes);
		System.out.println();
		System.out.println(nuevoRompecabezas);
		System.out.println();
		System.out.println(figuraAccion);
	}

}
