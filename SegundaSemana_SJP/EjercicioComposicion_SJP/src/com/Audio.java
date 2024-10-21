package com;

public class Audio {
	private String ruido;
	private String tecnologia;
	private double impedancia;
	private double sensibilidad;
	
	public Audio() {
		
	}

	public Audio(String ruido, String tecnologia, double impedancia, double sensibilidad) {
		super();
		this.ruido = ruido;
		this.tecnologia = tecnologia;
		this.impedancia = impedancia;
		this.sensibilidad = sensibilidad;
	}

	public String getRuido() {
		return ruido;
	}

	public void setRuido(String ruido) {
		this.ruido = ruido;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public double getImpedancia() {
		return impedancia;
	}

	public void setImpedancia(double impedancia) {
		this.impedancia = impedancia;
	}

	public double getSensibilidad() {
		return sensibilidad;
	}

	public void setSensibilidad(double sensibilidad) {
		this.sensibilidad = sensibilidad;
	}

	@Override
	public String toString() {
		return "[Audio=" + ruido + ", Tecnologia=" + tecnologia + ", Impedancia (Ohms)=" + impedancia + ", Sensibilidad (dB)="
				+ sensibilidad + "]";
	}
	
}
