package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Procesador DIGIC = new Procesador("DIGIC", 1.8, 124568);
		Calidad altaObaja = new Calidad("Alta", "Omite deformaciones", "Alta");
		Flash tipoFlash = new Flash("Integrada", "Alta", true);
		
		Camara canon = new Camara("Canon", "ser22", 1234, altaObaja, DIGIC, tipoFlash);

		System.out.println(canon);
	}

}
