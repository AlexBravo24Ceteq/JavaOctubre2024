package com;

public class Principal {

	public static void main(String[] args) {

		//Crear nueva cuenta
		PlanTV cliente = new PlanTV("YoSoy", "Premium", 4);
		
		//Ej, cuenta con todos los argmts.
		Pago miplan = new Pago("YoSoy", "Premium", 4, 300, "Tarjeta Credito", "Mensual");
		
		//Ej. cuenta vacia
		Pago plan2 = new Pago();
		
		plan2.setPrecio(100);
		plan2.setUsuario("Personal");
		plan2.setPlan("Estandar");
		
		System.out.println(cliente);
		System.out.println(miplan);
		System.out.println(plan2);
		
	}

}
