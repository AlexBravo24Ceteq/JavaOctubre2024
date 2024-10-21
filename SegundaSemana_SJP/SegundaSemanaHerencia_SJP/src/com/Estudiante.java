package com;

public class Estudiante extends Persona{
	
	private String escuela;
	private double primedio;
	public Estudiante() {}
	
	
	
	public Estudiante(String nombre, String genero, int edad, String escuela, double primedio) {
		super(nombre, genero, edad);
		this.escuela = escuela;
		this.primedio = primedio;
	}

	public String getEscuela() {
		return escuela;
	}



	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}



	public double getPrimedio() {
		return primedio;
	}



	public void setPrimedio(double primedio) {
		this.primedio = primedio;
	}



	@Override
	public String toString() {
		return "Estudiante [escuela=" + escuela + ", primedio=" + primedio + ", toString()=" + super.toString() + "]";
	}



	@Override
	public void capacitarse() {
		System.out.println("Tomando curso de Matematicas");
	}
	

}
