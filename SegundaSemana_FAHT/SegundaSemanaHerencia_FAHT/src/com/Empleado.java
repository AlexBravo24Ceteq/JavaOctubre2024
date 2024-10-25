package com;

public class Empleado extends Persona{

	

	//PIlar de la programacion HERENCIA
	//Nos va a permitit heredar atributos y comportamientos de
	// una clase padre y se realiza con la palabra extends
	
	
	// atributos propis de un empleado
		//porque los otros los estamos heredando
		
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado () {}

	public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}

//metodos propios de un empleado
	public int sumar (int a, int b) {
		return a + b ;
	}
//Los metodos abstractos heredados los deben definir
	//las clases hijas (sobreescribir)
	@Override
	public void capacitarse() {
		System.out.println("Tomando curso de habilidades gerenciales");
		
	}

	
}//end
