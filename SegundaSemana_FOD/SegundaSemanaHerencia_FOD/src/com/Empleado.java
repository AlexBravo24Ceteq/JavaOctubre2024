package com;
	//la herencia nos va a poder permitir heredar atributos y comportamientos de una clase padre
	//y se realiza con la palabra extens
public class Empleado extends Persona{
	//ingresamos atributos propios de un empleado porque los demas los estariamos heredando
	private String frc;
	private double salario;
	private String turno;
	
	public Empleado() {
		//super();
	}

	public Empleado(String nombre, String genero, int edad, String frc, double salario, String turno) {
		super(nombre, genero, edad);//atributos de clase adre
		this.frc = frc;
		this.salario = salario;
		this.turno = turno;
	}

	public String getFrc() {
		return frc;
	}

	public void setFrc(String frc) {
		this.frc = frc;
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
		return "Empleado [frc=" + frc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	
	//tambien podemos declarar metodos propiosd e un empleado
	public int sumar(int a, int b) {
		return a + b;
	}
	//los metodos abstractos eredados los deven efinir la clases hijas (sobreescribir)
	@Override
	public void capacitarse() {
		System.out.println("Tomando curso de avilidades gerenciales");
		
	}
	
	

}
