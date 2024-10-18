package com;

public class Estudiante extends Persona{

	private String escuela;
	private double promedio;
	
	public Estudiante() {}
	
	
	
	public Estudiante(String nombre, String genero, int edad, String escuela, double promedio) {
		super(nombre, genero, edad);
		this.escuela = escuela;
		this.promedio = promedio;
	}

	

	public String getEscuela() {
		return escuela;
	}



	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}



	public double getPromedio() {
		return promedio;
	}



	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}


	
	
	@Override
	public String toString() {
		return "Estudiante [escuela=" + escuela 
				+ ", promedio=" + promedio 
				+ ", toString()=" + super.toString() + "]";
	}



	@Override
	public void capacitarse() {
		System.out.println("Tomando curso de Matematicas");
		
	}
	
	

	
	
}
