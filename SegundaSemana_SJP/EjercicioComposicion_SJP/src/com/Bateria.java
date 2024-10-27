package com;

public class Bateria {
	
	private String carga;
	private String capacidad;
	private String duracion;
	
	public Bateria () {
		
	}

	public Bateria(String carga, String capacidad, String duracion) {
		super();
		this.carga = carga;
		this.capacidad = capacidad;
		this.duracion = duracion;
	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "[Tipo de carga=" + carga + ", Capacidad=" + capacidad + ", Duracion=" + duracion + "]";
	}


}
