package com;

public class Empleado extends Persona { 
	private String rfc;
	private double salario;
	private String turno;
	
//	constructor vacio y con argumentos
	public Empleado() {
		
	}

	public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}

//	getters y setters
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
	
//	métodso propios del empleado
	
	public int sumar(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

//	@Override sobreescribiendo el método abstracto de Persona y se definen en
//	las clases hijas
	public void capacitarse() {
		System.out.println("Tomando curso de habilidades gerenciales");
		
	}
}
