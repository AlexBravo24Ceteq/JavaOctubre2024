package com;

public class Estudiante extends Persona {
	private String escuela;
	private double promedio;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Estudiante(String nombre, String genero, int edad, String escuela, double promedio) {
		super(nombre, genero, edad);
		this.escuela = escuela;
		this.promedio = promedio;
	}



	@Override
	public void capacitarse() {
		System.out.println("Tomando curso de Matematicas");
		
	}
	

}
