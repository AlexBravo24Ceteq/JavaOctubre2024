package com;

public class Pensionado extends Adulto{

	private int numeroAfiliacion;
	private String curp;
	private double pension;
	
	public Pensionado() {
		
	}

	public Pensionado(String nombre, String genero, int edad, int numeroAfiliacion, String curp, double pension) {
		super(nombre, genero, edad);
		this.numeroAfiliacion = numeroAfiliacion;
		this.curp = curp;
		this.pension = pension;
	}

	public int getNumeroAfiliacion() {
		return numeroAfiliacion;
	}

	public void setNumeroAfiliacion(int numeroAfiliacion) {
		this.numeroAfiliacion = numeroAfiliacion;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public double getPension() {
		return pension;
	}

	public void setPension(double pension) {
		this.pension = pension;
	}

	@Override
	public String toString() {
		return "Pensionado [numeroAfiliacion=" + numeroAfiliacion + ", curp=" + curp + ", pension=" + pension
				+ ", \ntoString()=" + super.toString() + "]";
	}
	
}
