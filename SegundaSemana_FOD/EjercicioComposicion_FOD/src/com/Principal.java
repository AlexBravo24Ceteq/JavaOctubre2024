package com;

public class Principal {

	public static void main(String[] args) {

		Interior inter = new Interior("piel", "piel", true, true);
		Llantas espec = new Llantas("MICHELIN", "PILOT SPORT 5", 205, 45, 17);
		Motor motor = new Motor("CHEVROLET", "Z28 V6 6.4L", 300, false);
		Autos camaro = new Autos("CHEVROLET", "1994", "Rojo", motor, espec, inter);
		
		System.out.println("Informacion del auto");
			System.out.println("Marca: " + camaro.getMarca());
	        System.out.println("Año: " + camaro.getModelo());
	        System.out.println("Color: " + camaro.getColor());
		Object[] objetos = {camaro.getHp(),camaro.getMedida(), camaro.getInterior()};
		
		for (Object object : objetos) {
			System.out.println(object);
		}

	}

}
