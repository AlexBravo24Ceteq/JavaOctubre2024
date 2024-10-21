package com;

//Pilar de la POO HERENCIA
//Nos va a permitir heredar atributos y comportamientos de 
//una clase padre y se realiza con la palabra extends
public class Empleado extends Persona {
	
	//Atributos propios de un empelado
	//Porque los otros los estariamos heredando
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {}// Empleado juan new Empleado();

	public Empleado(String nmombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nmombre, genero, edad);//atributos clase padre
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
	
	//Metodos propios de un Empleado
	public int sumar (int a, int b) {
		return a+b;
	}
	
	//Los m�todos abstractos heredados
	//Los deben definir las clases hijas (sobreescribir)
	@Override
	public void capacitarse() {

		System.out.println("Tomando curso de Habilidades Gerenciales");
		
	}
	
}
