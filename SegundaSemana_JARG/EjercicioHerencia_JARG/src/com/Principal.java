package com;

public class Principal {

	public static void main(String[] args) {
		
		Usuario angel = new Usuario("Angel", "Maculino", 18);
		
		Support daniel = new Support();
		daniel.setNombreUsuario("Daniel");
		daniel.setAfiliacion("Magos Curadores");
		
		Support juan = new Support("metaljuan05", "Masculino", 27, "Clan Bendita xD");
		
		
		System.out.println(angel);
		System.out.println(daniel);
		System.out.println(juan);

	}

}
