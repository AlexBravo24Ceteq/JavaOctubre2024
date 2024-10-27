package com;

public class Empleado extends Persona{
	
	private String rfc;
	private double salario;
	private boolean Matutino;
	
	public Empleado(){}

	public Empleado(String nombre, boolean isMen, int edad, String rfc, double salario, boolean matutino) {
		super(nombre, isMen, edad);
		this.rfc = rfc;
		this.salario = salario;
		Matutino = matutino;
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

	public boolean isMatutino() {
		return Matutino;
	}

	public void setMatutino(boolean matutino) {
		Matutino = matutino;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", Matutino=" + Matutino + ", toString()="
				+ super.toString() + "]";
	}
	
	public int sumar(int a, int b) {
		return a+b;
	}
	
	// los métodos abstractos heredados
	// los deben definir las clases hijas (sobreescribir)
	@Override
	public void capacitarse(String dato) {
		System.out.println("tomando curso habilidad para: "+dato);
	}
	
	
}
