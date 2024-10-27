package com;

public class Principal {

	public static void main(String[] args) {

		Electronicos tv = new Electronicos("Smart TV", "Samsung", "UN40N5200", 6799);
		Celular cel = new Celular("Celular Gama amedia", "SAMSUNG", "S21 Ultra", 6441.60, 6.8, "Intel Core i5", "Negro Mate");
		PC pc = new PC();
		pc.setEspecificacion("PC GAMER");
		pc.setPrecio(6000);
		pc.setRamCapa("32G");
		
		/*Object[] dispositivos = {tv, cel, pc};
		for (Object dispositivo : dispositivos) {
			System.out.println(dispositivo);
		}*/
		
		System.out.println(tv);
		System.out.println(cel);
		System.out.println(pc);
		

	}

}
