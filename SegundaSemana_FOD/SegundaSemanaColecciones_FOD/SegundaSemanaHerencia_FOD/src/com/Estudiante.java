package com;

public class Estudiante extends Persona{
	
	private String escuele;
	private double promedio;
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(String nombre, String genero, int edad, String escuele, double promedio) {
		super(nombre, genero, edad);
		this.escuele = escuele;
		this.promedio = promedio;
	}

	public String getEscuele() {
		return escuele;
	}

	public void setEscuele(String escuele) {
		this.escuele = escuele;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	@Override
	public String toString() {
		return "Estudiante [escuele=" + escuele + ", promedio=" + promedio + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void capacitarse() {
		System.out.println("Tomando curso de matematicas");
		
	}
	

}
