package com;

public class Principal {

	public static void main(String[] args) {

		Almacenamiento ssd = new Almacenamiento("Seagate", "STJR1000400", 1024);
		Control mando = new Control("Elite", "Negro", true);
		Conectividad conexiones = new Conectividad(7, "HDMI Ultra Hig Speed", true);
		
		Consola xbox = new Consola("Microsoft", "Xbox Series X", false, ssd, mando, conexiones);
		
		System.out.println(xbox);
		
		}

}
